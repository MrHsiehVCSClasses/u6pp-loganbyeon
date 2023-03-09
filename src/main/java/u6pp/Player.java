package u6pp;
import java.util.ArrayList;

public class Player {
    String myName;
    ArrayList <Card> myHand = new ArrayList<Card>();
    
    /**
     * initializer for the player
     * needs a name
     */
    public Player(String name){
        myName = name;
    }
    /**
     * gets name
     */
    public void setName(String name){
        myName = name;
    }
    /**
     * sets name
     */
    public String getName(){
        return myName;
    }
    /**
     * gets hand
     * fyi: all hands start empty
     */
    public ArrayList <Card> getHand(){
        return myHand;
    }
}