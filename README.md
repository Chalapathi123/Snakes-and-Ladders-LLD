# Snakes-and-Ladders-LLD

# This Contains 5 segments
  -> Player.java
  -> Positions.java
  -> GameRun.java
  -> Dice.java
  -> Main.java
 
# Player.java
  -> Player.java contains Player Class that initializes player class with Name Passed as a constructor to this class.
  -> This Contains Getters and Setters like getPosition(), setPosition(int position), getName().
  -> Initially, Player position is set to zero.

# Positions.java
  -> Positions.java keeps track of snakes and Ladders position in the board.
  -> This stores Snake position (i.e: head and tail) and Ladders position (i.e: starting ladder position and ending ladder position) in the HashMap.
  -> This HashMap gives better access to keep track of positions easily.
  -> Setters like SetSnake(int start, int end), SetLadder(int start,int end) stores the Snakes and ladders positions present in the board.
  -> Getters like getLadderend(int start), getSnakeend(int start) gives the upperlimit of Ladder and Tail of the snake.
  
# Dice.java
  -> Dice class is to generate random number depending on number of dice in the given input.
  
# GameRun.java
  -> In this rungame() Starts the Game with initial positions to zero.
  -> Queue Data Structure is taken for Player Turns.
  -> If the curruentposition+rollDice() is Lesser than the board size and if the nextposition has no ladders or snakes then player position is updated to nextposition.
  -> If the curruentposition+rollDice() is Lesser than the board size and if the nextposition has ladder then player position is updated to Ladder UpperLimit.
  -> If the curruentposition+rollDice() is Lesser than the board size and if the nextposition has Snake then player position is updated to Snake Tail.
  -> If the curruentposition+rollDice() is equal to board size then the corresponding Player Won message is displayed.

# Main.java
  -> This takes input from the user(Positions of Snakes and Ladders, Number of players).
  -> Gives Control to GameRun();
