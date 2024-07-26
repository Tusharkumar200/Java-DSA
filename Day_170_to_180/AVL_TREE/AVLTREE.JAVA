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
        root.height = Math.max(height(node.left), height(node.right)) +1;

        if(!isBalanced(root)){
            
            if(isLeftHeavy(root)){
                if(getBalenceFactor(root.left) < 0){
                    
                    root.left = leftRotate(root.left);
                }
                System.out.print(("Right Rotate: "+ root));
            }
            else if(isRighttHeavy(root)){
                if(getBalenceFactor(root.right) > 0){
                    System.out.print(("right Rotate: "+ root.right));
                }
                root=leftRotate(root);
                System.out.print(("Left Rotate: "+ root));
            }
        }

        return root;
    }   

    public void insert(int value){
        root = insert(root, value);
    }

    // Detecting Imbalanced Node
        private int getBalenceFactor(AVLNODE  node){
            if(node == null) return 0;
            return getHeight(node.left) - getHeight(node.right);

            
        }

        private int height(AVLNODE node){
            if(node == null) return -1;
            return node.height;
        }

        private boolean isBalanced(AVLNODE node){
            if(node == null) return true;
            int balanceFactor = getBalenceFactor(node);
            return balanceFactor >= -1 && balanceFactor <=1;
        }

        private boolean isLeftHeavy(AVLNODE node){

            if(node == null) return false; 
            int balenceFactor = getBalenceFactor(node);
            return balenceFactor  > 1;
        }

        private boolean isRighttHeavy(AVLNODE node){

            if(node == null) return false; 
            int balenceFactor = getBalenceFactor(node);
            return balenceFactor  < -1;
        }
    

        private AVLNode leftRotate(AVLNODE node){
            
            if(root == null) return null;
            AVLNODE newRoot = root.right;
            root.right = newRoot.left;
            newRoot.left = root;
            return newRoot;
        }
        private AVLNode rightRotate(AVLNODE node){
            
            if(root == null) return null;
            AVLNODE newRoot = root.left;
            root.left = newRoot.right;
            newRoot.right = root;
            return newRoot;
        }

    public String toString(){
        return "Value ="+ this.value;
    }
}