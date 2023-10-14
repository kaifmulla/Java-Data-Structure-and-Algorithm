package generics;

public class PairUse {

	public static void main(String[] args) {
		
		Pair<String, Integer> p = new Pair<String, Integer>();
		Pair<String, String> k = new Pair<String, String>();
		
//		System.out.println(p.getFirst()+" "+p.getSecond());
		
		Pair<Pair<String,Integer>,Pair<String, String>> pp = new Pair<>();
		pp.setFirst(p);
		pp.setSecond(k);
		k.setSecond("kaifu");
//		System.out.println(pp.getFirst()+" "+pp.getSecond());
		System.out.println(pp.getSecond().getFirst());
		
		Vehicle v[] = new Vehicle[5];
		for(int i = 0 ; i < v.length ; i++) {
			v[i] = new Vehicle(10*i,"white");
		}
		
		
		
		
		
//		Pair<Double> p = new Pair<Double>(9.99,0.99);
//		System.out.println(p.getFirst()+" "+p.getSecond());
//		
//		Pair<Integer> pI = new Pair(10,20);
//		pI.setFirst(11);
//		pI.setSecond(21);
//		System.out.println(pI.getFirst()+" "+pI.getSecond());

	}

}
