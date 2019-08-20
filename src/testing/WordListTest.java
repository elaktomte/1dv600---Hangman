package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import model.WordList;
import org.junit.jupiter.api.Test;

class WordListTest {

	@Test
	void test() throws IOException {
		WordList wl = new WordList();
		wl.addWord("newtestword");
		String randomWord = wl.randomWord();
		for (int i = 0; i < 100; i++) {
			randomWord = wl.randomWord();
			if (randomWord.equalsIgnoreCase("newTestWord")) {
			break;
			}
		}
		
		wl.printAllWords();
		
		assertTrue(randomWord.equalsIgnoreCase("newtestword"));
	}

}
