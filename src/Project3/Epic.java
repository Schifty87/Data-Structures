package Project3;

import java.util.Scanner;

public class Epic {

	Epic(){
	}
	
	public void tweet(BinarySearchTree<String> StringTree, String sentence) {
		
		String[] Z = sentence.split(" ");
		
		for(int i=0; i<Z.length; i++){
			if(Z[i].charAt(0)==('#')){
				String name = Z[i].substring(1);
				
				int X = StringTree.getPreOrder(StringTree, name);
				String Y = StringTree.getInt(StringTree, name);
				
				if(X==1){
					System.out.println("#" + name.toLowerCase() + " is one of the top-100" + "(" + "number " + Y + ")" + "trending tweets");		
				}
				else{
					System.out.println("#" + name.toLowerCase() + " is not one of the top-100 tending tweets");			
				}
			}
		}
	}



}
