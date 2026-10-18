public class Insert {

    static TreeNode insert(TreeNode root , int key){
        if(root == null){return new TreeNode(key);}
        TreeNode curr = root;
        while(true){
            if(key<curr.val){
                if(curr.left!= null){curr = curr.left;}
                else{curr.left = new TreeNode(key);
                    break;}}
            else{
                if(curr.right!= null){curr = curr.right;}
                else{curr.right = new TreeNode(key);
                    break;}}
        }
        return root;
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
        System.out.println(insert(root, 90));

    }
}
