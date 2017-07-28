/* https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail */

/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    int size = 0;
    Node current = head;
    while(current.next != null) {
        size++;
        current = current.next;
    }
    current = head;
    int count = 0;
    while(count < size - n) {
        count++;
        current = current.next;
    }
    return current.data;    

}
