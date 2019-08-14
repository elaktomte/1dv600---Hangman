package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class HighScore {
	String[] Names = new String[5];
	int[] Scores = new int[5];

	public HighScore() throws FileNotFoundException {
		File file = new File("HighScores.txt");
		Scanner scan = new Scanner(file);

		for (int i = 0; i< 5; i++) {
			String currentString = scan.nextLine();
			for (int j = 0; j < currentString.length(); j++) {
				if (currentString.charAt(j) == ',') {
					int splitIndex= j;
					Names[i] = currentString.substring(0, splitIndex);
					Scores[i] = Integer.parseInt(currentString.substring(splitIndex+1, currentString.length()));
				}
			}
		}
	}
	public void updateHighScores() throws IOException {
		File file = new File("HighScores.txt");
		FileWriter fw = new FileWriter(file);
		for (int i = 0; i < 5; i++) {
			fw.write(Names[i]+","+Scores[i]+"\n");
		}
		fw.close();
	}
	//returns the top highScores
	public String[] getHighScores() {
		String[] returnArr = new String[5];
		for (int i = 0; i <5; i++) {
			returnArr[i] = Names[i] + " : "+ Scores[i];
		}
		return returnArr;
	}
	public void AddEntry(String name, int score, int place) throws IOException {
		if (place == 4) {
			Names[place] = name;
			Scores[place] = score;
			updateHighScores();
		}
		else {
			shiftDownWards(place);
			Names[place] = name;
			Scores[place] = score;
			updateHighScores();
		}

	}

	public void shiftDownWards(int place) {
		int[] newArr = new int[5];
		String[] newNames = new String[5];
		for (int i = 0; i < place; i++) {
			newArr[i]= Scores[i];
			newNames[i] = Names[i];
		}
		for(int i = place; i<4; i++) {
			newArr[i+1] = Scores[i];
			newNames[i+1] = Names[i];
		}
		this.Scores= newArr;
		this.Names= newNames;
	}
	public int checkForNewHighscore(int score) {
		int position = 99;
		for (int i = 0; i < 5; i++) {
			if(score < Scores[i]) {
				position = i;
				break;
			}
		}
		return position;
	}


}

