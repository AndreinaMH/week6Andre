 package war;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	private List <Card> cards;
	
	public Deck () {
		cards = new ArrayList <>();
		String[]suits = {"Hearts","Diamonds","Clubs","S[ades"};
		String[]names = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		int value;
		
		for (String suit : suits) {
			for (String name : names) {
				
				value = switch (name) {
				case "Jack"->11;
				case "Queen"->12;
				case "King"->13;
				case "Ace"->14;
				default->
				
				Integer.parseInt(name);
				};
			cards.add(new Card (value, name+" of"+suit));
		}
		}	
	}

	public void shuffle () {
		Collections.shuffle (cards);	
	}

	public Card draw() {
	if (cards.isEmpty ()) {
		return null;
	}
		return cards.remove(0);
	}
}