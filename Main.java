import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Positions p = new Positions();
        //System.out.println("No of Snakes : ");
        int noOfSnakes=in.nextInt();
        while(noOfSnakes-->0){
            int head=in.nextInt();
            int tail=in.nextInt();
            p.SetSnake(head, tail);
        }
        //System.out.println("No of Ladders : ");
        int noOfLadders=in.nextInt();
        while(noOfLadders-->0){
            int head=in.nextInt();
            int tail=in.nextInt();
            p.SetLadder(head, tail);
        }
        //System.out.println("No of Players : ");
        int noofPlayers = in.nextInt();
        Queue<Player> qu = new LinkedList<Player>();
        in.nextLine();
        while(noofPlayers-->0){
            //System.out.println("Player Name : ");
            String Name = in.nextLine();
            Player p1 = new Player(Name);
            p1.setPosition(0);
            qu.add(p1);
        }
        //System.out.println("No of Dice: ");
        int noofDice=in.nextInt();
        Dice dice= new Dice(noofDice);
        GameRun r = new GameRun(p,qu,dice,100);
        r.rungame();
    }
}
