import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    List<Card> cards = new ArrayList<>();

    public void generateCards(){
        for (CardSuit suit: CardSuit.values()) {
            for(CardValue value: CardValue.values()){
                cards.add(new Card(suit,value));
            }
        }
    }

    public void printCards(List<Card> cards){
        for(Card card: cards){
            System.out.println(card);
        }
    }
    public List<Card> shuffleCards(List<Card> cards){
        int amountOfCards = cards.size();
        List<Card> newCards = new ArrayList<>();
        List<Integer> cardNumber = new ArrayList<>();
        Random rand = new Random();
        int counter = 0;
        while(counter<=51) {
            int cardPosition = rand.nextInt(amountOfCards);
            if (!cardNumber.contains(cardPosition)) {
                newCards.add(cards.get(cardPosition));
                cardNumber.add(cardPosition);
                counter++;
            }
        }
        return newCards;
    }
}

