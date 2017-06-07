package Airport;

public class Queue {

	private LinkedList queueList;
	
	public Queue () {
		queueList = new LinkedList();
	
	}
	
	public void enQueue(Object item) {
		queueList.insertAtTail(item);
	}
	
	public Object deQueue() throws EmptyListException {
		return queueList.removeFromHead();
	}
	
	public boolean isEmpty() {
		return queueList.isEmpty();
	}
	
	public void printQueue() {
		queueList.printList();
	}
	
	public int getSize() {
		return queueList.getSize();
	}
	
	public Object getLastNode() {
		return queueList.getLastNode().getData();
	}
	
	public Object getFirstNode() {
		return queueList.getFirstNode().getData();
	}
}

