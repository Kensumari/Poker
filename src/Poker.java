import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Poker {

    List<Card> handCards = new ArrayList<>();
    Deck deck = new Deck();

    public List<Card> dealingHand(int drawCard, List<Card> deck){
        for(int i=0; i<drawCard; i++){
            handCards.add(deck.get(0));
            deck.remove(0);
        }
        this.deck.toString();
        return handCards;
    }

    public List<Card> showHand(){
        cardsValue(handCards);
        return handCards;
    }

    public void cardsValue(List<Card> cards){
        int counter = 0;
        List<Integer> countMatch = new ArrayList<>();
        List<Integer> valueCards = new ArrayList<>();
        for(Card card : cards){
            valueCards.add(card.);
        }
        for(Integer card1: valueCards){
            for(Integer card2: valueCards){
                if(card1.equals(card2)){
                    counter++;
                }
            }
            countMatch.add(counter);
            counter = 0;
        }
        if(Collections.max(countMatch)==2){
            System.out.println("You have a pair");
        }
        if(Collections.max(countMatch)==3){
            System.out.println("Thrice");
        }

    }
}
