

public class Card
{
    public String suit;
    public int number;
    
    public Card(String suit, int number){
        this.suit = suit;
        this.number = number;
    }
    
    public void setSuit(){
        this.suit = suit;
    }
    
    public void setNumber(){
        this.number = number;
    }
    
    public String getSuit(){
        return suit;
    }
    
    public int getNumber(){
        return number;
    }
    
    @Override
    public String toString(){
        return number + " of " + suit;
    }
}
