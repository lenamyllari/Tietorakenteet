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

	    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
	        root = new Node(rootValue, left, right);
	    } 

	    public void preOrder() {
	        if (root != null) {
	            System.out.println(root.getData()+',');
	            if (root.left() != null) // pääseeekö vasemmalle?
	                root.left().preOrder();
	            if (root.right() != null) // pääseekö oikealle?
	                root.right().preOrder();
	        }

	    }

	    // löydetty alipuu asetetaan staattiseen muuttujaan found
	    public void findWithPreOrder() {

	        if (root != null) {
	            System.out.print(root.getData()+ ": muokkaatko tätä?");
	            if (root.left()== null)
	                System.out.print(" (vasemmalla tilaa)");
	            if (root.right() == null)
	                System.out.println(" (oikealla tilaa)");
	            char select = Lue.merkki();
	            if (select =='k') {
	                found = this;
	                return;
	            }
	            if (found==null && root.left() != null) // pääseekö vasemmalle?
	                root.left().findWithPreOrder();
	            if (found== null && root.right() != null) // pääseekö oikealle?
	                root.right().findWithPreOrder();
	        }

	    }
	    */

	  
}
