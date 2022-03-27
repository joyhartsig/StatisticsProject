import java.util.ArrayList;
import java.util.*;

//the hand evaluator class tests each of the 7 possible hands for poker
public class HandEvaluator
{    
    public ArrayList<Card> getHand(){
        //creates a new instance of the deck class
        Deck d = new Deck();
        
        //creates an ArrayList for a hand(5 cards)
        ArrayList<Card> hand = new ArrayList<Card>();
        
        //gets the shuffled deck
        d.getDeck();
        //System.out.println("deck: "+d.getDeck());
        //System.out.println("number of cards in deck: "+d.getDeck().size());        
        
        //loops 5 times to draw 5 random cards from the shuffled deck
        for(int i=0; i < 5; i++){
            hand.add(d.drawCard());
        }
        
        //System.out.println(hand);
        Collections.sort(hand, new MyComparator());
        
        return hand;
    }
    
    //method to calculate the probability as a percentage
    public double getProbability(double x){
        double probability = (x / 10000) * 100;
        
        return probability;
    }
    
    public boolean testPair(ArrayList<Card> hand){
        int count = 0;
        
        //System.out.println("Pair?");
        //System.out.println(hand);
        
        //loops through the 5 card hand to determine if there is 2 and only 2 matching numbers
        for(int i=0; i < 5; i++){
            for(int j = i + 1; j < 5; j++){
                if((hand.get(i)).getNumber()==(hand.get(j)).getNumber()){
                    count++;
                }
            }
        }
        //System.out.println("count: "+count);
        if (count == 1){
            //System.out.println("pair!");
           return true;
        }
        
        return false;
    }
    
    public boolean testThreeKind(ArrayList<Card> hand){
        int count = 0;
        
        //System.out.println("Three of a kind?");
        //System.out.println(hand);
        
        //loops through the 5 card hand to determine if there is 3 matching numbers
        for(int i=0; i < 5; i++){
            for(int j = i + 1; j < 5; j++){
                if((hand.get(i)).getNumber()==(hand.get(j)).getNumber()){
                    count++;
                }
            }
        }
        //System.out.println("count: "+count);
        if (count == 3){
            //System.out.println("three of a kind!");
            return true;
        }
        else{ 
            return false;
        }
    }
    
    public boolean testTwoPair(ArrayList<Card> hand){
        int count = 0;
        
        //System.out.println("Two Pair?");
        //System.out.println(hand);
        
        //loops through the 5 card hand to determine if there are two sets of two pairs
        for(int i=0; i < 5; i++){
            for(int j = i + 1; j < 5; j++){
                if((hand.get(i)).getNumber()==(hand.get(j)).getNumber()){
                    count++;
                }
            }
        }
        //System.out.println("count: "+count);
        if (count == 2){
            //System.out.println("two pair!");
            return true;
        }
        else{ 
            return false;
        }
    }
    
    public boolean testStraight(ArrayList<Card> hand){
        int count = 0;
        
        //System.out.println("Straight?");
        //System.out.println(hand);
        
        for(int i=0; i < 1; i++){
            if((hand.get(i + 1)).getNumber()==(hand.get(i)).getNumber() + 1 && (hand.get(i + 2)).getNumber()==(hand.get(i)).getNumber() + 2 && (hand.get(i + 3)).getNumber()==(hand.get(i)).getNumber() + 3 && (hand.get(i + 4).getNumber()==hand.get(i).getNumber() + 4)){
                    count++;
                }
        }
        
        //System.out.println("count: "+count);
        if (count == 1){
            //System.out.println("straight!");
            return true;
        }
        else{ 
            return false;
        }
    }
    
    public boolean testFullHouse(ArrayList<Card> hand){
        int count = 0;      
                
        //System.out.println("Full House?");
        //System.out.println(hand);
        
        //loops through the 5 card hand to determine if there is a set of one pair and a set of three pair
        for(int i=0; i < 5; i++){
            for(int j = i + 1; j < 5; j++){
                if((hand.get(i)).getNumber()==(hand.get(j)).getNumber()){
                    count++;
                }
            }
        }
        //System.out.println("count: "+count);
        if (count == 4){
            //System.out.println("full house!");
            return true;
        }
        else{ 
            return false;
        }
    }
    
    public boolean testFlush(ArrayList<Card> hand){
        int count = 0;
        
        //System.out.println("Flush?");
        //System.out.println(hand);
        
        //loops through the 5 card hand for 5 cards of the same suit
        for(int i=0; i < 1; i++){
            if((hand.get(i)).getSuit()==(hand.get(i + 1)).getSuit() && (hand.get(i)).getSuit()==(hand.get(i + 2)).getSuit()&& (hand.get(i)).getSuit()==(hand.get(i + 3)).getSuit()&& (hand.get(i).getSuit()==hand.get(i+4).getSuit())){
                    count++;
                }
        }
        
        //System.out.println("count: "+count);
        if (count == 1){
            //System.out.println("flush!");
            return true;
        }
        else{ 
            return false;
        }
    }
    
    public boolean testFourKind(ArrayList<Card> hand){
        int count = 0;
    
        //System.out.println("Four of a Kind?");
        //System.out.println(hand);
        
        //loops through the 5 card hand for 4 matching number hands
        for(int i=0; i < 5 - 3; i++){
            if((hand.get(i)).getNumber()==(hand.get(i + 1)).getNumber() && (hand.get(i)).getNumber()==(hand.get(i + 2)).getNumber()&& (hand.get(i)).getNumber()==(hand.get(i + 3)).getNumber()){
                    count++;
                }
        }
        //System.out.println("count: "+count);
        if (count == 1){
            //System.out.println("four of a kind!");
            return true;
        }
        else{ 
            return false;
        }
    }
}

