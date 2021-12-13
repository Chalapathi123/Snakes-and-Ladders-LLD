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
    // public int getPlayerPosition(String name){
    //     return this.players.get(name); 
    // }
    public boolean isSnakePosition(int posi){
        return (this.snakes.containsKey(posi)); 
    }
    public boolean isLadderPosition(int posi){
        return (this.ladders.containsKey(posi)); 
    }

    // public void SetPlayer(String Name,int posi){
    //     this.players.put(Name,posi); 
    // }
    // public void getPlayers(){
    //     for (Map.Entry<String,Integer> entry : players.entrySet())
    //         System.out.println("Name= " + entry.getKey() + ",Position= " + entry.getValue());
    // } 
    // public void getSnakes(){
    //     for (Map.Entry<Integer,Integer> entry : snakes.entrySet())
    //         System.out.println("Head= " + entry.getKey() + ",tail = " + entry.getValue());
    // }
    // public void getLadder(){
    //     for (Map.Entry<Integer,Integer> entry : ladders.entrySet())
    //         System.out.println("Head= " + entry.getKey() + ",tail = " + entry.getValue());
    // }  
}
