package Airport;

public class ListNode {
	private Object data;
	private ListNode nextNode;
	
	public ListNode(Object data, ListNode nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
	
	public ListNode(Object object) {
		this.data = object;
		nextNode = null;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ListNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(ListNode nextNode) {
		this.nextNode = nextNode;
	}
	
}

