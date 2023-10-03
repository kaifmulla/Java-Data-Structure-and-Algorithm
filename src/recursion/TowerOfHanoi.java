package recursion;

public class TowerOfHanoi {
	
	public static void tohSteps(int n, char source, char helper, char destination) {
		if(n == 1) {
			System.out.println(source+" "+destination);
			return;
		}
		tohSteps(n-1,source,destination,helper);
		System.out.println(source+" "+destination);
		tohSteps(n-1,helper,source,destination);
	}

	public static void main(String[] args) {
		
		int n = 2;
		tohSteps(n,'a','b', 'c');
		
	}
}
