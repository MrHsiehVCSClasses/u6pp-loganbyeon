package u6pp;

import java.util.ArrayList;
import java.util.Random;

public class CardStack{
    ArrayList<Card> deck = new ArrayList<Card>();
    
    public CardStack() {
        
    }

    boolean isEmpty(){
        if(deck.size() == 0){
            return true;
        }
        return false;
    }
    //returns top card of "deck" ArrayList, or null if ArrayList is empty
    Card peek(){
        //checks whether the "deck" ArrayList is empty & returns a boolean value
        if(deck.isEmpty() == true){
            return null;
        }
        return deck.get(deck.size() - 1);
    }
    //adds a card to top of "deck" ArrayList
    public void push(Card card) {
        deck.add(card);
    }
    //returns number of cards in "deck" ArrayList
    int getSize(){
        return deck.size() ;
    }
    //removes & returns top card of "deck" ArrayList
    Card pop(){
        Card temp = deck.get(deck.size() - 1);
        deck.remove(deck.get(deck.size() - 1));
        return temp;
    }
    //removes all cards from "deck" ArrayList
    void clear(){
        while(deck.isEmpty() == false){
            deck.remove(0);
        }
    }
    /**
     * adds all cards from another CardStack object to current "deck" ArrayList, 
     * but only if two ArrayLists are not equal
     */
    void addAll(CardStack stack){
        if(deck .equals(stack.deck)){
            return;
        }
        while(stack.isEmpty() == false){
            deck.add(stack.deck.get(0));
            stack.deck.remove(0);
        }
    }
    /**
     * shuffles "deck" ArrayList which selects random card from remaining unshuffled cards 
     * & swaps it with current card being shuffled
     */
    void shuffle(){
        for(int i = 0; i < deck.size(); i++){
            Random myRandom = new Random();
            int ran;
            
            ran = myRandom.nextInt(deck.size());
            
            Card temp;
            temp = deck.get(ran);
            deck.set(ran, deck.get(i));
            deck.set(i, temp);
        }
    }
}