package Project4;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class main1 {

	public static void main(String[] args) {			
		sorting K = new sorting();
		String file = "project4.csv";
		Multimap<String, Object> aMultiMap = K.load(file);	
		System.out.print("What keyword would you like to search for? ");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();	
		ArrayList<String> used = new ArrayList<String>();
		int found = 0;
		for (String key : aMultiMap.keys()){	
			if(word.equalsIgnoreCase(key) && !used.contains(word)){
				Object[] X = aMultiMap.get(key).toArray();
				used.add(word);
				K.bluegill(X);
				found++;
			}
		}
		if(found==0){
			System.out.println("Keyword not found");
		}
	}
}
