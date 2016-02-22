package palindrome;

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{
		setList(list);
	}

	public void setList(String list)
	{
		queue=new LinkedList();
		stack=new Stack();
		String[] str= list.split(" ");
		for(int i=0; i<str.length;i++){
			queue.offer(str[i]);
			stack.push(str[i]);
		}
	}

	public boolean isPalin()
	{
		String stks="";
		String ques="";
		for(int i=0;i<=stack.size();i++){
			stks+=stack.pop()+" ";
			ques+=queue.poll()+" ";
		}
		
		return stks.equals(ques);
	}

	public String toString(){
		
		return queue.toString();
	}


	//write a toString method
}