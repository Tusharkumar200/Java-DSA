
package AVL_TREE;

public class main {
    public static void main(String args[]){
        
        AVLTREE tree = new AVLTREE();
        int[] values = new int[]{7,5,8,2,4,6};

        for(int val: values){
            tree.insert(val);
        }
        System.out.println(tree);
    }
}
