package bodmas;
import java.util.Stack;
public class Operands {

	public static int notationToNum(String in){
		if(in.contains("(")){
			int open = in.indexOf("(");
			int close = in.substring(open + 1).indexOf(")");

			String fixed = "";
			fixed += in.substring(0, open) + notationToNum2(in.substring(open + 1, close)) + in.substring(open);
			return notationToNum2(fixed);
		}
		//"3 * ( 4 + 2 ) + 5"
		else
			return notationToNum2(in);

	}
	private static int notationToNum2(String string) {
		String[] str = string.split(" ");
		Stack<Integer> numbers = new Stack<Integer>();
		Stack<String> operators = new Stack<String>();
		int sum = 0;
		int i = 2;

		if(str.length < 2)
			return Integer.parseInt(str[0]);
		else{
			numbers.add(Integer.parseInt(str[0]));
			operators.add(str[1]);
		}

		while ( i < str.length - 1) {
			numbers.add(Integer.parseInt(str[i]));
			i++;


			while(!operators.isEmpty() && !isHigherPrecedence(str[i], operators.peek())){
				sum = evaluate(numbers, operators);
				numbers.add(sum);
			}

			operators.add(str[i]);
			i++;
		}

		numbers.add(Integer.parseInt(str[i]));
		while(!operators.isEmpty()){
			sum = evaluate(numbers, operators);
			numbers.add(sum);
		}


		return sum;
	}




	private static int evaluate(Stack<Integer> nums, Stack<String> operators) {
		String operator = operators.pop();
		int second = nums.pop();
		int first = nums.pop();

		if (operator.equals("+"))
			return first + second;
		else if (operator.equals("-"))
			return first - second;
		else if (operator.equals("*"))
			return first * second;
		else if (operator.equals("/"))
			return first / second;
		else if (operator.equals("^"))
			return (int) Math.pow(first, second);

		return 0;

	}



	private static boolean isHigherPrecedence(String a, String b) {
		int x = enumerateOperator(a);
		int y = enumerateOperator(b);

		return x >= y;
	}

	private static int enumerateOperator(String a) {

		if (a.equals("+") || a.equals("-")) {
			return 1;
		} else if (a.equals("*") || a.equals("/")) {
			return 2;
		} else
			return 3;
	}
}