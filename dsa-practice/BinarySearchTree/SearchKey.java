public class SearchKey {

    static int search(TreeNode root , int key){
        while(root!=null && root.val!=key){
            if(root.val>key){root=root.left;}
            else{root=root.right;}}
        return root==null?-1:root.val;
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
        System.out.println(search(root, 90));

    }
}
