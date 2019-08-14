package view;
import java.lang.StringBuilder;
import java.util.ArrayList;
public class View {

	public void StartMenu() {
		System.out.println("Welcome! Use the number keys to navigate");
		System.out.println("[1] Start a new game");
		System.out.println("[2] Check the high scores");
		System.out.println("[3] Quit");
	}
	
	public void printString(String str) {
	System.out.println(str);	
	}

	public void Gallows(int i ) {
		if (i == 0) {
			System.out.println("         ");
			System.out.println("         ");
			System.out.println("         ");
			System.out.println("         ");
			System.out.println("         ");
			System.out.println("         ");
			System.out.println("=========");
		}
		if (i == 1) {
			System.out.println("        +");
			System.out.println("        |");
			System.out.println("        |");
			System.out.println("        |");
			System.out.println("        |");
			System.out.println("        |");
			System.out.println("=========");
		}
		if (i == 2) {
			System.out.println("    +---+");
			System.out.println("    |   |");
			System.out.println("        |");
			System.out.println("        |");
			System.out.println("        |");
			System.out.println("        |");
			System.out.println("=========");
		}
		if (i == 3) {
			System.out.println("    +---+");
			System.out.println("    |   |");
			System.out.println("    O   |");
			System.out.println("        |");
			System.out.println("        |");
			System.out.println("        |");
			System.out.println("=========");
		}
		if (i == 4) {
			System.out.println("    +---+");
			System.out.println("    |   |");
			System.out.println("    O   |");
			System.out.println("    |   |");
			System.out.println("        |");
			System.out.println("        |");
			System.out.println("=========");
		}
		if (i == 5) {
			System.out.println("    +---+");
			System.out.println("    |   |");
			System.out.println("    O   |");
			System.out.println("   /|   |");
			System.out.println("        |");
			System.out.println("        |");
			System.out.println("=========");
		}
		if (i == 6) {
			System.out.println("    +---+");
			System.out.println("    |   |");
			System.out.println("    O   |");
			System.out.println("   /|\\  |");
			System.out.println("        |");
			System.out.println("        |");
			System.out.println("=========");
		}
		if (i == 7) {
			System.out.println("    +---+");
			System.out.println("    |   |");
			System.out.println("    O   |");
			System.out.println("   /|\\  |");
			System.out.println("   /    |");
			System.out.println("        |");
			System.out.println("=========");
		}
		if (i == 8) {
				System.out.println("    +---+");
				System.out.println("    |   |");
				System.out.println("    O   |");
				System.out.println("   /|\\  |");
				System.out.println("   / \\  |");
				System.out.println("        |");
				System.out.println("=========");
		}
		
	}
	public void printWin() {
		System.out.println("YOU WON! Congratulations.");
		System.out.println("Press 1 to get back to the main menu or press q to quit");
		
		
	}
	public void printLoss() {
		System.out.println("You lost, better luck next time.");
		System.out.println("Press 1 to get back to the main menu or press q to quit");
	}

	public void printHighScores(String[] highScores) {
		for (int i = 0; i < highScores.length; i++) {
			System.out.println(highScores[i]);
		}
		
	}
}
