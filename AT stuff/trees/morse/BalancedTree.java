package morse;

import binTree.TreeNode;

public class BalancedTree extends BinarySearchTree{

	public BalancedTree(Object[] args){
		setRoot(balance(args));
	}

	public TreeNode balance(Object[] args){
		return balance(args, 0, args.length - 1);
	}

	public TreeNode balance(Object[] args, int start, int end){
		if(start > end){
			return null;
		}

		int mid = start + (end-start) / 2;

		TreeNode node = new TreeNode((Comparable)args[mid]);


		node.setLeft( balance(args, start, mid - 1));
		node.setRight(balance(args, mid + 1, end));

		return node;
	}

	public String getMorse(Comparable val) {

		return getMorse(root(), val, "");
	}

	public String getMorse(TreeNode tree, Comparable val, String ret){


		int compare = val.compareTo(tree.getValue());
		boolean where = search(tree.getLeft(), val);

		if(tree == null || compare == 0)
			return ret;

	
		else if(where)
			return getMorse(tree.getLeft(), val, ret+"-");
		else
			return getMorse (tree.getRight(), val, ret+".");
	

	}


	public String getEng(Comparable val) {

		return getEng(root(), val);
	}

	public String getEng(TreeNode tree, Comparable val){

		if(((String) val).length() == 1){
			if(val.equals("."))
				return (String) tree.getRight().getValue();
			else 
				return (String) tree.getLeft().getValue();
		}
		else{
			String z = ((String) val).substring(0, 1);
			if(z.equals("."))
				return getEng(tree.getRight(), ((String) val).substring(1, ((String) val).length()));
			else
				return getEng(tree.getLeft(), ((String) val).substring(1, ((String) val).length()));
		}
	}

	public static void main(String args[]){
		Object[] data = new Object[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

		BalancedTree x = new BalancedTree(data);
		System.out.println("InOrder");
		x.inOrder();
		TreeNode temp = x.root();
		System.out.println("");
		System.out.println("Root is :" + x.root());




	}
}