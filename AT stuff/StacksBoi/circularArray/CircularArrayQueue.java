package circularArray;

public class CircularArrayQueue {
	private int tail;
	private int size;
	private int head;
	private Object[] arr;
	
	public CircularArrayQueue(int capacity) {
		arr = new Object[capacity];
		size = tail = 0;
		head = -1;
	} 

	public void add(Object x) {
		if(head == -1){
			head = 0;
			arr[head] = x;
			tail = 1;
		}
		else if(head != tail && arr[head] != null){
			arr[tail] = x;
			tail = tailNext(tail);
		}
		else{
			Object[] ret = new Object[arr.length*2];
			System.arraycopy(arr, head, ret, 0, arr.length - tail);
			System.arraycopy(arr, 0, ret, arr.length - tail, tail);
			tail = size;
			head = 0;
			arr = ret;
			arr[tail] = x;
			tail = tailNext(tail);
		}
		size++;
	} 

	public Object remove() {
		Object ret = arr[head];
		arr[head] = null;
		head = headNext(head);
		size--;
		return ret;
	} 

	public int size() {
		return size;
	} 
	
	public String toString(){
		String ret = "";
		for(Object x : arr){
			if(x == null)
				ret += "Null ";
			else
				ret +=x + " ";
		}
		return ret;
	}
	
	private int headNext(int x){
		x++;
		if(x == arr.length)
			x = 0;
		
		return x;
	}
	
	private int tailNext(int x){
		x++;
		if(x == arr.length)
			x = 0;
		
		return x;
	}

	
}