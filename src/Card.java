public class Card {

    private final CardSuit suit;
    private final CardValue value;

    public Card(CardSuit suit, CardValue value){
        this.suit = suit;
        this.value = value;
    }

    public CardSuit getSuit(){
        return suit;
    }

    public CardValue getValue(){
        return value;
    }

    @Override
    public String toString(){
        return "Card[" + suit + ", " + value + "]";
    }
}
