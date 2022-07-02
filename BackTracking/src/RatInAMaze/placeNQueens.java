package RatInAMaze;

public class placeNQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void placeNQueens(int n) {
		int board[][] = new int [n][n];
		placeQueens(board, 0, n);
	}

	public static void placeQueens(int board[][], int row, int n) {
		if(row == n) {
			// valid board configuration
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		// Check for all columns
		   	// check if it is safe to place Queen
				// If it is safe -> then place the queen and move to next row
		
		for(int j = 0; j < n; j++) {
			if(isBoardSafe(board, row, j)) {
				board[row][j] = 1;
				placeQueens(board, row + 1, n);
				board[row][j] = 0;
			}
		}
	}
	
	private static boolean isBoardSafe(int board[][], int row, int col) {
		int n = board.length;
		// checking diagonal
		
		for(int i = row - 1, j = col - 1; i >=0 && j >= 0; i--, j--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		for(int i = row + 1, j = col + 1; i < n && j < n; i++, j++) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		
		for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		for(int i = row + 1, j = col - 1; i < n && j >= 0 ; i++, j--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		// cheking columns
		for(int i = row - 1 ; i >= 0; i--) {
			if(board[i][col] == 1) {
				return false;
			}
		}
		
		for(int i = row + 1 ; i < n; i++) {
			if(board[i][col] == 1) {
				return false;
			}
		}
		
		return true;
	}
}
