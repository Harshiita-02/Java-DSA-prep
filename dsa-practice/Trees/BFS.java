import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    static List<List<Integer>> bfs(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){return ans;}
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i =0; i<size; i++){
                TreeNode node = q.poll();
                level.add(node.val);
                if(node.left != null){q.add(node.left);}
                if(node.right != null){q.add(node.right);}
            }
         ans.add(level);}
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

        System.out.println(bfs(root));
    }
}
