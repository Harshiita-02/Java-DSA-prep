public class MaxPathSuminBT {

    static int findMaxPathSum(TreeNode root){
        if(root == null){return 0;}
        int []maxi = new int[1];
        findMaxPathDown(root, maxi);
        return maxi[0];
    }

    static int findMaxPathDown(TreeNode root, int []maxi){
        if(root == null){return 0;}
        int left = Math.max(0, findMaxPathDown(root.left, maxi));
        int right = Math.max(0, findMaxPathDown(root.right, maxi));
        maxi[0] = Math.max(maxi[0], left+right+root.val);
        return root.val + Math.max(left, right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);}
}
