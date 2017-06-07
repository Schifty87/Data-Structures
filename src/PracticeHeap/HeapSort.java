package PracticeHeap;

public class HeapSort {

	private int heapArray[];
	private int n, left, right, largest;
	
	//print the array
	public void printArray(int array[]){
		
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");			
		}
		System.out.println();
	}
	
	//exchange - swap values
	public void exchange(int array[], int i, int j){
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	//heapify
	//heapify calls heapify - RECURSION
	public void heapify(int array[], int i){
		
		left = 2*i+1;
		right = 2*i+2;
		
		if(left <= n && array[left] > array[i])
			largest = left;
		else
			largest = i;
		
		if(right <= n && array[right] > array[largest])
			largest = right;
		
		if(largest != i){
			//exchange is swap method
			exchange(array, largest, i);
			heapify(array, largest);
		}	
	}
	
	//build heap from given array
	public void buildHeap(int array[], int size){
		
		n = size-1;
		for(int i=n/2; i>= 0; i--){
			heapify(array,i);
		}		
	}
	
	//sort array in ascending order
	public void heapSort(int array[]){
		
		heapArray = array;
		int size = heapArray.length;
		buildHeap(heapArray, size);
		System.out.println("this is the original heap");
		printArray(heapArray);
		//still more to come
		
		for(int i = n; n>0; i--){
			exchange(heapArray,0,i);
			n--;
			heapify(heapArray,0);
			printArray(heapArray);
		}
	}
	
	public static void main(String[] args){
		
		int data[] = {4,1,3,2,16,9,10,14,8,7};
		
		HeapSort obj = new HeapSort();
		obj.heapSort(data);
	}
	
}
