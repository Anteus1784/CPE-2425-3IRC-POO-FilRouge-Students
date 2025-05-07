package model.cards;

import java.util.Comparator;

/**
 * Ce comparateur de Card compare les valeurs (Rank) des cartes
 * et en cas d'égalité leur couleur (Suit) 
 * 
 * @author francoise.perrin
 */
public class NewWarGameCardComparator implements Comparator<Card>{

	@Override
	public int compare(Card card1, Card card2) {
		int result = card1.getRank().compareTo(card2.getRank());
		if (result == 0) {
			result = card1.getSuit().compareTo(card2.getSuit());
		}
		return result;
	}
}