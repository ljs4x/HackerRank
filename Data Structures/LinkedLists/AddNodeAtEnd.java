/* https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list */

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    Node current = head;
    if(head == null) {
        head = new Node();
        head.data = data;
        return head;
    }
    while(current.next != null) {
        current = current.next;
    }
  
    current.next = new Node();
    current.next.data = data;
    return head;
}
