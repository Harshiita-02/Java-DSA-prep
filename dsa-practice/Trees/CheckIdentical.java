public class CheckIdentical {

    static boolean isIdentical(TreeNode rootP, TreeNode rootQ){
        if(rootP == null || rootQ == null){return rootP==rootQ;}
        return rootP.val==rootQ.val && isIdentical(rootP.left, rootQ.left) && isIdentical(rootP.right, rootQ.right);
    }
    public static void main(String[] args) {
        TreeNode rootP = new TreeNode(1);
        rootP.left = new TreeNode(2);
        rootP.right = new TreeNode(3);
        rootP.left.left = new TreeNode(4);
        rootP.left.right = new TreeNode(5);
        rootP.right.left = new TreeNode(6);
        rootP.right.right = new TreeNode(7);
        rootP.left.left.left = new TreeNode(8);

        TreeNode rootQ = new TreeNode(1);
        rootQ.left = new TreeNode(2);
        rootQ.right = new TreeNode(3);
        rootQ.left.left = new TreeNode(4);
        rootQ.left.right = new TreeNode(5);
        rootQ.right.left = new TreeNode(6);
        rootQ.right.right = new TreeNode(7);
        rootQ.left.left.left = new TreeNode(8);

        System.out.println(isIdentical(rootP, rootQ));
}
}