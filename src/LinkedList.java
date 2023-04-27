import java.io.*;

public class LinkedList{
	
	 // create node class
    class node{
        int data;
        node next;

        // class constructor
        node(int val){
            this.data = val;
            this.next = null;
        }
    }
    // head of the linkedlist
    node head = null;
    
    // insertion method
    void insert(int val){
    	node tmp = new node(val);

        // if this is the very first node
        if (head == null)
        	head = tmp;
        else{
        	// else we append the node in the end of the linked list
            node dummy = head;
            while (dummy.next != null)
            	dummy = dummy.next;
            dummy.next = tmp;
        }
    }
    // function to display content of the linkedlist
    void display(){
    	node dummy = head;
        System.out.print("Linked List: ");
        while (dummy != null) {
        	System.out.print(dummy.data + " ");
        	dummy = dummy.next;
        }
        System.out.println("");
    }
    // function to delete a node from the linkedlist
    void delete(int n){

        // if linked list is empty 
        // Test case 2  
        if(head==null){
        	System.out.println("Invalid input");
        }
        // if linked list has 1 node 
        // Test case 1
        else if(head.next==null){
            if(n==1) System.out.println("NULL");
            else if(n>=2) System.out.println("Invalid Input");
        }
        else{
        // Otherwise we create two nodes slow and fast
            node slow=head;
            node fast=head;
            int i;
        // we first maintain a different of n between the slow and fast nodes
            for(i=0;i<n;i++){
                if(fast!=null) fast=fast.next;
                else break;
            }
            if(i!=n) System.out.println("Value of N is greater than the length of the list");
            else{
        // then we extend our fast node till the tail of the linked list
                if(fast==null){
                	head=head.next;
                    return;
                }
                while(fast.next!=null){
                    fast=fast.next;
                    slow=slow.next;
                }
        // we then just delete the required node
                slow.next=slow.next.next;
            }
        }
    }
    
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();

        obj.insert(50);
        obj.insert(11);
        obj.insert(33);
        obj.insert(21);
        obj.insert(40);
        obj.insert(71);

        obj.display();
        obj.delete(5);
        obj.display();
    }
	public void add(int w) {
		// TODO Auto-generated method stub
		
	}
}