 package Project1;

public class ListNode {
	
	private Object data;
	private ListNode nextNode;

	public ListNode(Object data){
		nextNode = null;
		this.data = data;
	}
	
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