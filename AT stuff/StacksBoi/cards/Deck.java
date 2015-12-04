package cards;
import java.util.Stack;

public class Deck { 

	Stack<Card> deck; 

	public Deck() 
	{
		deck=new Stack<Card>();
	}

	public Stack<Card> getDeck() 
	{
		return deck; 
	} 

	// Load the stack with 52 cards in order 

	public void loadDeck()
	{
		for(int suits = 1; suits <= 4; suits++)
			for(int cards = 2; cards <= 14; cards++)
			{
				deck.push(new Card(cards, suits));
			}
	}

	public String toString() 
	{
		String s = "";
		for(int x = 0; x < 13; x++)
		{
			for(int y = 0; y < 4; y++)
			{
				s += deck.pop()+"\t";
			}
			s += "\n";
		}
		return s;		
	} 

	// Return and remove the top card 

	public Card deal() 
	{
		return deck.pop();	
	} 

	// Take the top half of the deck (26 cards) and alternate card by card with 

	// the bottom half 

	public void bridgeShuffle() 
	{
		Stack top= new Stack<Card>();
		Stack bot= new Stack<Card>();
		loadDeck();
		for(int x=0; x<27; x++){
			top.push(deck.pop());
		}

		for(int x=0; x<27; x++){
			bot.push(deck.pop());
		}
		
		while(deck.size()!=52){
			deck.push((Card) top.pop());
			deck.push((Card) bot.pop());
		}
	} 
	public Stack reverse( Stack d){
		Stack newStack= new Stack();
		while(!d.empty()&& d.peek()!=null)
			newStack.push(d.pop());
		return newStack;
	}

	// split the deck at a random spot. Put the stack of cards above the random 

	// spot below the other cards 

	public void cut() 
	{
		int spot= (int) (Math.random()*51+1);
		Stack top= new Stack<Card>();
		Stack bot= new Stack<Card>();
		for(int i=0; i<=spot; i++)
		{
			bot.push(deck.pop());
		}
		while(!deck.isEmpty())
			top.push(deck.pop());
		top=reverse(top);
		while(!top.isEmpty())
			bot.push(top.pop());
		
		deck=bot;
		
	} 

	// complete a bridge shuffle and then cut the deck. Repeat 7 times 

	public void completeShuffle() 
	{
		for(int x = 0; x < 8; x++)
		{
			bridgeShuffle();
			cut();
		}
	} 

	public static void main(String[] args) 
	{ 
		Deck deck = new Deck();
		deck.loadDeck();
		System.out.println(deck);
		deck.loadDeck();
		deck.bridgeShuffle();
		System.out.println(deck);
		deck.loadDeck();
		deck.cut();
		System.out.println(deck);
		deck.loadDeck();
		deck.completeShuffle();
		System.out.println(deck);
	}

}