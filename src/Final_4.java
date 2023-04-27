public class Final_4{
    Node root;

    public int thirdSmallest(){
        return thirdSmallestRec(root, 0);
    }
    
    public int thirdSmallestRec(Node temp, int count){
        if(temp == null)
            return -1;
        int val = thirdSmallestRec(temp.left, count);
        if(val != -1){
            return val;
        }
        if(count == 2){
            return temp.data;
        }
        else{
            count++;
        }
        return thirdSmallestRec(temp.right, count + 1);
    }
    
    public static void main(String[] args){
        Final_4 tree = new Final_4();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(7);
        System.out.println("The value of the third smallest element is " + tree.thirdSmallest() + ".");
    }
    
   static class Node{
	   int data;
	   Node left;
       Node right;
       
       public Node(int data){
    	   this.data = data;
           left = null;
           right = null;
       }
   }
}