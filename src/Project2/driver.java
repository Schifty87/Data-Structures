package Project2;

import java.util.ArrayList;
import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		read x = new read();
		sort y = new sort();
	
		String file = "cities1.txt";
		ArrayList<String> B = x.original(file);
		
		
		for(int i=0; i<B.size(); i++){
			System.out.println(i + ") "+ B.get(i));
		}
		
		/*
		System.out.print("\n" + "Where would you like to start and end?"
				+ "\n" + "please input two numbers between 0 and 9 separated with a space: ");
		
		int R = s.nextInt();
		int C = s.nextInt();
		
		System.out.println();
		
		String start = B.get(R);
		String end = B.get(C);
		*/
		
		String start = "Gdansk";
		String end = "Warsaw";
		
		System.out.println();
		
		ArrayList<Integer> result = y.DFS(start, end, x.graph(file), x.original(file));
		
		for(int i=0; i<result.size(); i++){
			int N = result.get(i);
			System.out.println(B.get(N));
		}		
	}
}
