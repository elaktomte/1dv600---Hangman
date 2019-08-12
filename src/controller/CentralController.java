package controller;
import model.WordList;
import view.View;
import java.util.Scanner;

public class CentralController {
	View view = new View();
	WordList list = new WordList();
	String word;
	int guesses = 0;
	boolean[] hidden;
	StringBuilder sb = new StringBuilder();
	Scanner scanner = new Scanner(System.in);
	
	public CentralController() {
		
	}
	public static void main(String[] args) {
		CentralController controller = new CentralController();	
		controller.Start();

	}

	public void Start() {
		//Resets everything and starts up the game
		
	}

	public int checkInputError(String str) { // method for controlling input.
		try {
			int input = Integer.parseInt(str);
			return input;
		}
		catch (NumberFormatException e) {
			System.err.println("Faulty Input, It was not an integer");
		}
		return -1;
	}
	public void NewGame() {
		//Setting up the new game
		view.Gallows(0);
		word = list.randomWord();
		hidden = new boolean[word.length()];
		guesses = 0;
	}
	public void Victory() {
		System.out.println("You won!");
	}
	public String BuildCorrectString(boolean[] hiddn) {
		sb= new StringBuilder();
		for (int i = 0; i < hiddn.length; i++) {
			if (hiddn[i] == true) {
				sb.append(word.charAt(i));
			}
			else {
				sb.append("_");
			}
		}
		return sb.toString();
	}
	public void StartGame() {
		//This will contain a loop that loops until we got enough incorrect guesses or successfully guesses the correct word
		
	}
	public void StartMenuSelection (int i) {
		if (i == 1) {
			NewGame();
			StartGame();
		}
		if (i == 2) {

		}
		if (i == 3) { 
			System.exit(0);
		}
		else {

		}
	}
	public void Guess(String w) {
	//Main function for handeling Guesses
	}


}
