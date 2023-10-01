package recursion;

public class factorial {
	public static int fact(int n) {
		if(n == 3) return 6;
		
		int smalloutput = fact(n-1);
		int ans  = n * smalloutput;
		return ans;
	}

	public static void main(String[] args) {

		int n = 5;
		System.out.println(fact(5));

	}

}
