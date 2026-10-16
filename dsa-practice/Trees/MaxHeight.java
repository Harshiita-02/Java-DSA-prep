public class MaxHeight {
    static int maxHeight(TreeNode root){
        if(root == null){return 0;}
        int lh = maxHeight(root.left);
        int rh = maxHeight(root.right);
        return 1+Math.max(lh,rh);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);

        System.out.println(maxHeight(root));
    }
}
