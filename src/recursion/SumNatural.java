package recursion;

public class SumNatural {
	
	public static int sumofNatural(int n) {
		if(n == 0) return 0;
		int smalloutput = sumofNatural(n-1);
		int ans = n + smalloutput;
		return ans;
	}

	public static void main(String[] args) {
		
		int n = 10;
		System.out.println(sumofNatural(n));

	}

}
