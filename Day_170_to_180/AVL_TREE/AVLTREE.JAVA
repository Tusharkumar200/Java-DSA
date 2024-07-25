package AVL_TREE;

class AVLNODE{
    int data;
    AVLNODE left;
    AVLNODE right;

    AVLNODE(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class AVLTREE{

    private AVLNODE root;

    private AVLNode insert(AVLNode root, int value){
        if(node == null){
            return new AVLNode(value);
        }

        if(root.value == value){
            return root;
        }

        if(value < node.data){
            node.left = insert(node.left, value);
        }else{
            node.right = insert(node.right, value);
        }

        return root;
    }   

    public void insert(int value){
        root = insert(root, value);
    }

    public String toString(){
        return "Value ="+ this.value;
    }
}