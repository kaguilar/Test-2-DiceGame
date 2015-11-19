public class OneDice{
		
	public static final String Dice1 = null;
	private int rDice;
	
	
	public OneDice() {
		rDice = 1 + (int) (Math.random()  * 6);
	}

	public int getrDice() {
		return rDice;
	}
}