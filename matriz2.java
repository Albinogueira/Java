package Facul;

public class matriz2{
	public static void main(String args[]){
		int matriz[][] = {{5,10,15},{3,6,9}};
		System.out.println("Numero de Linhas: "+ matriz.length);
		System.out.println("Numero de Colunas: "+ matriz[0].length);
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[i].length; j++){
				System.out.println("matriz["+i+"]["+j+"] = "+ matriz[i][j]);
             }
       }   
   } 
}
