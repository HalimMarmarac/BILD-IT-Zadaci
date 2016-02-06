package Mini4_HangmanandBattleship;

import java.util.*;

/*
 * this is some version of Battleship game simulation
 * - game is 2 player game
 * - both players have 5 ships with their own strategy of placing them
 * (ships: 2 x ship with length 4, 2 x ships with length 3 and 1 x ship with length 2)
 * this can easy be changed in methods Ships()
 * - user manualy changes the positions of those ships (can be randomly chosen...but for this version is manualy)
 * - game ends after one of players has won
 */

public class Battleship {

	static int mRow = 0;
	static int mColumn = 0;
	static int numOfMovesP1 = 0; // counting moves for player1
	static int numOfMovesP2 = 0; // counting moves for player2
	static boolean player1 = true; // for swithing players

	// method for getting row from user
	public static int askForRow() {

		Scanner in = new Scanner(System.in);

		int row = 0;
		boolean isRowValid = false;
		boolean q = true;
		while (q) {
			try {
				// checking if user input is valid row number
				while (!isRowValid) {
					if (player1) {
						System.out.print("\nPLAYER1\nEnter a row (0, 1, 3, 4, 5, 6, 7, 8 or 9): ");
					} else {
						System.out.print("\nPLAYER2\nEnter a row (0, 1, 3, 4, 5, 6, 7, 8 or 9): ");
					}
					row = in.nextInt();
					// checking is row in valid range of indexes
					isRowValid = isValidRange(row);
					q = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!");
				in.nextLine();
			}
		}

		return row; // if row is valid return it to program
	}

	// method for getting column index from user
	public static int askForColumn() {

		Scanner in = new Scanner(System.in);

		int column = 0;
		boolean isColumnValid = false;
		boolean q = true;
		while (q) {
			try {
				// checking if user input is valid column number
				while (!isColumnValid) {
					if (player1) {
						System.out.print("Enter a column (0, 1, 3, 4, 5, 6, 7, 8 or 9): ");
					} else {
						System.out.print("Enter a column (0, 1, 3, 4, 5, 6, 7, 8 or 9): ");
					}
					column = in.nextInt();
					// checking is column in valid range of indexes
					isColumnValid = isValidRange(column);
					q = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!");
				in.nextLine();
			}
		}

		return column; // if column is valid return it to program
	}
	// checking if any of player has won
	public static boolean hasWon(String[][] grid) {
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (grid[i][j].equals("| ¤ |") || grid[i][j].equals(" ¤ |")) {
					cnt++;
				}

				if (cnt == 16) {
					return true;
				}
			}
		}

		return false;
	}

	// method for checking range of indexes for rows and columns
	public static boolean isValidRange(int section) {
		return (0 <= section && section <= 9);
	}
	// checking if position is already used
	public static boolean isPositionUsed(String[][] grid) {
		String position = grid[mRow][mColumn];
		return position.equals("|   |") || position.equals("   |");
	}
	// displaying grid
	public static void displayGrid(String[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			System.out.println(" --- --- --- --- --- --- --- --- --- ---");
			for (int k = 0; k < grid[i].length; k++) {
				System.out.print(grid[i][k]);
			}
			System.out.println("");
		}
		System.out.println(" --- --- --- --- --- --- --- --- --- ---");
	}
	// creatind 10x10 grid to display
	public static String[][] createGrid(int row, int column) {
		String[][] grid = new String[row][column];
		for (int i = 0; i < grid.length; i++) {
			for (int k = 0; k < grid[i].length; k++) {
				if (k == 0) {
					grid[i][k] = "|   |"; // every first column
				} else {
					grid[i][k] = "   |"; // every column after first
				}
			}
		}

		return grid;
	}
	// counting moves for players and updates every move players made
	public static void updateTurn(String[][] gridShips, String[][] grid) {

		if (player1) {
			if (gridShips[mRow][mColumn] == null) {
				if (mColumn == 0) {
					grid[mRow][mColumn] = "| X |";
					numOfMovesP1++;
				} else {
					grid[mRow][mColumn] = " X |";
					numOfMovesP1++;
				}
			} else {
				if (mColumn == 0) {
					grid[mRow][mColumn] = "| ¤ |";
					numOfMovesP1++;
				} else {
					grid[mRow][mColumn] = " ¤ |";
					numOfMovesP1++;
				}
			}
		} else {
			if (gridShips[mRow][mColumn] == null) {
				if (mColumn == 0) {
					grid[mRow][mColumn] = "| X |";
					numOfMovesP2++;
				} else {
					grid[mRow][mColumn] = " X |";
					numOfMovesP2++;
				}
			} else {
				if (mColumn == 0) {
					grid[mRow][mColumn] = "| ¤ |";
					numOfMovesP2++;
				} else {
					grid[mRow][mColumn] = " ¤ |";
					numOfMovesP2++;
				}
			}
		}
	}
	// creating strategy for positioning ships for player1
	public static String[][] Ships1() {

		String[][] ships1 = new String[10][10];
		ships1[2][1] = "s";
		ships1[2][2] = "s";
		ships1[2][3] = "s";
		ships1[2][4] = "s";
		ships1[4][7] = "s";
		ships1[5][7] = "s";
		ships1[6][7] = "s";
		ships1[7][7] = "s";
		ships1[0][6] = "s";
		ships1[0][7] = "s";
		ships1[0][8] = "s";
		ships1[9][4] = "s";
		ships1[9][5] = "s";
		ships1[9][6] = "s";
		ships1[6][8] = "s";
		ships1[6][9] = "s";

		return ships1;
	}
	// creating strategy for positioning ships for player2
	public static String[][] Ships2() {
		String[][] ships2 = new String[10][10];
		ships2[0][1] = "s";
		ships2[1][1] = "s";
		ships2[2][1] = "s";
		ships2[3][1] = "s";
		ships2[8][4] = "s";
		ships2[8][5] = "s";
		ships2[8][6] = "s";
		ships2[8][7] = "s";
		ships2[5][6] = "s";
		ships2[5][7] = "s";
		ships2[5][8] = "s";
		ships2[2][6] = "s";
		ships2[3][6] = "s";
		ships2[4][6] = "s";
		ships2[9][8] = "s";
		ships2[9][9] = "s";

		return ships2;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String[][] gridShips1 = Ships1(); // creating strategy of p1
		String[][] gridShips2 = Ships2(); // creating strategy of p2
		// grids for display
		String[][] grid1 = createGrid(10, 10);
		String[][] grid2 = createGrid(10, 10);
		boolean keepPlaying = true; 
		boolean isClear;
		// while no player has won keep playing
		while (keepPlaying) {
			// player 1 plays on strategy grid of player 2 and vice verse
			if (player1) {
				displayGrid(grid2);
			} else {
				displayGrid(grid1);
			}
			do {
				mRow = askForRow();
				mColumn = askForColumn();
				if (player1) {
					isClear = isPositionUsed(grid2);
				} else {
					isClear = isPositionUsed(grid1);
				}
				if (!isClear) {
					System.out.println("row: " + mRow + "  column: " + mColumn + " is already been chosen. Try again.");
				}
			} while (!isClear);
			// if position is clear update grid
			if (player1) {
				updateTurn(gridShips2, grid2);
			} else {
				updateTurn(gridShips1, grid1);
			}
			// id any player has won end game with number of moves foe both players
			if (hasWon(grid2) || hasWon(grid1)) {
				keepPlaying = false;
				if (player1) {
					System.out.println("\nPLAYER1 WIN!");
				} else {
					System.out.println("\nPLAYER2 WIN!");
				}
				in.close();
			}
			player1 = !player1; // switching players
		}
		// printing number of moves fo both players at the end of the game
		System.out.println("\nNumber of moves player1: " + numOfMovesP1);
		System.out.println("Number of moves player2: " + numOfMovesP2);
	}

}
