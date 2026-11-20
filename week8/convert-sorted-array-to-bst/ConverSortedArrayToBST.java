
public class ConverSortedArrayToBST {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildTree(nums, left, mid - 1);
        root.right = buildTree(nums, mid + 1, right);

        return root;
    }

    public static void printInorder(TreeNode root) {
        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        ConverSortedArrayToBST solution =
                new ConverSortedArrayToBST();

        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode root = solution.sortedArrayToBST(nums);

        System.out.println("Root: " + root.val);
        System.out.print("Inorder traversal: ");
        printInorder(root);
        System.out.println();
    }
}
