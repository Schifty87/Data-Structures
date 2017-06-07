package Project2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class read{

	String file;
	//array that will be used to identify cities from their index
	ArrayList<String> city = new ArrayList<String>();
	//dummy array to set up 2D binary array
	ArrayList<String> city2 = new ArrayList<String>();
	
	//empty constructor
	public read(){
		
	}
	
	//read text file and create array
	public ArrayList<String> original(String file){
		
		try(Scanner scanner = new Scanner(new File(file))){
			while(scanner.hasNext()){
				String [] X = scanner.nextLine().split(" ");
				//determine if this city has already been read
				//link the two cities together in a 2D array
				
				
				if(!city.contains(X[0])){
					city.add(X[0]);
				}
				if(!city.contains(X[1])){
					city.add(X[1]);
				}
			}			
		}catch(Exception e){
			System.out.print("error");
		}
		return city;
		//return true;			
	}//end original()
	
	//put everything in a 2-D array to illustrate connections
	public int[][] graph(String file){ 
		int[][] conn = new int[city.size()][city.size()];
		
		try(Scanner scanner = new Scanner(new File(file))){
			while(scanner.hasNext()){
				String [] X = scanner.nextLine().split(" ");
				//determine if this city has already been read
				//link the two cities together in a 2D array
		
				if(!city2.contains(X[0])){
					city2.add(X[0]);
				}
				if(!city2.contains(X[1])){
					city2.add(X[1]);
				}
				
				int x = city.indexOf(X[0]);			
				int y = city.indexOf(X[1]);
				
				conn[x][y] = 1;
				conn[y][x] = 1;
			}			
		}catch(Exception e){
			System.out.print("error");
		}
		return conn;
		/*
		 * check array if needed - must change return type to int[][]
		for(int i=0; i<city.size(); i++){
			for(int j=0; j<city.size(); j++){
				System.out.print(conn[i][j]);
		}
			System.out.println();
		}//end outer for*/
	}		
}//end class
		

	

