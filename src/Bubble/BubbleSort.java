package Bubble;

/** This program sorts an array's values into
ascending order.
The technique is to make several passes through
the array. On each pass, successive pairs of elements
are compared. If a pair is in increasing order (or the value
are identical), we leave the values as they are. If a pair is
in decreasing order, their values are swapped in
the array. ***/



public class BubbleSort {
    public static void main(String[] args ) {

        int[] x = {35, 26, 45, 19, 74, 56, 44, -3, 3, 12, 5, 2};
		//sorting array x by calling bubbleSort() method
		bubbleSort(x);
		//print the sorted array
		for (int i = 0; i<x.length; i++)
			System.out.print(x[i] + " ");


    }//end main()

    public static void bubbleSort(int[] a) {
		for (int pass = 0; pass<a.length-1; pass++){
			for (int i = 0; i<a.length -1; i++){ //length is one more than the actual length (java starts at 0)
				if(a[i]>a[i+1]){
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;}//end if
			}//for i
		}//end for pass

    }//end bubbleSort()
}//end class