import java.util.*;
public class GuessMyNumber {

	public static void main(String[] args) {

		int low = 0, high = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = in.nextInt();
		high = n;
		System.out.println("Welcome to Guess My Number!");
		System.out.println("Please think of a number between 0 and " + (n-1) + ".");
		while(n>0) {
			int l = (low + high) / 2;
			System.out.println("Is your number: " + l + "?");
			System.out.println("Please enter C for correct, H for too high, or L for too low");
			System.out.print("Enter your response (H/L/C): ");
			char c = in.next().charAt(0);
			if(c =='C') {
				System.out.println("Thank you for playing Guess My Number!");
				break;
			}
			else if(c == 'H') {
				high = l;
			}
			else if(c == 'L') {
				low = l;
			}
			else {
				while(c!= 'H' && c!= 'L' && c!= 'C') {
					System.out.println("Enter your response (H/L/C): ");
					c = in.next().charAt(0);
				}
				if(c == 'C') {
					System.out.println("Thank you for playing Guess My Number!");
					break;
					}
				else if (c == 'L') {
					low = l;
				}
			}
		}
	}
}
