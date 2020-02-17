import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class Application {
    Card card;

    public static void main(String[] args){
        Deck deck = new Deck();
        Poker poker = new Poker();
        List<Card> newCards;
        List<Card> handCards;
        deck.generateCards();
        deck.printCards(deck.cards);
        newCards = deck.shuffleCards(deck.cards);
        deck.printCards(newCards);
        System.out.println("Your cards are");
        //starting hand
        handCards = poker.dealingHand(5,newCards);
        poker.cardsValue(handCards);

    }

    public void testMethod(){

    }
}
