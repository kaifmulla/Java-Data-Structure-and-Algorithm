package recursion;

public class ReplacePi {
	
	
	
	public static String replacePi2(String str) {
		if(str.length() <= 1) {
			return str;
		}
		
		
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			String smalloutput = replacePi2(str.substring(2));
			return "3.14" + smalloutput;
		}
		else {
			String smalloutput = replacePi2(str.substring(1));
			return str.charAt(0) + smalloutput;
		}
		
	}
	
	
	
	
	
	public static String replacePi(String str) {
		if(str.length() == 0) {
			return str;
		}
		
		String ans = replacePi(str.substring(1));
		if(str.length() > 1) {
			if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
				ans = "3.14" + ans.substring(1);
				return ans;
			}
			else {
				ans = str.charAt(0)+ ans;
				return ans;
			}
		}
		else {
			ans = str.charAt(0)+ ans;
			return ans;
		}
	}

	public static void main(String[] args) {
		
		String str = "apirppipipi";
		System.out.println(replacePi(str));
		
		System.out.println(replacePi2(str));

	}

}
