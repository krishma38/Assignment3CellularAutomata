
import java.util.HashMap;
public class Cell {

    //set variables
    private int strength;
    private int x;
    private int y;
    private int id;
    private HashMap<String,Integer> chemMap;

    //setter constructor
    public Cell(int strength, int x, int y, int id) {
        setStrength(strength);
        setX(x);
        setY(y);
        setId(id);
     }

    //get strength
    public int getStrength(){
        return this.strength;
    }
    //set strength
    public void setStrength (int strength){
        if(strength > 0) {
            this.strength = strength;
        }
        else{
            this.strength= 0;
        }
    }

    //get x
    public int getX(){
        return this.x;
    }
    //set x
    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        } else {
            this.x = 0;
        }
    }

    //get y
    public int getY(){
        return this.y;
    }
    //set y
    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        } else {
            this.y = 0;
        }
    }

    //get id
    public int getId(){
        return this.id;
    }
    //set id
    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    //default constructor
    public Cell(){

        this(0,0,0,0);
    }

    //method
    public void interactNeighbours(){

    }

    //main
    public static void main(String[] args){
        Cell A = new Cell(-34,-4,4,0);
        System.out.println("strength: " + A.strength);
        System.out.println("x: " + A.x);
        System.out.println("y: " + A.y);
        System.out.println("id: " + A.id);

        HashMap<String,Integer> chemical = new HashMap<>();
        chemical.put("ATP", 0);
        chemical.put("Glucose", 3);
        chemical.put("Lactate", 6);
        System.out.println("Chemical Levels: " + chemical);

        A.interactNeighbours();
    }
}