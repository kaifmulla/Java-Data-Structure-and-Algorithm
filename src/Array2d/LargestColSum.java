package Array2d;

public class LargestColSum {
	
	public static int largestcolsum(int[][] arr) {
		int sum = 0;
		int lsum = 0;
		int cols = arr[0].length;
		for(int i = 0 ; i < cols ; i++) {
			sum = 0;
			for(int j = 0 ; j < arr.length ; j++) {
				sum += arr[j][i];
			}
			if(sum > lsum) {
				lsum = sum;
			}
			
		}
		return lsum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{11,2,3},{11,2,3},{1,12,3}};
		int ans = largestcolsum(arr);
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
		
		
		
		System.out.println(ans);

	}

}
