/* https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list */

/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
    
    //if position is head
    if(position == 0) {
        head = head.next;
        return head;
    }
    
    //otherwise count up to the position before the node to be deleted
    int count = 0;
    Node current = head;
    while(count < position - 1) {
        current = current.next;
        count++;
    }
    
    current.next = current.next.next;
    return head;
    

}

