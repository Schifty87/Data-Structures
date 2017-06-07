package tester;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class read {

	String file;
	// set up binary array 2D
	ArrayList<String> city2 = new ArrayList<String>();
	int[][] cArray = new int[10][10];
	//make array to be used for identifying the city from their index
	ArrayList<String> city1 = new ArrayList<String>();
	//read in file
	public read(){
		
	}
	
	//create arrayList
	public ArrayList<String> original(String file){
		try(Scanner scanner = new Scanner(new File(file))){
			while(scanner.hasNext()){
				String [] X = scanner.nextLine().split(" ");
				if(!city1.contains(X[0])){
					city1.add(X[0]);
				}
				if(!city1.contains(X[1])){
					city1.add(X[1]);
				}
			}
		}catch(Exception e){
			System.out.println("error");
		}
		return city1;
	}
	
	//create graph
	public void graph(String file){
		try(Scanner scanner = new Scanner(new File(file))){
			while(scanner.hasNext()){
				String [] X = scanner.nextLine().split(" ");
				if(!city2.contains(X[0])){
					city2.add(X[0]);
				}
				if(!city2.contains(X[1])){
					city2.add(X[1]);
				}
				int x = city1.indexOf(X[0]);
				int y = city1.indexOf(X[1]);
				
				cArray[x][y] = 1;
				cArray[y][x] = 1;
			}
		}catch(Exception e){
			System.out.print("error");
		}
		//System.out.print(cArray[0][1]);
		for(int i = 0; i < city1.size(); i ++){
			for(int j = 0; j < city1.size(); j ++){
				System.out.print(cArray[i][j]);
			}
			System.out.println();
		}
	}//end graph
	
}//end of read class