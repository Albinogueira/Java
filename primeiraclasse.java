import java.util.Scanner;
        
public class primeiraclasse {
	
/*	System.out.println("O logaritmo natural de 10 é = "+ Math.log(10) );
    System.out.println("O logaritmo natural de 'e' é = "+ Math.log( Math.E ) );
    System.out.println("O seno de 90 é = "+ Math.sin( (Math.PI)/2 ) );
    System.out.println("O cosseno de 0 é = "+ Math.cos(0) );
    System.out.println("A tangente de 45 é= "+ Math.tan( (Math.PI)/4 ));
    Para calcular o módulo de um número 'numero' usamos: Math.abs(numero)
	Para calcular o valor mínimo de dois números 'num1' e 'num2', usamos: Math.min(num1,num2)
	Para calcular o valor máximo de dois números 'num1' e 'num2', usamos: Math.max(num1,num2)
	Para arredondar um número 'numero' para cima, usamos: Math.ceil(numero)
	Para arredondar um número 'numero' para baixo, usamos: Math.floor(numero)
	
	Estes métodos, assim como todos os outros, recebem e retornam double. Caso deseje receber a passar outro tipo, use cast conforme foi explicado no método pow().
*/
	
	public static float media(float... valores){ // metodo com lista de parametros passados
        float media=0;
        
        for(float valor: valores){
            media +=valor;
        }
        
        return media/valores.length;
    }
    
	public static float IMC(float peso, float altura){ // este é um metodo
		//return peso/(float)Math.pow(altura, 2); ou usar da forma que esta abaixo
		float imc;
		imc = peso/(altura*altura);
		return imc;
	}
	
	public static float IMC1(float peso, float altura){ // este é um metodo usando outro metodo dentro
            //return peso/(float)Math.pow(altura, 2); ou usar da forma que esta abaixo
            float imc;
            imc = peso/quadrado(altura);
            return imc;
        }
    
	public static float quadrado(float num){ // este é um metodo com float
		//return Math.pow(num,2); ou usar da forma que esta abaixo
        return num * num;
    }
	// pode-se usar os dois metodos quadrado, tanto com float como com int
	public static int quadrado(int num){ // este é um metodo com inteiro
		//return Math.pow(num,2); ou usar da forma que esta abaixo
		int quadrado;
		quadrado = num * num;
		return quadrado;
	}

/*	public static String mensagem(){ // esta é uma classe
        return "Curso Java Progressivo!";
    } ou pode ser do jeito abaixo*/
	public static void mensagem(){ // esta é uma classe
            System.out.println("Albinogueira Sistemas de Informação");
        }
    
    
    public static void main(String[] args) {
		mensagem(); // chamando a classe mensagem() acima
        alunos donaFifi = new alunos();
        String nome;
        Double notaMat,notaFis;
        
        Scanner entrada = new Scanner (System.in);

        System.out.print("Nome do aluno: ");
        nome = entrada.nextLine();
        
        System.out.print("Nota em Matemática: ");
        notaMat = entrada.nextDouble();
        
        System.out.print("Nota em Física: ");
        notaFis = entrada.nextDouble();
        
        alunos patropi = new alunos(nome, notaMat, notaFis);
        System.out.printf("O aluno \"%s\" tirou %2.2f em Matemática, "
                + "%2.2f em Física e obteve média %2.2f\n", patropi.nome,
                                                            patropi.notaMat,
                                                            patropi.notaFis,
                                                            patropi.media);
            peso=70;
            altura=1.70;
            double numero_quadrado,numero=4;
            int valor1=1,valor2=2,valor3=3,valor4=4,valor5=5;
	    numero_quadrado=quadrado(numero); // colocando o metodo em uma variavel com parametro numero
	    imc = IMC(peso, altura); // armazena o metodo IMC na variavel com os parametros peso e altura
	    System.out.println("A média dos 5 números é: "+media(valor1,valor2,valor3,valor4,valor5)); // chamando o metodo com uma lista de parametros
    }
}
