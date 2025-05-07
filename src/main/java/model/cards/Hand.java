package model.cards;

import java.util.*;

import allShared.ICardsCollection;


/**
 * Objet qui contient l'ensemble des cartes de la main d'un joueur
 * Il est capable d'exécuter les traitements communs à toutes 
 * les collections de cartes (ajouter, supprimer, mélanger, trier, etc.)
 * et en plus révéler, cacher, jouer une carte
 * 
 * @author francoise.perrin
 */
public class Hand extends AbstractCardsCollection {

	public Hand() {
		super();
	}

	public Hand(Collection<Card> collection) {
		super(collection);
	}

	public Hand(ICardsCollection iCardsCollection) {
		super(iCardsCollection);
	}

	/**
	 * @param index
	 * @return la carte à jouer si elle existe
	 * Supprime la carte de la liste
	 */
	public Card playCard(int index) {
		Card card = null;
		if (!isEmpty() && index >= 0 && index < size()) {
			card = cards.get(index);
			cards.remove(index);
		}
		return card;
	}

	/**
	 * @param index
	 * @return true si la carte existe 
	 */
	public boolean revealeCard(int index) {
		if (!isEmpty() && index >= 0 && index < size()) {
			cards.get(index).reveale();
			return true;
		}
		return false;
	}


	/**
	 * @param index
	 * @return true si la carte existe 
	 */
	public boolean hideCard(int index) {
		if (!isEmpty() && index >= 0 && index < size()) {
			cards.get(index).hide();
			return true;
		}
		return false;
	}
}