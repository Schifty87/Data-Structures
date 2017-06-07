package Practice;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args){
		
		//create a hash set
		HashSet<String> hs = new HashSet<String>();
		
		//add elements to hash set
		hs.add("A");
		hs.add("C");
		hs.add("D");
		hs.add("B");
		hs.add("F");
		hs.add("E");
		
		//print original hash set
		System.out.println("original hash set " + hs);
		
		System.out.println("Navigator");
		Iterator iterSet = hs.iterator();
		
		//navigating through hash set
		while(iterSet.hasNext()){
			System.out.print(iterSet.next()+"\t");
		}
		
		System.out.println();
		hs.remove("A");
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("A");
		hs1.add("B");
		hs1.add("E");
		//set difference operator
		hs.removeAll(hs1);
		System.out.println("After removing hs1, we have " + hs);
		
		HashSet<String> A = new HashSet<String>();
		A.add("A");
		A.add("B");
		A.add("C");
		A.add("D");
		A.add("E");
		
		HashSet<String> B = new HashSet<String>();
		B.add("C");
		B.add("D");
		B.add("E");
		B.add("F");
		B.add("G");
		
		System.out.println("A is " + A);
		System.out.println("B is " + B);
		
		HashSet<String> C = new HashSet<String>();
		A.removeAll(B);
		B.removeAll(A);
		C.addAll(B);
		
		System.out.println("Intersection between A and B is " + C);
		
		
	}
}
