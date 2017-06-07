package tester;

public class main {
	public static void main(String[] args){
		
		//sort y = new sort();
		read x = new read();
		String file = "cities1.txt";
		System.out.println(x.original(file));
		x.graph(file);
		
	}
} //end of main