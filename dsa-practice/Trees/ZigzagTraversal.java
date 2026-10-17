import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagTraversal {
    static List<List<Integer>> zigzag(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){return ans;}
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        Boolean l2r = true;

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>(Collections.nCopies(size, 0));
            for(int i =0; i<size ; i++){
                TreeNode node = q.poll();
                int index = l2r?i:size-i-1;
                level.set(index,node.val);
                if(node.left!=null){q.offer(node.left);}
                if(node.right!=null){q.offer(node.right);}
            }
            l2r = !l2r;
            ans.add(level);
        }
        return ans;
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

        System.out.println(zigzag(root));
    }
    
}
