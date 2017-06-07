package Project4;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class sorting {

	public sorting(){}
	
	public void bluegill(Object[] X){
		
		boolean ryan = true;
		do{
			int change = 0;
				for(int i=0; i<X.length-1; i++){			
					int Y = (((tweet) X[i]).getPopularity());
					int Z = (((tweet) X[i+1]).getPopularity());
					String A = (((tweet) X[i]).getUser());
					String B = (((tweet) X[i+1]).getUser());
					char C = A.charAt(0);
					char D = B.charAt(0);
					int T = (((tweet) X[i]).getUser()).toLowerCase().compareTo((((tweet) X[i+1]).getUser().toLowerCase()));
					
					if(Y < Z){
						Object dummy = new tweet(Z, Z, null, null, null);
						dummy = X[i];
						X[i] = X[i+1];
						X[i+1] = dummy;
						change++;
					}
					
					if(Y == Z){
						if(T > 0){
							Object dummy = new tweet(Z, Z, null, null, null);
							dummy = X[i];
							X[i] = X[i+1];
							X[i+1] = dummy;
							change++;
						}
					}
				}//end for
			if(change ==0){
				break;
			}
			
		}while(ryan ==true);//end while
		
		
			for(int i=0; i<X.length; i++){
				String keyword = (((tweet) X[i]).getKeyword());
				String text = (((tweet) X[i]).getText());
				String user = (((tweet) X[i]).getUser());
				int popularity = (((tweet) X[i]).getPopularity());
				int ID = (((tweet) X[i]).getID());
				System.out.printf("%-4d %-8d %-20s %-20s %s", popularity, ID, keyword, user, text);
				System.out.println();
				
			}
		
	}
	
	Multimap<String, Object> aMultiMap = ArrayListMultimap.create();
	public Multimap load(String file){
		try(Scanner scanner = new Scanner(new File(file))){
			while(scanner.hasNext()){
				String [] X = scanner.nextLine().split(",");
				
				//convert string values to integer
				int Y = Integer.valueOf(X[0]);
				int Z = Integer.valueOf(X[1]);
				
				tweet NT = new tweet(Y, Z, X[2], X[3], X[4]);
				String KW = NT.getKeyword();
				
				//create new MultiMap object
				aMultiMap.put(KW, NT);
			}	
		}catch(Exception e){
			System.out.print("error");
		}
		return aMultiMap;
	}
		
}		
		
	
	

