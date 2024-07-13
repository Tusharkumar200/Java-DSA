import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(){}
    TreeNode(int val){this.val = val;}
    TreeNode(int val, TreeNode left , TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Lc_103_Zig_Zag_Traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List <List<Integer>> result = new LinkedList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        boolean isLeft = true;
        q.offer(root);

        while(!q.isEmpty()){
            List<Integer> temp = new LinkedList<>();
            int size = q.size();

            for(int i=0 ; i<size; i++){
                TreeNode currentNode = q.poll();

                if(isLeft) temp.add(currentNode.val);
                else temp.add(0, currentNode.val);

                if(currentNode.left != null){
                    q.offer(currentNode.left);
                }

                if(currentNode.right != null){
                    q.offer(currentNode.right);
                }
            }
            result.add(temp);
            isLeft = !isLeft;
        }
        return result;
    }
}
