package RatInAMaze;

public class PrintAllPathsRat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] maze = new int[][] {{1, 1, 1}, {1, 1, 0}, {0, 1, 1}};
		int n = maze.length;
		int path[][] = new int[n][n];
		allPossiblePaths(maze, 0, 0, path);
	}

	private static void allPossiblePaths(int[][] maze, int i, int j, int[][] path) {
		int n = maze.length;
		// check if i, j cell  is valid or not
		if(i < 0 || j < 0 || i >= n  || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
			return ;
		}
		// include the cell in current path 
		path[i][j] = 1;
		// Destination cell
		if(i == n -1 && j == n-1) {
			for(int r = 0; r < n; r++) {
				for(int c = 0; c < n; c++) {
					System.out.print(path[r][c] + " ");
				}
				System.out.println();
			}
			System.out.println();
			path[i][j] = 0;
			return;
		}
		
		// Explore Top
		 allPossiblePaths(maze, i -1, j, path);
		// Explore bottom
		 allPossiblePaths(maze, i + 1, j, path);
		// Explore left
		 allPossiblePaths(maze, i, j - 1, path);
		// Explore right
		allPossiblePaths(maze, i, j + 1, path);
		
		path[i][j] = 0;
		return;
	}

}
