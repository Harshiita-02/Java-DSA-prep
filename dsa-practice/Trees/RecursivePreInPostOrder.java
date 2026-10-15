import java.util.ArrayList;

public class RecursivePreInPostOrder {
    static void preOrderTraversal(TreeNode root, ArrayList<Integer> preResult){
        if(root== null){return;}
        preResult.add(root.val);
        preOrderTraversal(root.left, preResult);
        preOrderTraversal(root.right, preResult);}

    static void inOrderTraversal(TreeNode root, ArrayList<Integer> inResult){
        if(root== null){return;}
        inOrderTraversal(root.left, inResult);
        inResult.add(root.val);
        inOrderTraversal(root.right, inResult);}

    static void postOrderTraversal(TreeNode root, ArrayList<Integer> postResult){
        if(root== null){return;}
        postOrderTraversal(root.left, postResult);
        postOrderTraversal(root.right, postResult);
        postResult.add(root.val);}

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);

        ArrayList<Integer> preResult = new ArrayList<>();
        preOrderTraversal(root, preResult);
        System.out.println("preResult : " + preResult);

        ArrayList<Integer> inResult = new ArrayList<>();
        inOrderTraversal(root, inResult);
        System.out.println("inResult : "+inResult);

        ArrayList<Integer> postResult = new ArrayList<>();
        postOrderTraversal(root, postResult);
        System.out.println("postResult : "+postResult);
}
}
