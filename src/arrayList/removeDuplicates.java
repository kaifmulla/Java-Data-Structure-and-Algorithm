package arrayList;

import java.util.ArrayList;


public class removeDuplicates {
	
	public static ArrayList removeConsecutiveDup(int arr[]) {
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(arr[0]);
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] != ans.get(ans.size()-1)) {
				ans.add(arr[i]);
			}
		}
		return ans;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {10,10,10,20,20,30,40,10,10,10,10,40,40,40,40,40,40,50,70,90,90,90};
		
		ArrayList<Integer> ans = removeConsecutiveDup(arr);
		
		System.out.println(ans);

	}

}
