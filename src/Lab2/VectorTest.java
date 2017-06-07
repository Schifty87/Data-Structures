package Lab2;

import java.util.Vector;

public class VectorTest {
	
	public void printVector(Vector aVector){
		for(int i=0; i<aVector.size(); i++){
			System.out.println(aVector.get(i).toString());
		}
	}
	
	public int computeSum(Vector aVector){
		
		int sum = 0;
		for(int i=0; i<aVector.size(); i++){
			sum += ((Integer) aVector.get(i));
		}
		return sum;	
	}
	
	public static void main(String[] args){
		
	//In the main method: declare a Vector  that contains 6 elements. Initialize it as follows: {1,4,6,-1,-3,0}	
	final int size = 6;
	Vector<Integer> aVector = new Vector<Integer>(size);
	aVector.add(1);
	aVector.add(4);
	aVector.add(6);	
	aVector.add(-1);
	aVector.add(-3);
	aVector.add(0);
	
	VectorTest obj = new VectorTest();
	obj.printVector(aVector);
	System.out.println(" Sum of all values is " + obj.computeSum(aVector));
	
	//find the location of -1
	int index = aVector.indexOf(-1);
	
	//insert -2 before -1
	aVector.add(index, -2);
	
	//insert 10 at the end
	aVector.add(10);
	
	//print the new array
	obj.printVector(aVector);
	
	//declare integer, otherwise you are finding the index
	//aVector.remove(new Integer (-3));
	aVector.removeElement(-3);
	obj.printVector(aVector);
	
	}
}
