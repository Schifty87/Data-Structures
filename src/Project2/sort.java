package Project2;

import java.util.ArrayList;
import java.util.Stack;

public class sort {

	public sort(){
		
	}
	
	public ArrayList<Integer> DFS(String start, String end, int[][] X, ArrayList<String> Y){
		
		//figure out dimensions of 2D array
		int L = Y.size();
		
		//create new stack
		Stack<Integer> S = new Stack<Integer>();
		
		//create new arraylist to store locations
		ArrayList<Integer> goal = new ArrayList<Integer>();
		
		//locate the integer for the starting location
		int START = Y.indexOf(start);
		int END = Y.indexOf(end);
		
		//place starting point into stack
		S. push(START);
		goal.add(S.peek());
		
		while(!S.isEmpty()){
			int TOP = S.peek();
			
			if(TOP == END){
				return goal;
			}
			//goal.add(TOP);
			int counter = 0;
			for(int i=0; i<L; i++){
				if(X[TOP][i] == 1){					
					//determine if i has been visited
					if(!goal.contains(i)){
						//add to arraylist
						goal.add(i);
						//add counter
						counter++;
						//add to stack
						S.add(i);
						if(i == END){
							return goal;
						}
					}
				}		
			}//end for
			//if counter = 0, the node has no children
			if(counter == 0){
				S.pop();
			}				
		}//end while	
		return null;
		
		/*while(!goal.isEmpty()){
			//find string item located inside integer item of arraylist
			int A = St.pop();
			System.out.print(Y.get(A));
		}*/
	}//end DFS()
	
}
