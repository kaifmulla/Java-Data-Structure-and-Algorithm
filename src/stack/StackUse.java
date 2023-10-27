package stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException {
		
		StackUsingArray stack = new StackUsingArray();
		
		

		stack.push(40);
		stack.push(30);
		stack.push(90);
		stack.push(80);
		stack.push(50);
		stack.push(30);
		stack.push(40);
		stack.push(30);
		stack.push(90);
		stack.push(80);
		stack.push(80);
	
//		stack.top();
//		stack.pop();
//		stack.pop();
		
//		stack.size();
//		stack.isEmpty();
		
		System.out.println(stack.size());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.top());
//		System.out.println(stack.size());
			

	}
}
