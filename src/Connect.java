import java.util.Arrays;


public class Connect {

	private String [][] arr;
	
	
	
	public Connect(){
		arr = new String [3][3];
		
		
	}
	
	

	
	
	public void createTable(){
		System.out.println("|  1  |  2     |  3     |  \n"+
"--------------------------\n"+
                          "|"+arr[0][0]+ "     |  "+arr[0][1] +"      | "+arr[0][2] +"       |  \n"+
                          "|"+arr[1][0]+ "     |  "+arr[1][1] +"      | "+arr[1][2] +"       |  \n"+
                          "|"+arr[2][0]+ "     |  "+arr[2][1] +"      | "+arr[2][2] +"       |   \n"
                           );
	}
	
	
	public void setX(int num){
		//setting String in a column
		
	
		if(num>arr.length ){
			System.out.println("Invalid column.try again");
		}else{
			
		if(arr[2][num-1]==""){
				arr[2][num-1]	= "x";
				}else if(arr[1][num-1]==""){
					arr[1][num-1] = "x";
				}else if(arr[0][num-1]==""){
					arr[0][num-1]="x";
				}
	
}
	createTable();
		
		}
	
	
	
	
	
	public void setO(int num){
		
		if(num>arr.length ){
			System.out.println("Invalid column.try again");
		}else{
			
		if(arr[2][num-1]==""){
		arr[2][num-1]	= "o";
				}else if(arr[1][num-1]==""){
					arr[1][num-1] = "o";
				}else if(arr[0][num-1]==""){
					arr[0][num-1]="o";
				}
	}
		createTable();
}
	
	
	
	
	public void checkWinner(){
	
	}
	
	public void initializeArray(){
		for(int i = 0;i<arr.length;i++){
			for(int i2 = 0;i2<arr[i].length;i2++){
				
				arr[i][i2]="";
				
				
			}
		}
		createTable();
	}
	
	
	}

