import javax.swing.JOptionPane;

public class DiceGameT2 {

	public static void main(String[] args) {
	
	int count = 0;
	boolean playing = true; 
	boolean Continue = true; 
	
	JOptionPane.showMessageDialog( null, "Welcome to ParaDice Game.\n");
	JOptionPane.showMessageDialog( null, "Only 3 types of game modes to choose.\n");
	JOptionPane.showMessageDialog( null, "One Dice, Two Dice, & Three Dice.\n");
	
	do{ 
		
	
	String GameChoice = JOptionPane.showInputDialog("Choose the one you'd like to play?\n1 = One Dice,"
			+ " 2 = Two Dice, 3 = Three Dice\n");
	int GameType = Integer.parseInt(GameChoice);
	
	if (GameType == 1){ 
		do{
		OneDice OneDice = new OneDice();
		int Dealer = OneDice.getrDice();
		
		System.out.printf("Dice value is...: " + Dealer + "\n"); 
		count ++;
		System.out.printf("The Dice has been rolled: " + count + "\n");
		
		String Input = JOptionPane.showInputDialog("Choose a number between 1 and 6");
		int Guess = Integer.parseInt(Input);
		
		if (Guess == Dealer){
			System.out.printf("Yay! we have a Winner! You choose: " + Guess + ", System number is: " + Dealer + "\n");
		} else if(Guess != Dealer){
			System.out.printf("Aw you lose :(! You choose: " + Guess + ", System number is: " + Dealer + "\n");
		}
		
		String Input2 = JOptionPane.showInputDialog("Play again?\n 1 = Yes, 2 = No\n");
		int User = Integer.parseInt(Input2);
		if (User == 2){
			Continue = false;
			count = 0;
		}
		} while (Continue == true);
	} else {
		if (GameType == 2){ 
			do{ 
				TwoDice TwoDice = new TwoDice();
				int Dealer = TwoDice.getDiceTotal();
				System.out.printf(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
				System.out.printf("Dice1 is: " + TwoDice.Dice1 + "\n");
				count++;
				System.out.printf("Dice2 is: " + TwoDice.Dice2 + "\n");
				count++;
				System.out.printf("Dice Total is: " + Dealer + "\n"); 
				System.out.printf("Number of rolls: " + count + "\n");
				
				String Input = JOptionPane.showInputDialog("Choose a number between 2 and 12");
				int Guess = Integer.parseInt(Input);
				
				if (Guess == Dealer){
					System.out.printf("Yay, You Win :) ! You picked: " + Guess + ", System number is: " + Dealer + "\n");
				}else if(Guess != Dealer){
					System.out.printf("Aw, You Lose :( ! You picked: " + Guess + ", System number is: " + Dealer + "\n");
				}
				
				String Input2 = JOptionPane.showInputDialog("Play again?\n 1 = Yes, 2 = No\n");
				int User = Integer.parseInt(Input2);
				if (User == 2){ 
					Continue = false;
					count = 0;
				}
			}while (Continue == true); 
		} else {
			if (GameType == 3){ 
				do{
					ThreeDice ThreeDice = new ThreeDice();
					int Dealer = ThreeDice.getDiceTotal();
					System.out.printf(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
					System.out.printf("Dice1 is: " + OneDice.Dice1 + "\n");
					count ++;
					System.out.printf("Dice2 is: " + TwoDice.Dice2 + "\n");
					count ++;
					System.out.printf("Dice3 is: " + ThreeDice.Dice3 + "\n");
					count++;
					System.out.printf("Dice Total is: " + ThreeDice.getDiceTotal() + "\n");
					System.out.printf("# of rolls: " + count + "\n");
					
					String Input = JOptionPane.showInputDialog("Choose a number between 3 and 18");
					int Guess = Integer.parseInt(Input);
					
					if (Guess == Dealer){
						System.out.printf("Yay! You Win :) ! You picked: " + Guess + ", System number is: " + Dealer + "\n");
					}else if (Guess != Dealer){
						System.out.printf("Aw, You Lose :) ! You picked: " + Guess + ", System number is: " + Dealer + "\n");
					}
					
					String Input2 = JOptionPane.showInputDialog("Play again?\n 1 = Yes, 2 No\n");
					int User = Integer.parseInt(Input2);
					if (User == 2){
						Continue = false;
						count = 0;
					}
				}while (Continue = true); 
			}
		}
	}
	String Input2 = JOptionPane.showInputDialog (" quit game?\n1 = Yes, 2 = No"); 
	int User = Integer.parseInt(Input2);
	if (User == 1){
		playing = false;
	}
	}while (playing == true); 
	}

}