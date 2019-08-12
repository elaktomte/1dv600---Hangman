package model;
import java.util.ArrayList;
import java.util.Random;

public class WordList {

	ArrayList<String> wordlist = new ArrayList<String>();
	Random rng = new Random();
	
	
	public WordList() {
		wordlist.add("ostkaka");
		wordlist.add("bacon");
		wordlist.add("fisk");
		wordlist.add("ostron");
		wordlist.add("häst");
	}

	public String randomWord() {
		int index = rng.nextInt(wordlist.size());
		
		return wordlist.get(index);
	}
	public void addWord(String word) {
		wordlist.add(word.toLowerCase());
	}
	
}
