public class Fibonacci1 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Total ways to climb the stairs are " +  count(n) + ".");
	}
	
	public static int fib1(int n) {
		if ( n<= 1) {
			return n;
		}else {
			return ( fib1(n-1) + fib1(n-2));
		}
	}
	public static int count(int n) {
		return fib1(n+1);
	}
}
