import java.util.ArrayList;
import java.util.Collections;

//the deck class has methods to create and shuffle a deck of cards
public class Deck
{
    public ArrayList<Card> deck;
    
    public Deck(){
        //initalize a new array for the deck of cards
        deck = new ArrayList<Card>();
        
        //loops through and creates all 52 cards in the deck
        //A = 1     J = 10      Q = 11      K = 12
        for(int i = 1; i < 14; i++){
            deck.add(new Card("Diamonds", i));
            deck.add(new Card("Hearts", i));
            deck.add(new Card("Spades", i));
            deck.add(new Card("Clubs", i));
        }
        
        //using the collections method to shuffle the ArrayList holding the deck of cards
        Collections.shuffle(deck);
    }
    
    //method to get the deck of cards
    public ArrayList<Card> getDeck(){
        return deck;
    }
    
    //method to draw one card
    public Card drawCard(){
        //removes the first card in the ArrayList
        return deck.remove(0);
    }
}
