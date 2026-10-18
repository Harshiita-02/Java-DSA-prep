public class Floor {

    static int floor(TreeNode root, int key){
        int floor =-1;
        while(root!=null){
            if(key==root.val){floor = root.val; return floor;}
            if(key>root.val){
                floor = root.val;
                root = root.right;}
            else{ root = root.left;}}
        return floor;
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
        System.out.println(floor(root, 18));
}
}
