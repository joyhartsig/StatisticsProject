import java.util.ArrayList;
import java.util.Collections;

public class HandEvaluator
{    
    ArrayList<Card> hand = new ArrayList<Card>();
    
    public ArrayList<Card> getHand(){
        Deck d = new Deck();
        
        d.getDeck();
        d.shuffleDeck();
        
        
        for(int i=0; i < 5; i++){
            hand.add(d.drawCard());
        }
        
        System.out.println(hand);
        
        return hand;
    }
    
    public int testPair(){
        int count = 0;
        System.out.println(hand);
        
        //System.out.println((hand.get(0)).getNumber());
        
        for(int i=0; i < 5; i++){
            for(int j = i + 1; i < 5; i++){
                if((hand.get(i)).getNumber()==(hand.get(j)).getNumber()){
                    count = 1;
                }
            }
        }
        
        System.out.println(count);
        
        return count = 0;
    }
    
    
    
    
}

