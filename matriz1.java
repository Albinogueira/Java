package Facul;

public class matriz1{   
	public static void main(String args[]){   
		int matriz[][] = new int[2][3];   
		matriz[0][0] = 5; 
		matriz[0][1] = 10;  
		matriz[0][2] = 15;   
		matriz[1][0] = 3; 
		matriz[1][1] = 6;   
		matriz[1][2] = 9;         
		for (int i = 0; i < matriz.length; i++){                 
			for (int j = 0; j < matriz[i].length; j++){                         
				System.out.println("matriz["+i+"]["+j+"] = "+ matriz[i][j]); 
			} 
		}     
	} 
}
