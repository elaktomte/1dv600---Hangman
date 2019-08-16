package testing;

import static org.junit.jupiter.api.Assertions.*;
import model.WordList;
import org.junit.jupiter.api.Test;

class WordListTest {

	@Test
	void test() {
		WordList wl = new WordList();
		wl.addWord("testWord");
		String randomWord = wl.randomWord();
		for (int i = 0; i < 100; i++) {
			randomWord = wl.randomWord();
			if (randomWord.equalsIgnoreCase("testword")) {
			break;
			}
		}
		
		assertTrue(randomWord.equalsIgnoreCase("testword"));
	}

}
