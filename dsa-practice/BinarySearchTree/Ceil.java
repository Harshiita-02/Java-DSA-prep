public class Ceil {

    static int ceil(TreeNode root, int key){
        int ceil =-1;
        while(root!=null){
            if(key==root.val){ceil = root.val; return ceil;}
            if(key<root.val){
                ceil = root.val;
                root = root.left;}
            else{ root = root.right;}}
        return ceil;
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
        System.out.println(ceil(root, 11));
}
    
}
