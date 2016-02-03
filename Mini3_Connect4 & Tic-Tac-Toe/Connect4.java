package Mini3_C4_XO;

import java.util.*;

public class Connect4 {

	static boolean isPlayer1Turn = true; // first player at the start of the game
	static boolean hasWon = false;
	// displayingmatrix
	public static void displayMatrix(String[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println("");
		}

	}
	// creating visual grid of matrix
	public static String[][] createGrid(int row, int column) {

		String[][] m = new String[row][column];
		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {
				if (j == 0)
					m[i][j] = "| |";
				else
					m[i][j] = " |";

			}
		}
		return m;
	}
	// this method is checking if there are any 4 same connected
	public static boolean isConsecutiveFour(String[][] m) {
		// red or yellow player
        String s = (isPlayer1Turn) ? "R" : "Y";
        
        int occurence = 0; // counting sequence of 4 same colors
        // checking columns
		for (int k = 0; k < m[0].length; k++) {
			for (int i = 0; i < m.length; i++) {
				if (m[i][k].contains(s))
					occurence++;
			}
			if (occurence == 4)
				return true;
			else
				occurence = 0;
		}

		int occurrence = 0;
		// checking rows
		for (int i = 0; i < m.length; i++) {
			for (int h = 0; h < m[i].length; h++) {
				if (m[i][h].contains(s))
					occurrence++;
			}
			if (occurrence == 4)
				return true;
			else
				occurrence = 0;
			}

        occurrence = 0;
        // (m[0].length - 3) --> reason: only checking occurrences of 4
        for (int j = 0; j < m[0].length - 3; j++) {
            int y = m.length - 1; // row always starts on last row
            int x = j;
            while (x < m[0].length && y >= 0) {

                 if (m[y][x].contains(s)) {              // | | | | | |R|R|
                     occurrence++;                       // | | | | |R|R|R|
                    if (occurrence == 4) return true;    // | | | |R|R|R|R|
                } else {                                 // | | |R|R|R|R| |
                     occurrence = 0;                     // | |R|R|R|R| | |
                }                                        // |R|R|R|R| | | |
                x++;
                y--;
            }
        }

        // (m.length - 2) --> reason: only checking occurrences of 4
        // and last row has already been checked
        for (int i = m.length - 2; i > 2; i--) {
            int x = 0; // column always starts on the left side
            int y = i;
            occurrence = 0;
            while (x < m[0].length && y >= 0) {           // | | | |R|R| | |
                                                          // | | |R|R| | | |
                                                          // | |R|R| | | | |
                if (m[y][x].contains(s)) {                // |R|R| | | | | |
                    occurrence++;                         // |R| | | | | | |
                    if (occurrence == 4) return true;     // | | | | | | | |
                } else {
                    occurrence = 0;
                }

                x++;
                y--;
            }
        }

        // j >= 3 --> reason: only checking occurrences of 4
        for (int j = m[0].length - 1; j >= 3; j--) {
            int y = m.length -1; // row always starts on last row
            int x = j;
            occurrence = 0;

            while (x >= 0 && y >= 0) {
                                                            // |L|L| | | | | |
                if (m[y][x].contains(s)) {                  // |L|L|L| | | | |
                    occurrence++;                           // |L|L|L|L| | | |
                    if (occurrence == 4) return true;       // | |L|L|L|L| | |
                } else {                                    // | | |L|L|L|L| |
                    occurrence = 0;                         // | | | |L|L|L|L|
                }
                x--;
                y--;
            }

        }

        // i > 2 --> reason: only checking occurrences of 4
        for (int i = m.length - 2; i > 2; i--) {
            int x = m[0].length - 1;
            int y = i;
            occurrence = 0;
            while (x >= 0 && y >= 0) {                       // | | |L|L| | | |
                                                             // | | | |L|L| | |
                if (m[y][x].contains(s)) {                   // | | | | |L|L| |
                    occurrence++;                            // | | | | | |L|L|
                    if (occurrence == 4) return true;        // | | | | | | |L|
                } else {                                     // | | | | | | | |
                    occurrence = 0;
                }
                x--;
                y--;
            }

        }

        return false;
    }
	// visual display for moves that players made
	public static boolean dropDisk(String[][] m, int column) {

		// figure out which disk to drop
		String s;
		if (isPlayer1Turn) {
			s = (column > 0) ? "R|" : "|R|";
		} else {
			s = (column > 0) ? "Y|" : "|Y|";
		}
		boolean didRowUpdate = false;
		int row = 0;

		// check if there is a disk in column
		// if there is get the proper row index
		for (int i = 0; i < m.length; i++) {

			if (isClear(m[i][column])) {
				didRowUpdate = true;
				row = i;
			}
		}

		if (!didRowUpdate)
			return false;

		m[row][column] = s;

		return true;
	}
	// checking if position is clear or not
	public static boolean isClear(String s) {

		return s.contains("| |") || s.contains(" |");
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		// creating matrix (grid) for the game
		String[][] m = createGrid(6, 7);
		int column;
		// while none player has won play
		while (!hasWon) {
			// displaying full color name for each player
			String diskColor = (isPlayer1Turn) ? "red" : "yellow";
			// displaying matrix(grid)
			displayMatrix(m);
			boolean isFirstInput = true; 
			// if position is full ask for diferent indexes
			do {
				if (!isFirstInput) {
					System.out.println("COLUMN IS FULL. Try again...");
				}
				System.out.print("Drop a " + diskColor + " at column (0-6): ");
				column = in.nextInt();
				isFirstInput = false;
			} while (!dropDisk(m, column));
			// if there are any consecutive 4 display which player won and ask for play again or not
			if (isConsecutiveFour(m)) {
				displayMatrix(m);
				System.out.println("The " + diskColor + " player won!");
				System.out.println("Do you want to play again? y (for Yes)/any key (for No): ");
				String option = in.next();
				if (option.equalsIgnoreCase("y")) {
					System.out.println();
					m = createGrid(6, 7);
					isPlayer1Turn = false;
				} else {
					System.out.println("Game ended...");
					System.exit(0);
				}
			}
			// switching players
			isPlayer1Turn = !isPlayer1Turn;
		}

	}

}
