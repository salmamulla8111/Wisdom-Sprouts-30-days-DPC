package DPC;
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    private int count = 0;
    private int result = -1;
    
    public int kthLargest(TreeNode root, int k) {
        count = k;
        traverse(root);
        return result;
    } 
    private void traverse(TreeNode node) {
        if (node == null || count == 0) {
            return;
        }
        traverse(node.right);
        count--;
        
        if (count == 0) {
            result = node.val;
            return;
        }   
        traverse(node.left);
    }
}
public class Challenge27 {
    public static void main(String[] args) {
        // Create the binary search tree
        //TreeNode root = new TreeNode(1);
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
        //root.right.left = new TreeNode(6);
        //root.right.right = new TreeNode(9);   
        int k = 3;
        Solution solution = new Solution();
        int kthLargest = solution.kthLargest(root, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }
}
