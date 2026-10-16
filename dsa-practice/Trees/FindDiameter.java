public class FindDiameter {
    static int diaBruteForce(TreeNode root){
        if(root == null){return 0;}
        int maxi = 0;
        int lh = MaxHeight.maxHeight(root.left);
        int rh = MaxHeight.maxHeight(root.right);
        maxi = Math.max(maxi, lh+rh);
        diaBruteForce(root.left);
        diaBruteForce(root.right);
        return maxi;}

    static int diaOptimal(TreeNode root, int []maxi){
        if(root == null){return 0;}
        int lh = diaOptimal(root.left, maxi);
        int rh = diaOptimal(root.right, maxi);
        maxi[0] = Math.max(maxi[0], lh+rh);
        return 1+Math.max(lh, rh);}

    static int findDia(TreeNode root){
        int []maxi = new int[1];
        diaOptimal(root, maxi);
        return maxi[0];}
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);

        System.out.println(diaBruteForce(root));
        System.out.println(findDia(root));
    }
}
