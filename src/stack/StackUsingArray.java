package stack;

public class StackUsingArray {

	private int data[];
	private int topIndex;
	
	public StackUsingArray() {
		data = new int[10];
		topIndex = 0;
	}
	
	public int size() {
		return topIndex;
	}
	public boolean isEmpty() {
		
		return topIndex == 0;

	}
	public void push(int element) {
//		topIndex = topIndex+1;
		if(topIndex < data.length) {
			data[topIndex] = element;
			
		}else {
			data = dynamicArray();
			data[topIndex] = element;
		}
		topIndex++;
		
		
	}
	private int[] dynamicArray() {
		// TODO Auto-generated method stub
		int temp[] = data;
		data = new int[2*temp.length];
		for(int i = 0 ; i < temp.length ; i++) {
			data[i] =  temp[i];
		}
		return data;
	}

	public int pop() {
		if(topIndex == 0) {
			return -1;
		}
		int popped = data[topIndex-1];
		data[topIndex-1] = 0;
		topIndex = topIndex-1;
		return popped;
//		
	}
	public int top()
	{
		if(topIndex == 0) {
			return -1;
		}
		return data[topIndex-1];
		
	}
}
