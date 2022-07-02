package generics;

public class PairUse {

	public static void main(String[] args) {
		
		Pair<String, Integer> p = new Pair<String, Integer> ("ab" , 2);
		p.setFirst("def");
		String s = p.getFirst();
		System.out.println(s);
		
		Pair<Integer , Character> p1 = new Pair<Integer , Character>(2, 'a');
		
		Pair<Character, Character> p2 = new Pair<> ('a' , 'b');
		
		Pair<Integer , Integer> p3 = new Pair<>(10, 12);
		
		Pair<Pair<Integer, Integer> , Integer> p4 = new Pair<>(p3 , 23);
		
		
		System.out.println(p3.getFirst());
		System.out.println(p4.getFirst().getFirst());
		System.out.println(p4.getFirst().getSecond());

	}

}
