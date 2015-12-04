package funHaus2;

import static java.lang.System.*;

public class ListFunHouseTwo
{
	private ListNode list;
	
	public ListFunHouseTwo()
	{
		
	}
	
	public void add(Comparable data)
	{
		if(list==null){
			list=new ListNode(data,null);
			list.setNext(list);
		}
		else{
			ListNode head= list;
			ListNode last=list;
			list=list.getNext();
			while(list!=head){
				last=list;
				list=list.getNext();
			}
			last.setNext(new ListNode(data,head));
		}
			
	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
		int count = 0;
		ListNode z = list.getNext();
		while (z!=null&&z.getNext()!=list) {
			z = z.getNext();
			count++;
		}
		return count+1;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		ListNode z = new ListNode(list.getValue(), list.getNext());
		list.setNext(z);
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
		ListNode n = list;
		while(n.getNext()!=list)
			n=n.getNext();
		n.setNext(new ListNode (n.getValue(),list));
		
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{
		removeXthNode(2);
	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{
		int count = 0;
		ListNode temp= list.getNext();
		while(temp!=list){
			if(count%x==0)
				temp.setValue(value);
			temp=temp.getNext();
			count++;
		}	
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{
		int count = 1;
		ListNode last=null;
		ListNode temp= list.getNext();
		while(temp!=list){
			if(count%x==0)
				last.setNext(temp.getNext());
			temp=last;
			temp=temp.getNext();
			count++;
		}	
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
	   ListNode z =list;
		while (z.getNext()!=list) {
			System.out.println(z.getValue());
			z = z.getNext();
		}
		return ""+z.getValue();
   }			
	
}