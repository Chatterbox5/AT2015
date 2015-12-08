package bodmas;
import java.util.Stack;
public class Operands {
	public static void main(String[] args)
	{
		
	}
	
	public int operate(String str)
	{
		String queue = "";
		String[] arr=str.split(" ");
		Stack nums = new Stack<String>();
		Stack ops = new Stack<String>();
		int sum;
		
		for(int x = 0; x < arr.length; x++)
		{
			if(x%2 != 0)//number
				nums.push(arr[x]);
			else
			{
				if(ops.empty() || precedence((String)ops.peek(), arr[x]))
					
			}
		}
	}
	
	public boolean precedence(String stackTop, String next)
	{
		int top, n;
		if(stackTop)
	}
}
