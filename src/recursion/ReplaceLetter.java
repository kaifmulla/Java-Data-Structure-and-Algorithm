package recursion;

public class ReplaceLetter {
	
	public static String replaceletter(String str, char a, char b) {
		
		if(str.length() == 0) {
			String ans = "";
			return ans;
		}
		
		String ans = replaceletter(str.substring(1), 'x', 'y');
		if(str.charAt(0) == 'x') {
			ans = b + ans;
			return ans;
		}
		else {
			ans = str.charAt(0) + ans;
			return ans;
		}
		
	}

	public static void main(String[] args) {
		
		String str = "abxcxwxux";
		System.out.println(replaceletter(str,'x','y'));

	}

}
