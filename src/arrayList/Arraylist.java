package arrayList;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(1, 9999);
//		arr.remove(2);
		System.out.println(arr.size());
		System.out.println(arr);
		for(int i = 0 ; i < arr.size() ; i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
		//enhanced for loop - for each loop
		
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}

}
