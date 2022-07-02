package Basic;

import java.util.HashMap;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		//insert
		
		map.put("abc", 1);
		map.put("def", 2);
		// size
		
		System.out.println("size: " + map.size());
		
		// check Presence
		
		if(map.containsKey("abc")) {
			System.out.println("Has abc");
		}
		if(map.containsKey("abc1")) {
			System.out.println("Has abc1");
		}
		if(map.containsValue(2)) {                            // O(n)
			System.out.println("has 2 as well");
		}
		// get value
		
		int v = 0;
		if(map.containsKey("abc")) {
			v = map .get("abc");
		}
		System.out.println(v);
		
		//remove
		int s = map.remove("abc");
		System.out.println(s);
		
		// iterate
		Set<String> keys = map.keySet();  // we ValueSet also
		for(String str : keys) {
			System.out.println(str);
		}
	}

}
