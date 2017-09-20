package pkgCore;

import java.util.ArrayList;
import java.util.Collections;
import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	public ArrayList<Card> cardsInDeck;

	public Deck(int inumber) {
		
		ArrayList<Card> cardsInDeck1 = new ArrayList<Card>();
		for (int i = 0; i< inumber; i++) 
			{
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck1.add(new Card(eRank, eSuit));
			}
	}
		}
		Collections.shuffle(cardsInDeck1);
		cardsInDeck = cardsInDeck1;
	}

	public Card Draw() {
		return cardsInDeck.remove(0);
	}
	public int getSize()
	{
		return cardsInDeck.size();
	}
}