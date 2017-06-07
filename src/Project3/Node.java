package Project3;

import java.io.Serializable;

public class Node<E> implements Serializable {

	/*data members*/
	protected E data;
	/*left node is actually a "pointer" to left tree*/
	protected Node<E> leftNode;
	/*rightNode is actually a "pointer" to the right tree*/
	protected Node<E> rightNode;
	
	/*constructor; create a node given the data of the node */
	public Node(E data){
		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
	}
	
	/*insert: insert a node into an existing tree*/
	public void insert(E insertValue){
		boolean insertLeft = true;
		if(insertValue instanceof Integer){
			
		
			if((Integer)insertValue < (Integer)this.data)
				insertLeft = true;
			else
				insertLeft = false;
		}
		else if (insertValue instanceof String){
			if(((String)insertValue).compareTo((String)this.data)<0)
				insertLeft = true;
			else
				insertLeft = false;
		}
		if(insertLeft == true){
			
			if(this.leftNode == null)
				this.leftNode = new Node<E> (insertValue);
			else
				leftNode.insert(insertValue);
		}
		else
			if(this.rightNode == null)
				this.rightNode = new Node<E> (insertValue);
			else
				rightNode.insert(insertValue);
	}
	
}
