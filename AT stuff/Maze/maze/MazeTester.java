package maze;

public class MazeTester {

	public static void main(String args[])
	{
	   char[][] m = {
	      {'*', ' ', '*', '*', '*', '*', '*', '*', '*'}, 
	      {'*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*'}, 
	      {'*', ' ', '*', '*', '*', '*', '*', ' ', '*'}, 
	      {'*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*'}, 
	      {'*', ' ', '*', '@', '*', '*', '*', ' ', '*'}, 
	      {'*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*'}, 
	      {'*', '*', '*', ' ', '*', ' ', '*', ' ', '*'}, 
	      {'*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*'}, 
	      {'*', '*', '*', '*', '*', '*', '*', '*', '*'}};
	      
	 
	   Maze maze = new Maze(m, 3, 4); //(m, xStart, yStart)
	   maze.display();
	  
	   if (maze.findExit())
	      System.out.println("There is an exit at (" + maze.getXExit() + ", "
	            + maze.getYExit() + ")");
	   else
	      System.out.println("No exit was found");
	   
	   System.out.println();
	   System.out.println();
	   maze.display();
	   System.out.println("Steps:" + maze.getSteps());
	   
	}


}
