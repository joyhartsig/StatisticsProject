
//the card class initalizes the card data type with suit and number attributes
public class Card
{
    //declare the variables to be used in this class
    private String suit;
    private int number;
    
    //Card method that accepts two parameters for the suite and the number of the card
    public Card(String suit, int number){
        this.suit = suit;
        this.number = number;
    }
    
    //sets the suit of the card
    public void setSuit(){
        this.suit = suit;
    }
    
    //sets the number of the card
    public void setNumber(){
        this.number = number;
    }
    
    //a getter for the suit of the card
    public String getSuit(){
        return suit;
    }
    
    //a getter for the number of the card
    public int getNumber(){
        return number;
    }
    
    //a method to display the suit and number of the card
    @Override
    public String toString(){
        return number + " of " + suit;
    }
    
}

