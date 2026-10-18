public class IsValidBST {

    static boolean isValidBST(TreeNode root){
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    static boolean isValid(TreeNode root , int min, int max){
        if(root == null){return true;}
        if(root.val >= max || root.val<=min){return false;}
        return isValid(root.left,min,root.val)&&isValid(root.right,root.val, max);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(13);
        root.left = new TreeNode(10);
        root.left.left= new TreeNode(7);
        root.left.right= new TreeNode(12);
        root.left.left.right= new TreeNode(9);
        root.left.left.right.left= new TreeNode(8);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(14);
        root.right.right = new TreeNode(17);
        root.right.right.left = new TreeNode(16);
        System.out.println(isValidBST(root));
    }
}
