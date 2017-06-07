package Lab3;


public class Stack {
	
	//Data member.  Stack is viewed as LinkedList
	private LinkedList stack;
	
	//default constructor
	public Stack (){
		//create a linked list called stack
		stack = new LinkedList();
	}//end Stack constructor
	
	//push method to add to stack
	public void push(Object item){
		stack.insertAtHead(item);
	}//end push method
	
	//pop method to remove from stack
	public Object pop() throws Exception{
		return stack.removeFromHead();

	}//end pop method
	
	//return top of stack without removing it
	public Object peek(){
		return stack.getFirstNode().getData();

	}//end peek method
	
	//isEmpty: this method returns true if the stack is empty, else false
	public boolean isEmpty(){
		return stack.isEmpty();

	}//end isEmpty method
	
	//printStack method
	public void printStack(){
		stack.printList();
	}//end printStack method
	
	
}//end Stack class
