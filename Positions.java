import java.util.*;
public class Positions {
    private HashMap<Integer,Integer> snakes;
    private HashMap<Integer,Integer> ladders;
    
    public Positions(){
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();
    }
    public void SetSnake(int start,int end){
        this.snakes.put(start,end); 
    }
    public int getSnakeend(int start){
       return  this.snakes.get(start); 
    }
    public int getLadderend(int start){
        return  this.ladders.get(start); 
     }
    public void SetLadder(int start,int end){
        this.ladders.put(start,end); 
    }

    public boolean isSnakePosition(int posi){
        return (this.snakes.containsKey(posi)); 
    }
    public boolean isLadderPosition(int posi){
        return (this.ladders.containsKey(posi)); 
    }
}
