package exceptionHandling;

public class ExceptionDemo {
	
	
	public static int fact(int n) throws NegativeNumberException {
		if(n < 0) {
			throw new NegativeNumberException();
		}
		int ans = 1;
		for(int i= 2 ; i <= n ; i++) {
			ans *= i;
		}
		return ans;
	}
	
	public static int divide(int a, int b) throws DivideByZeroException {
		if(b == 0) {
			
			throw new DivideByZeroException();
//			throw new ArithmeticException();
		}
		return a/b;
	}
	

	public static void main(String[] args) {
		
		try {
			divide(10,5);
			System.out.println(fact(-1));
			System.out.println("Done");
		} catch (DivideByZeroException e) {
			// TODO Auto-generated catch block
			System.out.println("Divide By zero Exception raised");
//			e.printStackTrace();
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			System.out.println("you have passed a negative number");
//			e.printStackTrace();
		}finally {
			System.out.println("Finally");                           //it will execute whatever happpens 
		}

	}

}
