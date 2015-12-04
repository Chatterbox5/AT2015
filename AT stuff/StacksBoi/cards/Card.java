package cards;

public class Card implements Comparable<Card>{

	private int suit;
	private int value;
	
	public Card(){
		value=3;
		suit=1;
	}
	
	public Card(int myValue, int mySuit){
		value=myValue;
		suit=mySuit;
	}
	
	public String getValue(){
		String str;
		if(value==2)
			str="2";
		else if(value==3)
			str="3";
		else if(value==4)
			str="4";
		else if(value==5)
			str="5";
		else if(value==6)
			str="6";
		else if(value==7)
			str="7";
		else if(value==8)
			str="8";
		else if(value==9)
			str="9";
		else if(value==10)
			str="10";
		else if(value==11)
			str="J";
		else if(value==12)
			str="Q";
		else if(value==13)
			str="K";
		else
			str="A";
		
		return str;
	}
	
	public String getSuit(){
		String str;
		if(suit==1)
			str="clubs ";
		else if(suit==2)
			str="diamonds ";
		else if(suit==3)
			str="hearts ";
		else 
			str="spades ";

		
		return str;
	}
	
	public String toString(){
		return getValue()+" of "+getSuit();
	}

	@Override
	public int compareTo(Card arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
