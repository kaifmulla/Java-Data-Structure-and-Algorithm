package recursion;

public class MergeSort {
	
	public static int[] mergeSort(int arr[]) {
		if(arr.length <= 1) {
			return arr;
		}
		
		int midIndex = arr.length/2;
		
		int left[] = new int[midIndex];
		for(int i = 0 ; i < midIndex ; i++) {
		    left[i] = arr[i];
		}
		int right[] = new int[arr.length - midIndex];
		int k = 0;
		for(int j = midIndex ; j < arr.length ; j++) {
		    right[k] = arr[j];
		    k++;
		}
		
		int leftarr[] = mergeSort(left);
		int rightarr[] = mergeSort(right);
		
		int ans[] = new int[leftarr.length + rightarr.length];
		int s = 0;
		int i = 0;
		int j = 0;
		while(i < leftarr.length && j < rightarr.length) {
			if(leftarr[i] < rightarr[j]) {
				ans[s++] = leftarr[i++]; 
			}
			else {
				ans[s++] = rightarr[j++];
			}
		}
		while(i < leftarr.length) {
			ans[s++] = leftarr[i++];
		}
		while(j < rightarr.length) {
			ans[s++] = rightarr[j++];
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		int arr[] = {98,10,14,5,3,20,1,9,44};
//		int dummy[] = new int[arr.length];
		
		int sortedarray[] = mergeSort(arr);
		
		for(int i : sortedarray) {
			System.out.print(i+" ");
		}

	}

}
