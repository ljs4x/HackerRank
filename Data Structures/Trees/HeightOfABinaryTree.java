/* https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree */

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	if(root.left == null && root.right == null) {
            return 0;
        }
        int left = 0;
        int right = 0;
        if(root.left != null) {
            left = height(root.left);
        }
        if(root.right != null) {
            right = height(root.right);
        }
        
        if(left >= right) {
            return left + 1;
        }
        if(right > left) {
            return right + 1;
        }
        return 0;
    }
