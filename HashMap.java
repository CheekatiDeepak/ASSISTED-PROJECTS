package TypesOfMaps;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(1, "Mango");
	map.put(2, "Apple");
	map.put(3, "Grapes");
	map.put(4, "Banana");
	System.out.println("Iterating HashMap...");
	for(Map.Entry m : map.entrySet()) {
		System.out.println(m.getKey() + "" +m.getValue());
	}
		

	}

}
