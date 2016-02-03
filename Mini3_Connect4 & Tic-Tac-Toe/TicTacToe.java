package Mini3_C4_XO;

import java.util.*;

public class TicTacToe {

	public static boolean isPlayer1Turn = true; // seting first player at start of the game
	static int mRow = 0;
	static int mColumn = 0;
	// method for getting column index from user
	public static int askForColumn() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int column = 0;
		boolean isColumnValid = false;
		// checking if user input is valid column number
		while (!isColumnValid) {
			if (isPlayer1Turn) {
				System.out.print("Enter a column (0, 1, or 2) for player X: ");
			} else {
				System.out.print("Enter a column (0, 1, or 2) for player O: ");
			}
			column = in.nextInt();
			// checking is column in valid range of indexes
			isColumnValid = isValidRange(column);
		}
		
		return column; // if column is valid return it to program
	}
	// method for getting row from user
	public static int askForRow() {
		int row = 0;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		boolean isRowValid = false;
		// checking if user input is valid row number
		while (!isRowValid) {
			if (isPlayer1Turn) {
				System.out.print("Enter a row (0, 1, or 2) for player X: ");
			} else {
				System.out.print("Enter a row (0, 1, or 2) for player O: ");
			}
			row = in.nextInt();
			// checking is row in valid range of indexes
			isRowValid = isValidRange(row);
		}
		
		return row; // if row is valid return it to program
	}
	// method for checking range of indexes for rows and columns
	public static boolean isValidRange(int section) {
		return (0 <= section && section <= 2);
	}
	// method for checking if entered rowxcolumn index position is slear or not
	public static boolean isPositionClear(String[][] grid) {
		String position = grid[mRow][mColumn];
		return position.equals("|   |") || position.equals("   |");
	}
	// method for drawing grid for tic-tac-toe game
	public static void displayGrid(String[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			System.out.println("-------------");
			for (int k = 0; k < grid[i].length; k++) {
				System.out.print(grid[i][k]);
			}
			System.out.println("");
		}
		System.out.println("-------------");
	}
	// creating 3x3 matrix for tic-tac--toe grid
	public static String[][] createGrid(int row, int column) {
		String[][] grid = new String[row][column];
		for (int i = 0; i < grid.length; i++) {
			for (int k = 0; k < grid[i].length; k++) {
				if (k == 0)
					grid[i][k] = "|   |"; // every first column
				else
					grid[i][k] = "   |"; // every column after first
			}
		}
		return grid;
	}
	
	public static boolean updateTurn(String[][] grid) {
		// if grid isn't empty return false
		if (!grid[mRow][mColumn].equals("|   |") && !grid[mRow][mColumn].equals("   |"))
			return false;

		String update;
		// updates table with X or O
		if (isPlayer1Turn)
			update = (mColumn == 0) ? "| X |" : " X |";
		else
			update = (mColumn == 0) ? "| O |" : " O |";
		// position in matrix to be updated
		grid[mRow][mColumn] = update;

		return true;
	}
	// this method returns true if one of conditions for win is completed
	public static boolean hasWon(String[][] grid) {
		
		int player = (isPlayer1Turn) ? 0 : 1;
		String token = (player == 0) ? "X" : "O";
		// if one of this values is true then one of players has won
		return (checkRow(grid, token) || checkColumn(grid, token) || checkDiagonal(grid, token));
	}
	// this is method for checking if is table full and there is no winner so it's a tie
	public static boolean isTie(String[][] grid) {
		// checking if table(matrix) is full
		for (int k = 0; k < grid[0].length; k++) {
			for (int i = 0; i < grid[0].length; i++) {
				if (grid[k][i].equals("|   |") || grid[k][i].equals("   |"))
					return false;
			}
		}

		return true;
	}
	// this method is checking if one of players won by column
	public static boolean checkColumn(String[][] grid, String s) {

		int occurence = 0;
		for (int k = 0; k < grid[0].length; k++) {
			for (int i = 0; i < grid.length; i++) {
				if (grid[i][k].contains(s))
					occurence++;
			}
			if (occurence == 3)
				return true;
			else
				occurence = 0;
		}

		return false;
	}
	// this method is checking if one of player has won by row
	public static boolean checkRow(String[][] grid, String s) {

		int occurrence = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int k = 0; k < grid[i].length; k++) {
				if (grid[i][k].contains(s))
					occurrence++;
			}
			if (occurrence == 3)
				return true;
			else
				occurrence = 0;
		}

		return false;
	}
	// this method is checking if any player has won by columns
	public static boolean checkDiagonal(String[][] grid, String s) {

		// check from top left to bottom right
		int occurrence = 0;
		int x = 0;
		int y = 0;
		while (x < grid[0].length && y < grid.length) {

			if (grid[y][x].contains(s))
				occurrence++;
			if (occurrence == 3)
				return true;
			x++;
			y++;
		}

		// Checking from bottom left to top right
		occurrence = 0;
		x = 0;
		y = grid.length - 1;
		while (x < grid[0].length && y >= 0) {

			if (grid[y][x].contains(s))
				occurrence++;
			if (occurrence == 3)
				return true;
			y--;
			x++;
		}

		return false;
	}
	
	public static void main(String[] args) {
		
		boolean keepPlaying = true; //this is for while loop
		boolean isClear;
		Scanner in = new Scanner(System.in);
		// creating 3x3 grid
		String[][] grid = createGrid(3, 3);
		// while is true keep playing
		while (keepPlaying) {
			// displaying grid on console
			displayGrid(grid);
			// calling ask row and ask column methods for entering row and column indexes
			do {
				mRow = askForRow();
				mColumn = askForColumn();
				// if position is clear ad curent player sign to it if not ask for other indexes
				isClear = isPositionClear(grid);
				if (!isClear) {
					System.out.println("row: " + mRow + " column: " + mRow + " is already been chosen. Try again.");
				}
			} while (!isClear);
			// displaying grid with updated sign for last move
			updateTurn(grid);
			// if any of players won display message for player won and ask for play again or not
			if (hasWon(grid)) {
				displayGrid(grid);
				String player = (isPlayer1Turn) ? "X" : "O";
				System.out.println("Player " + player + " has won.");
				System.out.print("Do you want to play again? y (for Yes)/any key (for No): ");
				String option = in.next();
				keepPlaying = (option.equalsIgnoreCase("y"));
				grid = createGrid(3, 3);
			}
			// if table is full and none of players has won end game with a tie and ask for play again or not
			else if (isTie(grid)){
				displayGrid(grid);
				System.out.println("It's a tie.");
				System.out.print("Do you want to play again? y (for Yes)/any key (for No): ");
				String option = in.next();
				keepPlaying = (option.equalsIgnoreCase("y"));
				grid = createGrid(3, 3);
			}
			isPlayer1Turn = !isPlayer1Turn; // switch player

		}
		// if player chose to not play again end game...
		System.out.println("Game ended...");
		in.close();
	}

}
