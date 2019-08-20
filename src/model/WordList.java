package model;
import java.util.ArrayList;
import java.io.*;

import java.util.Random;
import java.util.Scanner;

public class WordList {

	ArrayList<String> wordlist = new ArrayList<String>();
	Random rng = new Random();
	
	
	public WordList() throws IOException {
		if (!new File("Wordlist.txt").exists()) {
			FileWriter fw = new FileWriter("Wordlist.txt");
			wordlist.add("fish");
			wordlist.add("bicycle");
			wordlist.add("loan");
			wordlist.add("goat");
			wordlist.add("mushroom");
			updateWordList();
		}
		else {
			File file = new File("Wordlist.txt");
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				wordlist.add(scan.nextLine());
			}
		}
		
	}

	public String randomWord() {
		int index = rng.nextInt(wordlist.size());
		
		return wordlist.get(index);
	}
	public void addWord(String word) throws IOException {
		wordlist.add(word.toLowerCase());
		updateWordList();
	}
	public void updateWordList() throws IOException {
		FileWriter fw = new FileWriter("Wordlist.txt");
		for (int i = 0; i<wordlist.size(); i++) {
			fw.write(wordlist.get(i) + '\n');
		}
		fw.close();
	}
	public void printAllWords() { // Mainly for testing purposes.
		for (int i = 0; i < wordlist.size(); i++) {
			System.out.println(wordlist.get(i));
		}
	}
	
}
