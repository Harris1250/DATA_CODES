import java.util.Stack;

//class node for the tree
class Node{
	int data; 
	Node left, right; 
	
	public Node(int item) {
		data = item;
		left = null;
		right = null;
	}
}

class BinaryTree{
	Node root;; 
}

public class Lab_10 {
	public static void main(String[] args) {
		// initializing the BST tree
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(7);
		
		
		//declaring the uperbound to be the max integer 
		int ub = Integer.MAX_VALUE	;
		//calling the function the function to check whether the tree has BST Properties or not
		if(validateBST(tree.root, 0,ub) == true) {
			System.out.println("This BST is valid");
			System.out.print("The BST traversal is ");
			Traversal(tree.root);
		} else {
			//in case the tree doesn't have BST properties 
			System.out.println("This BST is not valid");
		}
	}
	
	public static boolean validateBST(Node root, int lb, int ub) {
		if (root == null) {//check if the tree structure is vald, the root isn't null
			return true;
		}
		if (!(root.data >= lb && root.data < ub)) { //check if the root is bigger than the lower bound and smaller than the upper bound
			return false;
		}
		return(validateBST(root.left, lb, root.data) && validateBST(root.right, root.data, ub));
		//recursive call to check for the same thing but for the left and right side of the tree & subtrees
		//with the left side using lower bound of 0 still, and right side using the lowest value of the right
		
	}
	
	public static void Traversal(Node root) { //function to iteratively traverse the tree
		Node curr = root;
		Stack<Node> a = new Stack<Node>(); //stack initialized for the traversal
		
		while (curr!= null || !a.isEmpty()) {//check if the root is valud / isn't null
			if (curr != null) { //go down the left side until null, which then traverse the right side instead 
				a.push(curr);
				curr = curr.left;
			} else { 
				curr = a.pop();
				System.out.print(curr.data + " ");// prints out the traversal
				curr = curr.right;
			}
		}
	}
}