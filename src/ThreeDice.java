public class ThreeDice extends TwoDice {

	public int Dice3;
	private int DiceTotal;

	
	public ThreeDice(){
		Dice3 = 1 + (int)(Math.random() * 6);
		DiceTotal = Dice1 + Dice2 + Dice3;
	}
	public int getDiceTotal() {
		return DiceTotal;
	}
}