package Basic;

public class OurMapUseImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new Map<>();
		
		for(int i = 0; i< 20; i++) {
			map.insert("abc" + i, 1 + i);
			System.out.println("i = " + " lf = " + map.loadFactor());
		}
		map.removeKey("abc3");
		map.removeKey("abc4");

		for(int i = 0; i< 20; i++) {
			
			System.out.println("abc" + i + ":" + map.getValue("abc" + i));
		}
		
	}

}
