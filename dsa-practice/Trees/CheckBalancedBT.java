public class CheckBalancedBT {
    static boolean bruteForce(TreeNode root){
        if(root == null){return false;}
        int lh = MaxHeight.maxHeight(root.left);
        int rh = MaxHeight.maxHeight(root.right);
        if(Math.abs(lh-rh)>1)return false;
        boolean left = bruteForce(root.left);
        boolean right = bruteForce(root.right);
        if(!left || !right){return false;}
        return true;}

        static  int optimal(TreeNode root){
            if(root == null){return 0;}
        int lh = MaxHeight.maxHeight(root.left);
        if(lh==-1){return -1;}
        int rh = MaxHeight.maxHeight(root.right);
        if(rh==-1){return -1;}
        if(Math.abs(lh-rh)>1)return -1;
            return 1+Math.max(lh, rh);
        }

        static boolean balancedBT(TreeNode root){
            return optimal(root)!=-1;
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

        System.out.println(bruteForce(root));
        System.out.println(balancedBT(root));
    }
}
