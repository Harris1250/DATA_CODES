public class Final_3{
	public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
	}
	
	public static ListNode deleteThirdLast(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr.next != null){
            ListNode next = curr.next;
            if(next.next.next == null){
                if (prev == null){
                    head = curr.next;
                } 
                else{
                    prev.next = curr.next;
                }
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
    
    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + " > ");
            head = head.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args){
        ListNode head = new ListNode(2);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(18);
        head = deleteThirdLast(head);
        printList(head);
    }
}
/*
 * time complexity is O(n) because we iterate through the list only once. 
 * space complexity is O(1) because we only use two pointers and a few variables to keep track of the list. 
 */