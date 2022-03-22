import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
    public ArrayList<Card> deck;
    
    public Deck(){
        deck = new ArrayList<Card>();
        
        for(int i = 1; i < 13; i++){
            deck.add(new Card("Diamonds", i));
            deck.add(new Card("Hearts", i));
            deck.add(new Card("Spades", i));
            deck.add(new Card("Clubs", i));
        }
    }
    
    public ArrayList<Card> getDeck(){
        return deck;
    }
    
    public ArrayList<Card> shuffleDeck(){
        Collections.shuffle(deck);
        
        return deck;
    }
        
    public Card drawCard(){
        return deck.remove(0);
    }
}
