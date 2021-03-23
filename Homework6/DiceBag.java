package hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// This class holds the dice(or tokens) to be drawn.
//
public class DiceBag {
	private List<Token> bag = new ArrayList<Token>();
	
	public void addToken(Token t) {
		bag.add(t);
	}

	public Token drawToken() {
		int upperRange = bag.size();
		
		if (upperRange == 0 ) {
			return null;
		}
		
		Token t = null;
		if (upperRange > 0 ) {
			int die = ThreadLocalRandom.current().nextInt(0, upperRange);
			t = bag.remove(die);
		}
		return t;
	}
	
	public String toString() {
		String ret = " Dice left: " + bag.size() + "\n";
		
		for (Token t:bag) {
			ret += t.toString() + "\n";
		}
		
		return ret;
	}
	
	// method for testing color
	public string getColorsInBag() {
		int red = 0;
		int blue = 0;
		for ( int i=0; i<bag.size(); i++) {
			if ( bag.get(i) instanceof orderDie) {
			orderDie ODie = (OrderDie) bag.get(i);
			if (ODie.getColor().equals("red")) {
				red= +1;
			}
				else (ODie.getColor().equals("blue")) {
					blue = +1;
				}
							
		}
			return "red: "+ red +"\nblue: " + blue;
	}
}
