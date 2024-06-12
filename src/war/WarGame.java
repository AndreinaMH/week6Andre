package war;

import java.util.concurrent.TimeUnit;

public class WarGame {

	public static void main(String[] args) 
	throws InterruptedException {
		Deck deck = new Deck ();
		deck.shuffle();
		Card cardP1;
		Card cardP2;
		int P1Value;
		int P2Value;
		Player P1 = new
				Player ("Andre");
		Player P2 = new 
				Player ("John");
		Player winner;
		for (int i = 0; i <26; i++) {
			P1.draw (deck);
			P2.draw (deck);
		}
		for (int i = 0; i<26; i++) {
			cardP1 = P1.flip();
			cardP2 = P2.flip();
			
			P1Value = cardP1.getValue ();
			P2Value = cardP2.getValue ();
			
			System.out.println ("Flip cards!\n");
		TimeUnit.SECONDS.sleep(2);
		
		System.out.println (P1.getName() + "'s card: " + cardP1.describe());
		System.out.println (P2.getName() + "'s card: " + cardP2.describe() +
		"\n");
		TimeUnit.SECONDS.sleep(3);
		
		if(P1Value > P2Value){
			P1.incrementScore();
			System.out.println(P1.getName()+ "Scores!\n");
		} else if (P2Value > P1Value) {
			P2.incrementScore();
			System.out.println(P2.getName() + "Scores!\n");
		} else {
			System.out.println ("Tie!\n");
		}
		TimeUnit.SECONDS.sleep(2);
		System.out.print(P1.getName() + " 's score: " + P1.getScore() +"-");
		System.out.print(P2.getName() + " 's score: " + P2.getScore() +"\n\n");
		
		TimeUnit.SECONDS.sleep(2);
		}
		System.out.println (P1.describe());
		System.out.println (P2.describe());
		
		winner = (P1.getScore() > P2.getScore()) ? P1 : P2;
		
		if (P1.getScore() == P2.getScore()) {
			System.out.println ("Draw!");
		} else {
			System.out.println ("Winner is" + winner.getName ());
		}
	}
}
