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
			String s = arr[x];
			if(!isOperator(s))//number
				nums.push(s);
			else
			{
				if(ops.empty())
					ops.push(s);
				else
					if(precedence(s)>precedence(ops.peek()))
						ops.push(s);
					else
												
			}
		}
	}
	
	private void compute(Stack nums, Stack ops)
	{
		while(lastInStack(nums))
		{
			
		}
	}
	
	private boolean lastInStack(Stack s)
	{
		String temp = (String)s.pop();
		if(s.empty())
		{
			s.push(temp);
			return true;
		}
		s.push(temp);
		return false;
	}
	private int precedence(String q)
	{
		int s = -1;
		if(q.equals("("))
			s = 0;
		else if(q.equals(")"))
			s = 1;
		else if(q.equals("^"))
			s = 2;
		else if(q.equals("*"))
			s = 3;
		else if(q.equals("/"))
			s = 3;
		else if(q.equals("+") || q.equals("-"))
			s = 4;
		return s;
	}
	
	private boolean isOperator(String s)
	{
		return !s.matches("-?[0-9]+(\\.[0-9]*)?");		
	}
}
