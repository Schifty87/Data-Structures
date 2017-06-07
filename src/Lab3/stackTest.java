package Lab3;

public class stackTest {

	public static void main(String[] args) throws Exception {
		
		Stack aStack = new Stack();
		aStack.push(4);
		aStack.push(6);
		aStack.push(10);
		
		System.out.println("Original stack: ");
		aStack.printStack();
		System.out.println("Remove one element from top: ");
		Integer item = (Integer) aStack.pop();
		System.out.println(item);
		System.out.println("Stack after removing item");
		aStack.printStack();
		System.out.println("Peeking on top of the stack: " + (Integer) aStack.peek());
		
		
		
	}//end main method

}//end stackTest class
