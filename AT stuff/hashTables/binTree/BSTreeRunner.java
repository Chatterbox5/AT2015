package binTree;


public class BSTreeRunner
{
   public static void main( String args[] )
   {
		BinarySearchTree bob = new BinarySearchTree();
		bob.add(new Integer(90));
		bob.add(new Integer(80));
		bob.add(new Integer(85));
		bob.add(new Integer(70));
		bob.add(new Integer(100));
		bob.add(new Integer(98));
		bob.add(new Integer(120));
	
		bob.display();
		System.out.println("");
		
		System.out.println("Height\t\t" 	+bob.getHeight());
		System.out.println("Width\t\t" 		+bob.getWidth());
		System.out.println("numLevels\t" 	+bob.getNumLevels());
		System.out.println("numLeaves\t" 	+bob.getNumLeaves());
		System.out.println("numNodes\t" 	+bob.getNumNodes());
		System.out.println("isFull\t\t" 	+bob.isFull());
		System.out.println("maxNode\t\t" 	+bob.maxNode().toString());
		System.out.println("minNode\t\t" 	+bob.minNode().toString());
		System.out.println("search 30\t" 	+bob.search(new Integer(30)));
		System.out.println("search 98\t" 	+bob.search(new Integer(98)));
		System.out.println("remove 100\t");
		bob.remove(new Integer(100));
		System.out.println("search 100\t" 	+bob.search(new Integer(100)));
		bob.inOrder();
 		
   }
}