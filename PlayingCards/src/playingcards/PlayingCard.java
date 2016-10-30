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
public class PlayingCard {
    private final int rank;
    private final String suit;
    private final String[] friendlyRanks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    public PlayingCard(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        
        assert(rank >=1 && rank <= 13);
        assert("Spades".equals(suit) || "Clubs".equals(suit) || "Diamonds".equals(suit) || "Hearts".equals(suit));
        
    }
    
    public int getRank() {
        return rank;
    }
    
    public String getSuit() {
        return suit;
    }
    
    public String getFriendlyRank() {
        return friendlyRanks[rank-1];
    }
    
    public String description() {
        return getFriendlyRank() + " of " + suit;
    }
    
}
