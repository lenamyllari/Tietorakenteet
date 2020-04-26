package binaryTree;

public class BinaryTree {
	  private Node root;
	   
	    public BinaryTree(int rootValue) {
			root = new Node(rootValue);
		}

		public BinaryTree(){
			root = null;
		}

		public BinaryTree(int rootValue, BinaryTree left, BinaryTree right){
			root = new Node(rootValue, left, right);
		}
		
		public void insert(int aData){
			if(root == null) {
				root = new Node(aData);
			}
			if(aData < root.getData()) {
				if(root.left() == null) { 	
					root.setLeft(new BinaryTree(aData));
				}
				else { 						
					root.left().insert(aData);
				}
			}
			if(aData > root.getData()) {
				if(root.right() == null) {
					root.setRight(new BinaryTree(aData));
				}
				else {
					root.right().insert(aData);
				}
			}
		}
		
		public void preOrder() {
			if (root == null) {
				return;
			}
			System.out.println(root.getData() + " ");
			if (root.left() != null){
				root.left().preOrder();
			}

			if (root.right() != null) {
				root.right().preOrder();
			}
		}
		
		public BinaryTree find(int aData){

			if(root == null) {
				return null;
			}

			if(aData == root.getData()) {
				return this;
			}
		
			if(aData < root.getData() && root.left() != null) {
				return root.left().find(aData);
			}

			if(aData > root.getData()&& root.right() != null) {
				return root.right().find(aData);
			}
			return null;

		}
		public void delete(int aData) {
			BinaryTree found = find(aData);
			if(found == null) {
				System.out.println("tree is empty");
			}
			if(found.getRight()==null && found.getLeft()==null) {
				System.out.println("delete with no children");
				found.setRoot(null);
			}
			else if (found.getRight()==null && found.getLeft()!=null) {
				System.out.println("delete with left child");
				found.setRoot(found.getLeft().getRoot());
			}
			else if (found.getRight()!=null && found.getLeft()==null) {
				System.out.println("delete with right child");
				found.setRoot(found.getRight().getRoot());
			}
			else {
				System.out.println("delete with both children");
				found.setData(found.getRight().findMostLeft().getRoot().getData());
				found.getRight().findMostLeft().setRoot(null);
			}
		
		}
		
		public BinaryTree findMostLeft() {
			return (root.left() != null) ? root.left().findMostLeft(): this;
		}
	
		public Node getRoot() {
			return root;
		}

		public int getData() {
			return root.getData();
		}

		public BinaryTree getRight() {
			return root.right();
		}

		public BinaryTree getLeft() {
			return root.left();
		}

		public void setRoot(Node root) {
			this.root = root;
		}

		public void setData(int data) {
			root.setData(data);
		}

		public void setLeft(BinaryTree tree) {
			root.setLeft(tree);
		}

		public void setRight(BinaryTree tree) {
			root.setRight(tree);
		}  
		public void inOrder() {
	        if (root != null) {
	            if (root.left() != null) {
	                root.left().inOrder();
	            }
	            System.out.print(root.getData() + " ");
	            if (root.right() != null) {
	                root.right().inOrder();
	            }
	        }
	    }
}
