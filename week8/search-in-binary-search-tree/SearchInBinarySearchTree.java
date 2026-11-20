public class SearchInBinarySearchTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    public static void main(String[] args) {
        SearchInBinarySearchTree solution =
                new SearchInBinarySearchTree();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode result = solution.searchBST(root, 2);

        if (result != null) {
            System.out.println("Found node: " + result.val);
            System.out.println("Left child: " + result.left.val);
            System.out.println("Right child: " + result.right.val);
        } else {
            System.out.println("Node not found");
        }
    }
}
