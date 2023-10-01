package Array2d;

import java.util.Scanner;

public class TakeInput {
	
	
	public static void printArr2d(int arr[][]) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[0].length ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static int[][] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int rows = s.nextInt();
		System.out.println("Enter the number of col");
		int cols = s.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[1].length ; j++) {
				System.out.println("Enter the value for "+ i+ "th row "+j+"th column");
				arr[i][j] = s.nextInt();
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr2d = takeInput();
		printArr2d(arr2d);
	}

}
