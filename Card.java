public class Card {
    private char suit; // s for spades, h for heart, d for diamond, and c for clubs
    private int value; //1 to 13

    //Constructor method
    public Card(char suit, int value){
        setSuit(suit);
        setValue(value);
    }
    //Getter for suit
    public char getSuit() {
        return suit;
    }
    //Setter for suit
    public void setSuit(char suit){
        if(suit == 's' || suit == 'h' || suit == 'd' || suit == 'c'){
            this.suit = suit;
        }else{
            throw new IllegalArgumentException("Invalid suit!");
        }
    }
    //Getter for value
    public int getValue(){
        return value;
    }
    //Setter for the value
    public void setValue(int value){
        if(value >= 1 && value <= 13){
            this.value = value;
        }else{
            this.value = 1;
        }
    }
}
