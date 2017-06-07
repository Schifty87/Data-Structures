package Lab4;

import Lab4.LinkedList;

public class Queue {
	
	//data member: queue is a LinkedList object
	private LinkedList queue;
	
	//constructor
	public Queue(){
		//create the queue object here
		queue = new LinkedList();
	}
	
	public boolean isEmpty(){
		//return true is the queue is empty
		return(queue.isEmpty());
	}
	
	public void enQueue(Object item){
		queue.insertAtTail(item);
	}
	
	public Object deQueue() throws Exception{
		return(queue.removeFromHead());
	}
	
	public int getSize(){
		return queue.getSize();
	}
	
	public void printQueue(){
		queue.printList();
	}
}
