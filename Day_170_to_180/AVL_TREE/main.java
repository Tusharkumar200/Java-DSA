
package AVL_TREE;

import AVL_TREE.AVLTREE; // Add this import statement

public class Main {
	public static void main(String args[]){
		
		AVLTREE tree = new AVLTREE();
		// int[] values = new int[]{7,5,8,2,4,6};
		int[] values = new int[]{10,5,3};

		for(int val: values){
			tree.insert(val);
		}
		System.out.println(tree);
	}
}
