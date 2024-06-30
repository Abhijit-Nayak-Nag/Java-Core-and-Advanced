package Day_8.PalindromeLinkedList;

 class ListNode {
     int val;
     ListNode next;
     public ListNode(int val){
         this.val=val;
         this.next=null;
     }

 }
 public class PalindromeLinkedList {
     public static boolean isPalindrome(ListNode head){
         if(head==null || head.next==null){
             return true;
         }
         ListNode slow=head;
         ListNode fast=head;
         while (fast !=null && fast.next!=null){
             slow = slow.next;
             fast= fast.next.next;
         }
         ListNode prev= null;
         ListNode current= slow;
         while(current !=null){
             ListNode nextNode=current.next;
             current.next=prev;
             prev=current;
             current=nextNode;
         }
         ListNode firstHalf= head;
         ListNode secondHalf=prev;
         while(secondHalf !=null)
         {
             if(firstHalf.val !=secondHalf.val){
                 return false;
             }
             firstHalf=firstHalf.next;
             secondHalf=secondHalf.next;
         }
         return true;
     }

     public static void main(String[] args) {
         ListNode head= new ListNode(1);
         head.next=new ListNode(2);
         head.next.next=new ListNode(3);
         head.next.next.next=new ListNode(2);
         head.next.next.next.next=new ListNode(1);
         System.out.println("Is the list a palindrome? " + isPalindrome(head));
         ListNode head2=new ListNode(1);
         head2.next=new ListNode(2);
         head2.next.next=new ListNode(3);
         System.out.println("Is the list a palindrome? " +isPalindrome(head2));

     }
}
