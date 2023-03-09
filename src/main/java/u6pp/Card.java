package u6pp;

public class Card {

    public static String RED = "RED";
    public static String GREEN = "GREEN";
    public static String BLUE = "BLUE";
    public static String YELLOW = "YELLOW";

    public static String ZERO = "0";
    public static String ONE = "1";
    public static String TWO = "2";
    public static String THREE = "3";
    public static String FOUR = "4";
    public static String FIVE = "5";
    public static String SIX = "6";
    public static String SEVEN = "7";
    public static String EIGHT = "8";
    public static String NINE = "9";

    public static String DRAW_2 = "DRAW_2";
    public static String REVERSE = "REVERSE";
    public static String SKIP = "SKIP";
    public static String WILD = "WILD";
    public static String WILD_DRAW_4 = "WILD_DRAW_4";

    /**
     * Wild color is the default color for wilds, before they are played. 
     */
    public static String[] COLORS = {RED, GREEN, BLUE, YELLOW, WILD}; 
    public static String[] VALUES = {ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, 
        DRAW_2, REVERSE, SKIP, WILD, WILD_DRAW_4};
        String col;
        String val;

    /**
     * start your code here
     */
    Card(String color, String value){
        col = color;
        val = value;
    }
    String getColor(){
        return col;
    }
    String getValue(){
        return val;
    }
    /**
     * defines a method named "trySetColor" that takes a String "color" as input 
     * and returns a boolean value
     */
    boolean trySetColor(String color){
        //initializes a boolean variable "check" to false
        boolean check = false;
        //iterates through a constant array named "COLORS" using a for-each loop
        for(String c : COLORS){
            //checks whether the current element is equal to the input color string using the equals() method
            if((c .equals(color))){
                check = true;
            } //if match, sets "check" to true
        }
        //check value of "check"
        if(check == false){
            System.out.println("not real color");
            return false;
        }
        if(color.equals(WILD) || color == null){
            System.out.println("color is wild or null");
            return false;
        }
        //if true, sets "col" to input color string
        if(col.equals(WILD)){
            col = color;
            System.out.println("the color has been changed");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }
    /**
     * 
     */
    boolean canPlayOn(Card input){
        if(input == null){
            return false;
        }
        if(col.equals(WILD)){
            return true;
        }
        if(input.getColor().equals(col) || input.getValue().equals(val)){
            return true;
        }
        return false;
    }
}