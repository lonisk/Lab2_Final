package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		
		Deck deck1 = new Deck(1);
		int size = deck1.getSize();
		Deck deck2 = new Deck(6);
		int size2 = deck2.getSize();
		
		assertTrue(size == 52);
		assertTrue(size2 == 312);
		
	}

}
