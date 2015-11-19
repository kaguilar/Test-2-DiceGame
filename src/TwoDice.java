public class TwoDice {

public int Dice1;
public static int Dice2;

private int DiceTotal;
	
	public TwoDice() {
		Dice1 = 1 + (int) (Math.random() * 6); 
		Dice2 = 1 + (int) (Math.random() * 6); 
		DiceTotal = Dice1 + Dice2;
	}

	public int getDiceTotal() {
		return DiceTotal;
	}} null;6
	
	
	}