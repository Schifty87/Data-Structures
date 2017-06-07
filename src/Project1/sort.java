package Project1;

import java.io.File;
import java.util.Scanner;

import Project1.ListNode;

public class sort {

	
	LinkedList L = new LinkedList();
	String file;
	
	public sort(){
		file = "titanic.txt";
	}
	
	
	public LinkedList original(String file){	
		try(Scanner scanner = new Scanner(new File(file))){
			while(scanner.hasNext()){
			String [] X = scanner.nextLine().split(",");
			passengers pass = new passengers(X[0], X[1], X[2], X[3], X[4]);
			L.insertAtTail(pass);
			}			
		}catch(Exception e){
			System.out.print("error");
		}		
		//L.printList();
		return L;		
	}//end original()
	
	
	
	//selection sort
    public LinkedList firstSort(LinkedList L){
        ListNode outer = L.getFirstNode();
    
        while(outer.getNextNode() != null){
            ListNode minNode = outer;
            String outterSurvived =((passengers) outer.getData()).getSurvived().trim(); 
            String outterAge =((passengers) outer.getData()).getAge().trim(); 
            String outterRank =((passengers) outer.getData()).getRank().trim(); 
            ListNode inner = outer.getNextNode();
            while(inner != null){
                String innerSurvived =((passengers) inner.getData()).getSurvived().trim(); 
                String innerAge =((passengers) inner.getData()).getAge().trim();
                String innerRank =((passengers) inner.getData()).getRank().trim();
                
                
                if(outterSurvived.compareTo(innerSurvived) < 0 || outterRank.compareTo(innerRank) < 0)
                	
                	
                			minNode = inner;
                		
                
                inner = inner.getNextNode();
            }            
            if (minNode != outer) {        
                    //ListNode A = (ListNode) inner.getData();
                    //ListNode B = (ListNode) outer.getData();
                    passengers temp = (passengers) minNode.getData();
                    minNode.setData(outer.getData());
                    outer.setData(temp);    
            }
        outer = outer.getNextNode();    
        }    
        //L.printList();
        return L;
    }

  
}
