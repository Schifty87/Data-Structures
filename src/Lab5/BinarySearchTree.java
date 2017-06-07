package Lab5;

import java.io.Serializable;

public class BinarySearchTree <E> implements Serializable {

	protected Node<E> root;
	
	public BinarySearchTree(){
		this.root = root;
	}
	
	public BinarySearchTree(Node<E> root){
		this.root = root;
	}
	
	public BinarySearchTree(E data, BinarySearchTree<E> leftTree, BinarySearchTree<E> rightTree){
		this.root = new Node<E>(data);
		if(leftTree != null)
			root.leftNode = leftTree.root;
		if(rightTree != null)
			root.rightNode = rightTree.root;
	}
	
	public void insertNode(E insertValue){
		if(this.root == null)
			this.root = new Node<E> (insertValue);
		else
			this.root.insert(insertValue);
		
	}
	
	public BinarySearchTree<E> getLeftTree(){
		
		if(this.root != null && root.leftNode != null)
			return new BinarySearchTree(root.leftNode);
		else
			return null;
	}
	
	public BinarySearchTree<E> getRightTree(){
		if(this.root != null && root.rightNode != null)
			return new BinarySearchTree(root.rightNode);
		else
			return null;
	}
	
	public String getInorderTraversal(BinarySearchTree<E> tree){
		if(tree == null)
			return "";
		else{
			return (getInorderTraversal(tree.getLeftTree()) + tree.root.data.toString() + " " + getInorderTraversal(tree.getRightTree()));
		}
			
	}
	
	public String getPreOrder(BinarySearchTree<E> tree){
		if(tree == null)
			return "";
		else{
			return (tree.root.data.toString() + " " + getPreOrder(tree.getLeftTree()) + getPreOrder(tree.getRightTree()));
		}
	}
	
	public String getPostOrder(BinarySearchTree<E> tree){
		if(tree == null)
			return "";
		else{
			return (getPostOrder(tree.getLeftTree()) + getPostOrder(tree.getRightTree()) + tree.root.data.toString() + " ");
		}
	}
	
	public int findItem(BinarySearchTree<E> tree, String item){
		int isFound = 0;
		
		
		
		return isFound;		
	}
}
