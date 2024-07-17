import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TreeNode{
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }


}

class Pair{
    TreeNode node;
    int y;

    public Pair(TreeNode node, int y){
        this.node = node;
        this.y = y;
    }
}

 class Lc_199_BT_RightSideView{

    public List<Integer> rightSideView(TreeNode root) {
        
        List <Integer> result = new ArrayList<>();
        if(root == null) return result;

        Map <Integer, Integer> map = new TreeMap<>();
        Queue <Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        while(!q.isEmpty()){

            Pair currentPair = q.poll();

            map.put(currentPair.y , currentPair.node.val);

            if(currentPair.node.left != null){
                q.offer(new Pair(currentPair.node.left, currentPair.y - 1));
            }
            if(currentPair.node.right != null){
                q.offer(new Pair(currentPair.node.right, currentPair.y - 1));
            }

            
        }
        for(var entry : map.entrySet()){
            result.add(0, entry.getValue());
        }
         return result;
    }
}
