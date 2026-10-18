public class LCA {

    static int lca(TreeNode root , TreeNode P, TreeNode Q){
        if(root ==  null){return -1;}
        int curr = root.val;
        if(curr<P.val && curr<Q.val){return lca(root.right, P, Q);}
        if(curr>P.val && curr>Q.val){return lca(root.left, P, Q);}
        return root.val;
    }
     public static void main(String[] args) {
        TreeNode root = new TreeNode(13);
        root.left = new TreeNode(10);
        root.left.left= new TreeNode(7);
        root.left.right= new TreeNode(12);
        TreeNode Q = root.left.right;
        root.left.left.right= new TreeNode(9);
        TreeNode P = root.left.left.right;
        root.left.left.right.left= new TreeNode(8);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(14);
        root.right.right = new TreeNode(17);
        root.right.right.left = new TreeNode(16);
        System.out.println(lca(root, P, Q));

    }
}
