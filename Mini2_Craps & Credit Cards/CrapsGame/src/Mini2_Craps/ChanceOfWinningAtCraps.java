package Mini2_Craps;

import java.util.*;

public class ChanceOfWinningAtCraps {

	public static void main(String[] args) {
		// random method for random number from dice
		Random r = new Random();
		// numbers on dice
		int dice[] = { 1, 2, 3, 4, 5, 6 };
		int temp = 0; // for temporary saving score rolled
		int wins = 0; // counter for all wins
		int craps = 0; // counter for loses by craps
		int natural = 0; // counter for winns by natural

		// simulating 10K plays
		for (int i = 0; i < 10000; i++) {
			// random generated number for 1st dice
			int dice1 = dice[r.nextInt(6)];
			// random generated number for 2nd dice
			int dice2 = dice[r.nextInt(6)];
			// points from sum of numbers rolled
			int points = dice1 + dice2;
			temp = points;

			// if rolled score of 4,5,6,8,9 or 10 roll again
			if ((points == 4) || (points == 5) || (points == 6) || (points == 8) || (points == 9) || (points == 10)) {
				dice1 = dice[r.nextInt(6)];
				dice2 = dice[r.nextInt(6)];
				points = dice1 + dice2;
				// roll again until same value of points or 7 is rolled
				while ((temp != points) || (points != 7)) {
					dice1 = dice[r.nextInt(6)];
					dice2 = dice[r.nextInt(6)];
					points = dice1 + dice2;
					// if same value of points are rolled player win
					if (temp == points) {
						wins++;
						break;
						// if 7 is rolled player lose
					} else if (points == 7) {
						break;
					}

				}
				// setting points and temp to 0 for next play
				points = 0;
				temp = 0;
			}
			// if score is 7 ore 11 called natural and player win
			else if ((points == 7) || (points == 11)) {
				wins++;
				natural++;
			}
			// counting loses by craps
			else if ((points == 2) || (points == 3) || (points == 12)) {
				craps++;
			}
		}
		// there are 3 more numbers which can be rolled and those are 2, 3 or 12
		// called craps and player lose
		int lose = 10000 - wins;
		// printing results of winning and losing in 10K simulation
		System.out.println("#WON => " + wins + " times" + " (" + ((double)wins/100) + "%)");
		System.out.println("#LOSE => " + lose + " times" + " (" + ((double)lose/100) + "%)");
		System.out.println("................................................");
		System.out.println("#WON by NATURAL => " + natural + " times" + " (" + ((double)natural/100) + "%)");
		System.out.println("#LOSE by CRAPS => " + craps + " times" + " (" + ((double)craps/100) + "%)");
	}

}
