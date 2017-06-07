package HashTable;

import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/*
 * 1-> many mapping
 * <String, LinkedList<String>
 * "A" -> "Apple" "Agriculture" "Art"
 * "B" -> "Banana "Beach"
 * "C" -> "Cat" "Car"
 */

public class GoogleMultiMap {

	public static void main(String[] args) {
		
		//Declaration and create the multimap
		Multimap<String, String> aMultiMap = ArrayListMultimap.create();
		
		//Populate the map
		aMultiMap.put("A", "Apple");
		aMultiMap.put("A", "Agriculture");
		aMultiMap.put("B", "Banana");
		aMultiMap.put("B", "Beach");
		aMultiMap.put("C", "Cat");
		aMultiMap.put("C", "Car");
		aMultiMap.put("A", "Art");
		
		//Navigate through the multimap
		Set<String> kSet = aMultiMap.keySet();
		for(String aKey: kSet){
			System.out.print(aKey + ": ");
			System.out.println(aMultiMap.get(aKey));
		}
		

	}

}
