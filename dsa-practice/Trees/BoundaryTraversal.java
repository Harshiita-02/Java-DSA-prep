import java.util.ArrayList;
import java.util.List;



public class BoundaryTraversal {
    static boolean isLeaf(TreeNode node){return node.left==null && node.right==null;}

    static void leftBoundary(TreeNode root, List<Integer> result){
        TreeNode curr = root.left;
        while (curr!=null) {
        if(!isLeaf(curr)){result.add(curr.val);}
        if(curr.left!= null){curr=curr.left;}
        else{curr= curr.right;}}}

    static void addLeaves(TreeNode root, List<Integer> result){
        if(isLeaf(root)){result.add(root.val);return;}
        if(root.left!=null){addLeaves(root.left, result);}
        if(root.right!=null){addLeaves(root.right, result);}
    }

    static void rightBoundary(TreeNode root, List<Integer> result){
        TreeNode curr = root.right;
        List<Integer> temp = new ArrayList<>();
        while (curr!=null) {
        if(!isLeaf(curr)){temp.add(curr.val);}
        if(curr.right!= null){curr=curr.right;}
        else{curr= curr.left;}}

        for(int i = temp.size()-1; i>=0; i--){
            result.add(temp.get(i));}}


    static List<Integer> boundary(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(!isLeaf(root))result.add(root.val);
        leftBoundary(root, result);
        addLeaves(root, result);
        rightBoundary(root, result);
        return result;
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

        System.out.println(boundary(root));
    }
}
