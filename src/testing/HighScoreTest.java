package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;
import model.HighScore;
class HighScoreTest {

	
	@Test
	void test() throws IOException {
		try {
			HighScore hs = new HighScore();
			String[] strings = hs.getHighScores();
			System.out.println("------  Old highScores");
			for (int i = 0; i < strings.length; i++) {
				System.out.println(strings[i]);
			}
			//assertEquals("fisk", strings[0]);
			hs.AddEntry("TestGuy", 5, 3);
			strings = hs.getHighScores();
			
			System.out.println("----- New highScores");
			for (int i = 0; i < strings.length; i++) {
				System.out.println(strings[i]);
			}
			
			assertTrue(strings[3].equalsIgnoreCase("TestGuy : 5"));
			
	
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
