package Practice;

import java.util.*;

public class TreeSetDemo {

	public static void main(String args[]){
		
		//create a tree set
		TreeSet<String> ts = new TreeSet<String>();
		
		//insert an element to this set
		ts.add("A");
		ts.add("C");
		ts.add("D");
		ts.add("B");
		ts.add("F");
		ts.add("E");
		
		//Print out this set
		System.out.println("This set contains " + ts);
		
		ts.add("A");
		//check to see if duplicates are included
		System.out.println("After adding A, This set contains " + ts);
		
		ts.remove("E");
		
		//look at new tree set
		System.out.println("After removing E, This set contains " + ts);
		
		TreeSet<String> ts1 = new TreeSet<String>();
		
		ts1.add("A");
		ts1.add("B");
		ts1.add("G");
		ts1.add("H");
		
		System.out.println("ts1 contains " + ts1);
		
		//add content of ts to ts1 - Union
		ts.addAll(ts1);
		System.out.println("After adding ts and ts1" + ts);
		
		//set membership operator
		if(ts.contains("G")){
			System.out.println("ts contains G");
		}
		else{
			System.out.println("ts does not contain G");
		}
		
		if(ts.containsAll(ts1)){
			System.out.println("ts contains ts1");
		}
		else{
			System.out.println("ts does not contain ts1");
		}
		
		System.out.println("Using iterator to access each element in the list");
		Iterator iterSet = ts.iterator();
		
		while(iterSet.hasNext()){
			System.out.print(iterSet.next()+"\t");
		}
		
	}
}
