package vivekananda.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class _30_to_39 {
	
	public static void main(String args[]) {
		demo();
	}
	
	public static void demo() {

		Map<Object,LinkedList<Object>> multiMap = new HashMap<>();
		
		HashMap<Integer, String> map = new  HashMap<Integer, String>();
		map.put(13, "Jay");
		map.put(13, "kay");
		map.put(13, "lay");
		
		LinkedList<Object> list = new LinkedList<Object>();
		list.add("Jay");
		
		multiMap.put(13, list);

		multiMap.get(13).add("Kay1");
		multiMap.get(13).add("Kay2");
		multiMap.get(13).add("Kay3");
		
		/*list.add("Kay");
		list.add("Lay");
		*/
		
		System.out.println(">>"+map.get(13));
		System.out.println(">>"+multiMap.get(13));
		
		
	}    
	
}//end class
