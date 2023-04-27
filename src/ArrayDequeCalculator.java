import java.util.ArrayDeque;
import java.util.Deque;

	public class ArrayDequeCalculator{
	
	// Applies the operator to the numbers and returns the result
	public static int applyOperator(char operator, int num1, int num2){
		switch(operator){
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / num2;
		default:
			return 0;
		}
	}
	
	// Methods that evaluates the expression and returns the result in the deque
	public static int evaluateExpression(String expression){
		// Deque that holds the operands,
		Deque<Integer> operands = new ArrayDeque<Integer>();
		
		// Loop that goes through the entire string 
		for(int i = 0; i < expression.length(); i++){
			// Looks at every character in the string
			char ch = expression.charAt(i);
			
			// if the character is space, we skip the loop and move on to the next
			if(ch == ' ') {
				continue;
				}
			
			// If the ch is an operator, it pops the numbers out of the operands queue 
			if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				int num2 = operands.pop();
				
				int num1 = operands.pop();
				
				// applies the operator
				int result = applyOperator(ch, num1, num2);
				
				// pushes the result to the queue
				operands.push(result);
				
				// if ch is an operand, just push the ch as an integer to the queue
				}
			else{
				operands.push(Character.getNumericValue(ch));
			}
		}
		
		// pop the value from the queue
		return operands.pop();
	}
	public static void main(String[] args){
		// The expression
		String expression = "3 5 + 1 -";
		
		// calls the evaluateExpression and stored as the result
		int result = evaluateExpression(expression);
		
		// prints the result
		System.out.println("Answer: " + result);
	}
}