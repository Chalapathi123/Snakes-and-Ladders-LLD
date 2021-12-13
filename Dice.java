public class Dice {
        private int noOfDice;
    
        public Dice(int noOfDice) {
            this.noOfDice = noOfDice;
        }
   
        public int rollDice() {
		    return ((int) (Math.random() * (6 * noOfDice - 1 * noOfDice))) + 1;
        }
    }
