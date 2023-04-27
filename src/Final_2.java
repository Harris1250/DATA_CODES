import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Final_2{
	public static int evaluate(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        int operand1, operand2;
        for (String token : tokens) {
            switch (token) {
                case "":
                    operand2 = stack.pop();
                    operand1 = stack.pop();
                    stack.push(operand1 + operand2);
                    break;
                case "+":
                    operand2 = stack.pop();
                    operand1 = stack.pop();
                    stack.push(operand1 * operand2);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        return stack.pop();
	}
	
	public static void main(String[] args){
		String[] tokens = {"2", "1", "+", "4", ""};
        int result = evaluate(tokens);
        System.out.println("Answer: " + result);
    }
}
/*
 * the time complexity is O(n) because we iterate through the expression only once. 
 * the space complexity is O(n) because we store the operands and the results in the stack.
 */