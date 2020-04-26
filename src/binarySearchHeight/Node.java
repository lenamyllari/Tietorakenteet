package binarySearchHeight;

public class Node {
	int data;
    BinaryTree left;
    BinaryTree right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
    public  Node (int value, BinaryTree left, BinaryTree right) {
        data = value;
        this.left = left;
        this.right = right;
    }
    public Node() {
		// TODO Auto-generated constructor stub
	}
	public int getData() {
        return data;
    }
    public BinaryTree left() {
        return left;
    }
    public BinaryTree right() {
        return right;
    }
    public void setLeft(BinaryTree  tree) {
        left = tree;
    }
    public void setRight(BinaryTree  tree) {
        right = tree;
    }
	public void setData(int data) {
		this.data = data;
		
	}
	

}
