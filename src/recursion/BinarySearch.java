package recursion;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int x, int si, int ei) {
		if(si > ei) {
			return -1;
		}
		
		int midIndex = (si + ei) / 2;
		if(arr[midIndex] == x) {
			return midIndex;
		}
		else if(arr[midIndex] < x) {
			return binarySearch(arr,x,midIndex+1,ei);
		}
		else {
			return binarySearch(arr,x,si,midIndex-1);
		}
		
		
	}

	public static void main(String[] args) {

		int arr[] = {1,3,4,6,8,9,10,14};
		int x = 14;
		System.out.println(binarySearch(arr,x,0,arr.length-1));

	}

}
