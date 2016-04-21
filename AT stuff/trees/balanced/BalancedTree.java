package balanced;

import binTree.TreeNode;

public class BalancedTree {

	TreeNode root;
	String thing= "0-9o. 8mgq  z 7tnkycdx  b 6";
	
	public BalancedTree (int[] data){
		setRoot(balance(data));
	}

	private void setRoot(TreeNode balance) {
		
	}

	public TreeNode balance(int arr[]){
		return balance(arr,0,arr.length-1);
	}

	public TreeNode balance(int arr[], int start, int end){
		if(start>end)
			return null;
		int mid = start+ (end-start)/2;

		TreeNode node= new TreeNode (arr[mid]);

		node.setLeft(balance(arr,start, mid-1));
		node.setRight(balance(arr,mid+1,end));
		return node;
	}

//	public static void main(String[] args){
//		int[] data=new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//		BalancedTree x= new BalancedTree(data);
//		System.out.println("InOrder");
//		x.inOrder();
//		TreeNode temp= x.getRoot();
//		System.out.println();
//		System.out.println("Root is: "+x.getRoot());
//		System.out.println();
//		System.out.println("Right Branch");
//
//	}
}
