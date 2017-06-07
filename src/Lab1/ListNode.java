package Lab1;

public class ListNode {
	/* Declare two class variables (aka data members) named: data with data type Object, and nextNode with data type ListNode */
	private Object data;
	private ListNode nextNode;

	/* Create a constructor of ListNode that takes a new data (with Object data type) as input. In this constructor, initialize the nextNode to null and assign data to the input object */
	//create new node
	public ListNode(Object data){
		nextNode = null;
		this.data = data;
	}
	/* Create a constructor of ListNode that takes two inputs: a new data (with Object data type), and a new nextNode (with ListNode data type). In this constructor, initialize the class variables to the input data and the nextNode accordingly */
	public ListNode(Object data, ListNode nextNode){
		this.data = data;
		this.nextNode = nextNode;
	}
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	/**
	 * @return the nextNode
	 */
	public ListNode getNextNode() {
		return nextNode;
	}
	/**
	 * @param nextNode the nextNode to set
	 */
	public void setNextNode(ListNode nextNode) {
		this.nextNode = nextNode;
	}
	

}