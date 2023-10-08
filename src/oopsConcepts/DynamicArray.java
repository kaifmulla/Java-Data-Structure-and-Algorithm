package oopsConcepts;

public class DynamicArray {
	
	private int nextElement = 0;
	private int arr[];
	
	public DynamicArray() {
		arr = new int[5];
		nextElement = 0;	
	}
	// check if empty
	
	public boolean isEmpty() {
		if(nextElement > 0) {
			return false;
		}
		return true;
	}
	
	public int size() {
		return nextElement;
	}
	
	//setting element
	public int set(int index, int val) {
		if(nextElement <= index) {
			return -1;
		}
		arr[index] = val;
		return val;
	}
	//getting element
	public int get(int index) {
		if(nextElement <= index) {
			return-1;
		}
		else {
			return arr[index];
		}
	}
	
	public int add(int elem) {
		if(nextElement >= arr.length) {
			arr = increaseSize(arr);
			arr[nextElement] = elem;
			nextElement++;
			return elem;
		}
		arr[nextElement] = elem;
		nextElement++;
//		System.out.println(elem);  
		return elem;
		
	}
	private int[] increaseSize(int[] arr) {
		// TODO Auto-generated method stub
		
		int newarr[] =  new int[2*arr.length];
		for(int i = 0 ; i < arr.length ; i++) {
			newarr[i] = arr[i];
		}
		
		return newarr;
	}
	
	
	public int remove() {
		if(nextElement == 0) {
			return -1;
		}
		else {
			nextElement--;
			return arr[nextElement];
		}
	}
	
	

}
