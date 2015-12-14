package bodmas;
import java.util.Stack;
public class Operands {

	public int operate(String str)
	{

		return rPN(shuntingYard(str));
	}

	private int rPN(String str){
		String[] arr=str.split(" ");  
		Stack<Integer> result = new Stack<Integer>();
		for(int i=0; i<arr.length;i++){
			if(!isOperator(arr[i]))
				result.push(Integer.parseInt(arr[i]));
			else{
				int first=result.pop();
				int sec=result.pop();
				if(precedence(arr[i])==2){
					result.push((int) Math.pow(first, sec));
				}
				else if(precedence(arr[i])==3&&isMult(arr[i])){
					result.push(first*sec);
				}
				else if(precedence(arr[i])==3){
					result.push(sec/first);
				}
				else if(precedence(arr[i])==4&&isAdd(arr[i])){
					result.push(first+sec);
				}
				else if(precedence(arr[i])==4){
					result.push(sec-first);
				}
			}
		}

		return result.pop();
	}

	private String shuntingYard(String str)
	{
		String rpn="";
		String temp="";
		String[] arr=str.split(" ");  
		Stack<String> ops = new Stack<String>();

		for(int i=0; i<arr.length;i++){
			if(!isOperator(arr[i])){
				rpn+=arr[i]+" ";
			}
			else{ 
				if(!ops.isEmpty()&&(precedence(ops.peek())<precedence(arr[i]))){
					while(!ops.empty())
						rpn+=ops.pop()+" ";	
					temp=arr[i];
				}
			}

			if(isOperator(arr[i]))
				ops.push(arr[i]);
		}

		return rpn+temp;
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

	private boolean isMult(String str){
		return str.equals("*");
	}

	private boolean isAdd(String str){
		return str.equals("+");
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