package ArraysDS;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		
		
		int arr1[] = {3,8,10,25,34,66,89};
		int arr2[] = {1,5,6,11,35,40,70,90,91,92,93,94};
		
		
//		int i = arr1.length;
//		int j = arr2.length;
		int i = 0;
		int j = 0;
		int k = 0;
		int ans[] = new int[arr1.length+arr2.length];
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				ans[k++] = arr1[i++];
			}
			else {
				ans[k++] = arr2[j++];
			}
		}
		while(i < arr1.length) {
			ans[k++] = arr1[i++];
		}
		while(j < arr2.length) {
			ans[k++] = arr2[j++];
		}
		
		
		for(int p : ans) {
			System.out.print(p+" ");
		}
	}

}
