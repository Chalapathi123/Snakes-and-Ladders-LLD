import java.util.*;
class GameRun{
    private Positions posi;
    private Dice dice;
    private Queue<Player> playerqueue;
    private int boardsize;
    public GameRun(Positions posi,Queue<Player> playerqueue,Dice dice,int boardsize){
        this.playerqueue=playerqueue;
        this.posi=posi;
        this.dice = dice;
        this.boardsize=boardsize;
    }

    public void rungame(){
        while(true){
            Player pl = playerqueue.poll();    
            int currpos = pl.getPosition();
            int rolled=dice.rollDice();
            int nxtpos  = currpos+rolled;
            if(nxtpos<=boardsize && posi.isSnakePosition(nxtpos)){
                    pl.setPosition(posi.getSnakeend(nxtpos));
                    nxtpos=posi.getSnakeend(nxtpos);
                    System.out.println(pl.getName()+ " rolled "+rolled+" was bitten by sake!!"+" moved from "+currpos +" to " +pl.getPosition());
            }
            else if(nxtpos<=boardsize && posi.isLadderPosition(nxtpos)){
                    pl.setPosition(posi.getLadderend(nxtpos));
                    nxtpos=posi.getLadderend(nxtpos);
                    System.out.println(pl.getName()+ " rolled "+rolled +" Ladder : moved from "+ currpos + " to " +pl.getPosition());
            }
            else if(nxtpos>boardsize){
                //currpos = pl.getPosition();
                System.out.println("No Possible Move");
                playerqueue.add(pl);
                continue;
            }
            else{
                pl.setPosition(nxtpos);
                //currpos=nxtpos;
                System.out.println(pl.getName() +" rolled "+rolled +" moved from "+ currpos + " to " + pl.getPosition());
            }

            
            if(nxtpos==boardsize){
                System.out.println(pl.getName()+" Won");
                break;
            }
            currpos=nxtpos;
            playerqueue.add(pl);
        }
    }
}
