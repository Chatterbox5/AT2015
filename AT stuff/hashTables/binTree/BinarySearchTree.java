package binTree;

import static java.lang.System.*;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree
{
	private TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}

	public void add(Comparable val)
	{
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree)
	{
	   if(tree == null){
			tree = new TreeNode(val);
	   	return tree;
	   }	
		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);
		
		if(dirTest <= 0)
			tree.setLeft(add(val, tree.getLeft()));
		else if(dirTest > 0)
			tree.setRight(add(val, tree.getRight()));
		return tree;
	}

   public void inOrder()
	{
		inOrder(root);
		System.out.println("\n");
	}

	private void inOrder(TreeNode tree)
	{
		if (tree != null){
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}

	public void preOrder()
	{
		preOrder(root);
		System.out.println("\n");
	}

	private void preOrder(TreeNode tree){
		if(tree != null){
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getLeft());
			inOrder(tree.getRight());

		}
	}
	
	public void postOrder()
	{
		postOrder(root);
		System.out.println("\n");
	}

	private void postOrder(TreeNode tree){
		if(tree != null){
			inOrder(tree.getLeft());
			inOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
		}
	}
	
	public void revOrder()
	{
		revOrder(root);
		System.out.println("\n");
	}
	
	private void revOrder (TreeNode tree){
		if (tree != null){
			revOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
			revOrder(tree.getLeft());
		}
	}

	public TreeNode getRoot() {
		return root;
	}

	public void levelOrder(){

		Queue<Comparable> q = new LinkedList<Comparable>();
		q.add(root.getValue());

		levelOrder(root, q);

		for(Comparable x : q)
			System.out.print(x + " ");
		
		System.out.println("");

			
	}

	private void levelOrder(TreeNode tree, Queue<Comparable> list){
		if(tree == null)
			return;
		if(tree.getLeft() != null)
			list.add(tree.getLeft().getValue());

		if(tree.getRight() != null)
			list.add(tree.getRight().getValue());

		levelOrder(tree.getLeft(), list);

		levelOrder(tree.getRight(), list);
	}
	
	public int getNumLeaves(){
		return getNumLeaves(root);
	}

	private int getNumLeaves(TreeNode tree){
		if(tree == null)
			return 0;
		else if(tree.getLeft() == null && tree.getRight() == null)
			return 1;
		else	
		return	(getNumLeaves(tree.getLeft()) + getNumLeaves(tree.getRight()));
	}

	public int getNumNodes() {
		return getNumNodes(root);		
	}
	
	public int getNumNodes(TreeNode tree) {
		if(tree == null)
			return 0;
		else if(tree.getLeft() == null && tree.getRight() == null){
			return 1;
		}
		else return 1 + getNumNodes(tree.getRight()) + getNumNodes(tree.getLeft());
	}
	
	public boolean isFull(){
		return isFull(root);
	}

	private boolean isFull(TreeNode tree){
		if(tree.getLeft() == null && tree.getRight() == null)
			return true;
		else if(tree.getLeft() != null && tree.getRight() != null)
			return isFull(tree.getLeft()) && isFull(tree.getRight());
		else 
			return false;

	}
	
	public boolean search(Comparable val) {
		return search(root, val);
	}
		
	public boolean search(TreeNode tree, Comparable val){
		if(tree == null)
			return false;


		if(tree.getValue().equals(val))
			return true;


		return search(tree.getLeft(), val) || search (tree.getRight(), val);
		
	}
	
	public TreeNode maxNode() {
		return maxNode(root);
		
	}
	
	private TreeNode maxNode(TreeNode tree) {
		if(tree != null){
			if(tree.getRight() != null)
				return maxNode(tree.getRight());
			else return tree;
		}
		else return null;
	}

	public TreeNode minNode() {
		return minNode(root);
	}
	
	private TreeNode minNode(TreeNode tree){
		if(tree != null){
			if(tree.getLeft() != null)
				return 
						minNode(tree.getLeft());
			else return tree;
		}
		else return null;
	}
	
	
	
	private TreeNode remove(Comparable val, TreeNode tree){
		
		if(tree != null){
			int dirTest = val.compareTo(tree.getValue());
			
			if(dirTest < 0){
				tree.setLeft(remove(val, tree.getLeft()));
			}
			else if(dirTest > 0){
				tree.setRight(remove(val, tree.getRight()));
			}
			else{
				if(tree.getRight() == null)
					tree = tree.getLeft();
				else{
					TreeNode successor = minNode(tree.getRight());
					tree.setValue((Comparable<Integer>) successor.getValue());
					tree.setRight(remove(successor.getValue(), tree.getRight()));
				}
			}
		}
		return tree;
	}
	
	public void remove(Comparable val) {
		root = remove(val, root);
	}
		
	public int getWidth(){
		return getWidth(root);
	}
	
	private int getWidth(TreeNode tree) {
		if(tree == null)
			return 0;
		
		int a = getNumLevels(tree.getRight()) + getNumLevels(tree.getLeft()) + 1;
		int b = getNumLevels(tree.getRight());
		int c = getNumLevels(tree.getLeft());
		
		return Math.max(a, Math.max(b,  c));
	}

	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree==null)
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
			return 1+getNumLevels(tree.getLeft());
		else
			return 1+getNumLevels(tree.getRight());
	}

	public int getHeight(){
		int ret = getNumLevels();
		if(ret == 0)
			return ret;
		else	
			return  ret - 1;
	}

	public void display()
	{
		System.out.print("inOrder\t\t");
		this.inOrder();
		System.out.print("preOrder\t");
		this.preOrder();
		System.out.print("postOrder\t");
		this.postOrder();
		System.out.print("revOrder\t");
		this.revOrder();
		System.out.print("levelOrder\t");
		this.levelOrder();
	}

}