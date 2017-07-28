/* https://www.hackerrank.com/challenges/tree-top-view */

/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{
    if(root.left != null) {
        root_left(root.left);
    }
    
    System.out.print(root.data + " ");
    
    if(root.right != null) {
        print_right(root.right);
    }
    
}

void root_left(Node root) {
    if(root.left != null) {
        root_left(root.left);
    }
    System.out.print(root.data + " ");
}

void print_right(Node root) {
    System.out.print(root.data + " ");
    if(root.right != null) {
        print_right(root.right);
    }
}
    