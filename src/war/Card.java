package war;

public class Card {
	
	public int value;
	public String name; 
	
	
	public Card(int cardValue, String cardName) {
		this.value= cardValue;
		this.name= cardName;
	}
	
//Getter and setter methods below
	
	public void setValue (int cardValue) {
		this.value =cardValue;	
		}
	public void setName (String cardName) {
		this.name =cardName;
	}
	public int getValue () {
		return value;
	}
	public String getName () {
		return name;
	}
	public String describe() {
		return name +":"+value;
	}

	}
	
	