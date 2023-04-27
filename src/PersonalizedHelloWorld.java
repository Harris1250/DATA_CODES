import java.util.*;
public class PersonalizedHelloWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name;
		while(true) {
			System.out.println("Please enter your name:");
			name = in.nextLine();
			if(name.length() > 0) {
				break;
			}
		}
		System.out.println("Hello, " + name + "!");
	}

}
