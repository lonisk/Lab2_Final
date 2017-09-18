package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		ArrayList<Card> cards = new ArrayList<Card>();
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		int cardAce = 0;
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);
		
		
		for (Card c: cards)
		{
			switch(c.geteRank())
			{
			case ACE:
				iScore[0] = iScore[0] +1;
				if (cardAce == 0)
				{
					iScore[1] = iScore[1] + 11;
				}
				else 
				{
					iScore[1] = iScore[1] + 1;
				}
				cardAce++;
				break;
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case TEN:
				iScore[0]=iScore[0] + c.geteRank().getiRankNbr();
				iScore[1]=iScore[1] + c.geteRank().getiRankNbr();
				break;
			case JACK:
			case QUEEN:
			case KING:
				iScore[0]=iScore[0] + 10; 
				iScore[1]=iScore[1] + 10; 
				break;
			}

		}
		
		return iScore;
	}
	
	public void Draw(Deck d)
	{
		cards.add(d.Draw());
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
