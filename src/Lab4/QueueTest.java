package Lab4;

public class QueueTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//create a queue object
		Queue aQueue = new Queue();
		
		aQueue.enQueue(6);
		aQueue.enQueue(3);
		aQueue.enQueue(9);
		aQueue.enQueue(12);
		
		System.out.println("This is my original queue");
		aQueue.printQueue();
		
		//remove item at head of list
		Integer item = (Integer) aQueue.deQueue();
		System.out.println("Remove " + item);
		
		System.out.println("This is my new queue");
		aQueue.printQueue();
		
		Integer item1 = (Integer) aQueue.deQueue();
		System.out.println("Remove " + item1);
		
		System.out.println("This is my new queue");
		aQueue.printQueue();
		
		Integer item2 = (Integer) aQueue.deQueue();
		System.out.println("Remove " + item2);
		
		aQueue.enQueue(46);
		aQueue.printQueue();
	}

}
