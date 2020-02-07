import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    String[] suits = {"Spades","Hearts","Clubs","Diamonds"};
    List<Card> cards = new ArrayList<>();

    public void generateCards(){
        for (String suit:suits) {
            for(int i = 2; i <= 14; i++){
                cards.add(new Card(suit,i));
            }
        }
    }

    public void transformCard(List<Card> cards){
        char c = '\0';
        for(Card card:cards){
            switch(card.value){
                case 11:
                    c = 'J';
                    break;
                case 12:
                    c = 'Q';
                    break;
                case 13:
                    c = 'K';
                    break;
                case 14:
                    c = 'A';
                    break;
            }
            if(card.value >= 11){
                System.out.println(card.suit + c);
                continue;
            }
            System.out.println(card.suit + card.value);
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

