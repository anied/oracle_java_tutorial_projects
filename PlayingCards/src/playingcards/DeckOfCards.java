/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingcards;

/**
 *
 * @author user1
 */
public class DeckOfCards {

    public PlayingCard[] deck = new PlayingCard[52]; // This probably wouldn't be public in a more formal setting...
    
    public DeckOfCards() {
        final String[] suits = {"Spades", "Clubs","Diamonds", "Hearts"};
        final int highestRank = 13;
        int suitsIndex = 0;
        
        for (String suit : suits) {
            for (int i = 0; i < highestRank; i++) {
                deck[i + (suitsIndex*highestRank)] = new PlayingCard(i+1, suit); // i+1 because ranks are normalized as starting at "1" instead of "0"
            }
            suitsIndex++;
        }
        
    }
 
}
