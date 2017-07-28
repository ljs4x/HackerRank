/* https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list */

/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    
        if(head == null || head.next == null) {
            return head;
        }
        Node second = head.next;
        if(head.data == second.data) {
            head.next = second.next;
            RemoveDuplicates(head);
        }
        if(head.data != second.data) {
             RemoveDuplicates(second);
        }
           
        return head;

}
