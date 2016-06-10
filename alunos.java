package Facul;

public class alunos{	
	public static void main(String args[]){	
	String[][] alunos = {{"Jose", "Redes"}, 	
	{"Maria", "ADS"},{"Antonio", "Redes"},	
	{"Joana", "ADS"},	
	{"Felipe", "Banco de Dados"}};	
	int soma=0;
		for (int i=0; i < alunos.length; i++){	
			System.out.println(alunos[i][0]+" cursa "+ alunos[i][1] +" na Metrocamp.");
                if (alunos[i][1]== "Redes")
                   soma++;	
		}	
		System.out.println(soma+" alunos cursam Redes.");

	}	
}	
