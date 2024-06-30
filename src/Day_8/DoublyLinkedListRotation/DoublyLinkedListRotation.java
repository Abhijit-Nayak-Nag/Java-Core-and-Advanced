package Day_8.DoublyLinkedListRotation;

class ListNode{
    int  val;
    ListNode prev;
    ListNode next;
    public ListNode(int val){
        this.val=val;
        this.prev=null;
        this.next=null;
    }

}
public class DoublyLinkedListRotation {
    public static ListNode rotateDoublyLinkedList(ListNode head, int N){
        if(head ==null || N<=0){
            return head;
        }
        int count= 0;
        ListNode current = head;
        while (current.next!=null){
            count++;
            current=current.next;
        }
        count++;
        N=N%count;
        if(N==0){
            return head;
        }
        int stepsToMove=count -N;
        current=head;
        while(stepsToMove>1){
            current=current.next;
            stepsToMove--;
        }
        ListNode newHead=current.next;
        current.next=null;
        newHead.prev=null;
        current=newHead;
        while (current.next!=null){
            current=current.next;
        }
        current.next=head;
        head.prev=current;
        return newHead;

    }
    public static void printList(ListNode head){
        ListNode current = head;
        while (current!=null){
            System.out.println(current.val +"");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.prev=head;
        head.next.next=new ListNode(3);
        head.next.next.prev=head.next;
        head.next.next.next=new ListNode(4);
        head.next.next.next.prev=head.next.next;
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.prev=head.next.next.next;
        System.out.println("Original list: ");
        printList(head);
        int N=2;
        ListNode rotatedHead=rotateDoublyLinkedList(head,N);
        System.out.println("List after rotating counter-clockwise by " + N + "nodes: ");
        printList(rotatedHead);
    }
}
