package generics;

public class Print {
	
	public static<T extends printInterface> void printarr(T arr[]) {
		
		for(int i = 0 ; i < arr.length ; i++) {
//			System.out.println(arr[i]);
			arr[i].print();
			
		}
	}

	public static void main(String[] args) {
		
		
//		Integer arr[] = {1,2,3,4};
//		
//		printarr(arr);
//		
//		String st[] = new String[4];
//		for(int i = 0 ; i < st.length ; i++) {
//			st[i] = "abcc";
//		}
//		printarr(st);
////		
		
		Vehicle v[] = new Vehicle[5];
		for(int i = 0 ; i < v.length ; i++) {
			v[i] = new Vehicle(10*i,"white");
			v[i].color = "white";
		}
		printarr(v);
		
		Student s[] = new Student[5];
		for(int i = 0 ; i< s.length ; i++) {
			s[i] = new Student(i+1);
		}
		printarr(s);
	}

}
