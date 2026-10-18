import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class IterativePreInPostOrder {
    static void inOrderTraversal(TreeNode root, ArrayList<Integer> inResult){
        if(root == null){return;}
        Deque<TreeNode> st = new ArrayDeque<>();
        TreeNode node = root;
        while(true){
            if(node!=null){
                st.push(node);
                node = node.left;}
            else{
                if(st.isEmpty()){break;}
                node = st.pop();
                inResult.add(node.val); 
                node = node.right;}}     
    }

    static void preOrderTraversal(TreeNode root, ArrayList<Integer> preResult){
        if(root == null){return;}
        Deque<TreeNode> st = new ArrayDeque<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            preResult.add(node.val);
            if(node.right!=null){st.push(node.right);}
            if(node.left!=null){st.push(node.left);}
        }     
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

        ArrayList<Integer> preResult = new ArrayList<>();
        preOrderTraversal(root, preResult);
        System.out.println("preResult : " + preResult);

        ArrayList<Integer> inResult = new ArrayList<>();
        inOrderTraversal(root, inResult);
        System.out.println("inResult : "+inResult);

        // ArrayList<Integer> postResult = new ArrayList<>();
        // postOrderTraversal(root, postResult);
        // System.out.println("postResult : "+postResult);
}
}
