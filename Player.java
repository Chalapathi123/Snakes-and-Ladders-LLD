public class Player {
    private String name;
    private int position = 0;

    public Player(String name) {
        this.name = name;
    
    }

    public void setPosition(int pos) {
        this.position = pos;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }
}