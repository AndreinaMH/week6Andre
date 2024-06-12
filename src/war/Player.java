package war;

import java.util.ArrayList;
import java.util.List;

public class Player{
	private final List<Card> hand;
	private int score;
	private final String name;
	
	public Player (String namePlayer) {
		this.name=namePlayer;
		this.hand=new ArrayList <>();
		this.score=0;
	}
	public String describe() {
		String describeCards="";
		for (Card card : hand) {
			describeCards +=
					card.describe () +"\n";
		}
		return "Name: "+ name + " - Score: " + score + " - Cards: \n " + describeCards;
	}
	public Card flip () {
		if(hand.isEmpty()) {
			return null;
		}
	return hand.remove(0);
	}
public String getName () {
	return name;
}
public int getScore () {
	return score;
}
public void draw (Deck deck) {
	hand.add(deck.draw());
}
public void incrementScore() {
	score++;
}
}

