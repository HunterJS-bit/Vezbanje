package Exercises;

public class MazeXX {

	
	
	public static void main(String[] args) {
		
		
		int [][] maze = {
				{1,1,1,1},
				{0,0,1,0},
				{0,0,1,0},
				{0,0,1,2}
	};
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public static int mazeGen(int [][] maze,int a ,int b){
		a = 0;
		b = 0;
		
		if(maze[a][b]==2){
			return 2;
		}else {
			if(validMove(maze, a, b)==true){
				for(int i = 0;i<4;i++){
					return mazeGen(maze, a, b);
				}
			}
			return mazeGen(maze, a, b);
		}
	}
	

	
	public static boolean validMove(int [][] maze,int a,int b){
		if(maze[a][b]==1){
			return true;
		}if(maze[a][b]==0){
			return false;
		}
		return true;
	}
}