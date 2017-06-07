package Airport;



public class LinkedList {
	
	private ListNode firstNode;
	private ListNode lastNode;
	private String listName;
	private int size;
	
	public LinkedList() {
		listName ="list";
		firstNode = null;
		lastNode = null;
		size=0;
	}
	
	public LinkedList(String listName) {
		this.listName = listName;
		firstNode = null;
		lastNode  = null;
		size = 0;
	}
	/**
	 * This method returns the number of elements in this linked list
	 * @return an integer representing the number of elements that are in this linked list
	 */
	
	public int size() {
		return this.size;
	}
	
	/**
	 * This method determines if the linked list is empty
	 * @return true if the linked list is empty and return false otherwise
	 */
	
	public boolean isEmpty() {
		if (firstNode == null) return true;
		else return false;
	}
	/**
	 * insertAtHead
	 * This method insert an object at front of the linked list
	 * Algorithm:
	 * 	 if the list is empty then
	 * 			the first node and the last node point to the same new node
	 * 			Note: When using ListNode constructor, please use the constructor with one parameter
	 * 	 else
	 * 			first node point to the new node.
	 * 			Note: When using ListNode constructor, please use the constructor with two parameters
	 *   increase the size of the list by 1
	 * @param item
	 * 		item: the new object being inserted
	 */
	public void insertAtHead(Object item) {
		if (isEmpty())
			firstNode = lastNode = new ListNode(item);
		else 
			firstNode = new ListNode(item, firstNode);
		size++;
	}
	
	/**
	 * insertAtTail
	 * This method insert an object at the back of the linked list
	 * Algorithm:
	 *   if the list is empty then	
	 *			the first node and the last node point to the same new node
	 * 			Note: When using ListNode constructor, please use the constructor with one parameter
	 * 	 else
	 * 			last node point to the new node and new node become last node
	 * 			Note: When using ListNode constructor, please use the constructor with two parameters
	 *  increase the size of the list by 1
	 * @param item
	 */
	
	public void insertAtTail(Object item) {
		/* This is a stub */
		if (isEmpty())
			firstNode = lastNode = new ListNode(item);
		else {
			ListNode newNode = new ListNode(item);
			lastNode.setNextNode(newNode);
			lastNode = newNode;
		}
		size++;
	}
	
	/**
	 * removeFromHead
	 * This method is to remove a node from front of the list
	 * Algorithm:
	 *    if the list is empty then
	 *         throw EmptyListException
	 *    else
	 *    	   Get the data of the first node (which is deleted) and store it somewhere
	 *    	   if first node points to the last node then
	 *              first node and last node both point to null
	 *         else 
	 *              first node point to the next node (neigboring node of the first node)
	 *         decrease the size of the list by 1
	 *         return the object that contains the data of the old first node (been stored somewhere)         
	 * 
	 * @throws EmptyListException
	 */
	public Object removeFromHead() throws EmptyListException {
		
		/* This is a stub */
		
		if (isEmpty())
			throw new EmptyListException();
		Object removedItem = firstNode.getData();
		if (firstNode == lastNode)
			firstNode=lastNode = null;
		else {
			firstNode = firstNode.getNextNode();
		}
		size--;
		return removedItem;
		
	}

	/**
	 * removeFromTail
	 * This method removes the last element in the LinkedList
	 * Algorithm:
	 * 
	 *    if the list is empty then
	 *         throw EmptyListException
	 *    else
	 *    	  Store the data of the current last node somewhere
	 *        Starting from the first node of the linked list, go to the 
	 *        node before the last node of this list (hint: using a while loop)
	 * 		  update the reference of the last node so that it now points to the node right before it	
	 * 		  set the next node of the new last node to null
	 * 		  decrease the size of the list by 1
	 * 		  Return the data of the old last node (being stored somewhere)
	 * 
	 */
	
	public Object removeFromTail() {
		/* This is a stub */
		if (isEmpty())
			throw new EmptyListException();
		Object removedItem = lastNode.getData();
		
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else {
			ListNode current = firstNode;
			while (current.getNextNode() != lastNode) {
				current= current.getNextNode();
			}
			lastNode = current;
			current.setNextNode(null);
		}
		size--;
		return removedItem;
		
	}
	public void printList() {
				
		if (isEmpty()) {
			System.out.println(" Empty list named "+ listName);
			return;
		}
		System.out.print(" The list "+listName+" is: ");
		ListNode current = firstNode;
		
		while (current != null) {
			//System.out.print(current.getData()+"\t");
			Request q = (Request) current.getData();
			System.out.print(q.getId()+"\t");
			current = current.getNextNode();
		}
		System.out.println();
	
	}
	
	public ListNode getFirstNode() {
		return firstNode;
	}
	
	public ListNode getLastNode() {
		return lastNode;
	}

	public void setFirstNode(ListNode top) {
		firstNode = top;
	}
	public void setLastNode(ListNode last) {
		lastNode = last;
	}
	public int getSize() {
		return size;
	}
	
}
