package RatInAMaze;

public class ratInAMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] maze = new int[][] {{1, 1, 1}, {1, 1, 0}, {0, 1, 1}};
		System.out.println(RatInAMaze(maze));
	}

	private static boolean RatInAMaze(int[][] maze) {
		int n = maze.length;
		int path[][] = new int[n][n];
		
		return allPaths(maze, 0, 0, path);
		
		
		
	}

	private static boolean allPaths(int[][] maze, int i, int j, int[][] path) {
		int n = maze.length;
		// check if i, j cell  is valid or not
		if(i < 0 || j < 0 || i >= n  || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
			return false;
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
			return true;
		}
		
		// Explore Top
		if(allPaths(maze, i -1, j, path)) {
			return true;
		}
		// Explore bottom
		if(allPaths(maze, i + 1, j, path)) {
			return true;
		}
		// Explore left
		if(allPaths(maze, i, j -1, path)) {
			return true;
		}
		// Explore r
		if(allPaths(maze, i, j + 1, path)) {
			return true;
		}
		return false;
	}

	

}
