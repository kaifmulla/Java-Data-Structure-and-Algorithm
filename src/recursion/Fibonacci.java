package recursion;

public class Fibonacci {
	
	
	public static int fibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		int ans = fibonacci(n-1) + fibonacci(n-2);
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(6));

	}

}
