package Mini4_HangmanandBattleship;

import java.util.*;

public class Hangman {
	// getting random word from array
	public static String getWord() {
		return words[(int) (Math.random() * words.length)];
	}
	// putting * for letters in word
	public static String getHiddenWord(String word) {
		String hidden = "";
		for (int i = 0; i < word.length(); i++) {
			hidden += "*";
		}
		return hidden;
	}
	// replacing * with letter if user guessed correctly
	static public String getGuess(String word, String hiddenWord, char ch) {
		isCorrect = false;
		StringBuilder s = new StringBuilder(hiddenWord);
		for (int i = 0; i < word.length(); i++) {

			if (ch == word.charAt(i) && s.charAt(i) == '*') {
				isCorrect = true;
				s = s.deleteCharAt(i);
				s = s.insert(i, ch);
			}
		}
		return s.toString(); // returns string with letters guessed
	}
	// if user type same letter again
	public static boolean isAlreadyInWord(String hiddenWord, char ch) {
		for (int i = 0; i < hiddenWord.length(); i++) {
			if (ch == hiddenWord.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	// array with words
	static String[] words = { "programming", "words", "test", "game", "house", "cat", "java", "computer",
								"sky", "teacher", "cinema", "movie", "keyboard", "phone", "modem", "charger"};
	static boolean isCorrect; // for checking if guess is correct

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String playStats = "y";
		while (playStats.equals("y")) {
			String word = getWord();
			String hiddenWord = getHiddenWord(word);
			int missCount = 0; // countiung misses
			// input letter
			while (!word.equals(hiddenWord)) {
				System.out.print("(Guess) Enter a letter in word " + hiddenWord + " > ");
				char ch = in.next().charAt(0);
				// if user inputs same letter again and counting missed letters
				if (!isAlreadyInWord(hiddenWord, ch)) {
					hiddenWord = getGuess(word, hiddenWord, ch);
					if (!isCorrect) {
						System.out.println(ch + " is not in the word.");
						missCount++;
					}
					
				} else {
					System.out.println(ch + " is already in word.");
				}

			}
			// at the end of game display stats and ask if want to play again
			System.out.println("The word is <" + word + ">  You missed " + missCount + " times");
			System.out.println("Do you want to guess another word? Enter y/n? ");
			playStats = in.next();
		}

	}

}
