package Project3;

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
	
	public int getPreOrder(BinarySearchTree<E> tree, String name){
		int found = 0;
		if(tree == null){
			found = 0;
			return found;
		}
		else{
			String list = tree.root.data.toString();
			String[] X = list.split(", #");
			String D = (String)X[1];
			if(D.equalsIgnoreCase(name)){
				found = 1;
			}
			else{
				return (getPreOrder(tree.getLeftTree(), name) + getPreOrder(tree.getRightTree(), name));
			}
		}
		return found;
	}
	
	public String getInt(BinarySearchTree<E> tree, String name){
		
		if(tree == null){
			return "";
		}
		else{
			String list = tree.root.data.toString();
			String[] X = list.split(", #");
			String D = (String)X[1];
			String E = (String)X[0];
			if(D.equalsIgnoreCase(name)){
				return E;
			}
			else{
				return (getInt(tree.getLeftTree(), name) + getInt(tree.getRightTree(), name));
			}
		}
	}
	
	
}
