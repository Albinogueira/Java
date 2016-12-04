import java.util.Scanner;
public class Tipos {
    public static void main(String[] args){
         int a,
            b=1;
        //soma com ++ antes e depois da variavel
        System.out.println("b = " + b);
        System.out.println("a = b++ ");
        a = b++;
        System.out.println("Então: a = " + a);
        System.out.println();
        
        System.out.println("b = " + b);
        System.out.println("a = ++b ");
        a = ++b;
        System.out.println("Então: a = " + a);
         int count=1; 
        //contagem com while 
        while(count<=10){ 
            System.out.println(count); 
            count++; 
        }
        int inicial=1, razao=3, an=inicial, valor_max=20; 
         // progressao aritmetica
        System.out.printf("Elementos da PA, de valor inicial %d e razão %d, menores que %d\n", inicial, razao, valor_max ); 
        while(an<=valor_max){ 
            System.out.println(an); 
            an += razao; 
        }
        int quociente=2, gn=inicial;
            valor_max=32; 
         // progressao geometrica
        System.out.printf("Elementos da PG, de valor inicial %d e razão %d, menores que %d\n", inicial, quociente, valor_max ); 
        while(gn<=valor_max){ 
            System.out.println(gn); 
            gn *= quociente; 
        }
        boolean continuar = true; 
        char opcao; 
        Scanner entrada = new Scanner(System.in); 
        
        while(continuar){ 
            System.out.println("Você está na matrix;"); 
            System.out.print("Digite o caractere especial para sair da matrix: "); 
            opcao = entrada.next().charAt(0); 
            
            if(opcao=='j'){ 
                continuar=false; 
                System.out.println("Parabéns! Você conseguiu sair da Matrix!"); 
            } 
            else{ 
                System.out.println("Você não está autorizado a sair da Matrix. Estude Java."); 
            }; 
        }
         for(int sobe=1, desce=10 ; sobe<=10 && desce>=1; sobe++, desce--){
            System.out.printf("%d \t %d \n", sobe, desce);
        }
        continuar=true;
        int opcaos;
        Scanner entradas = new Scanner(System.in);
        do
        {
            System.out.println("\t\tMenu de opções do curso Java Progressivo:");
            System.out.println("\t1. Ver o menu");
            System.out.println("\t2. Ler o menu");
            System.out.println("\t3. Repetir o menu");
            System.out.println("\t4. Tudo de novo");
            System.out.println("\t5. Não li, pode repetir?");
            System.out.println("\t0. Sair");
            
            System.out.print("\nInsira sua opção: ");
            opcaos = entradas.nextInt();
            
            if(opcaos == 0){
                continuar = false;
                System.out.println("Programa finalizado.");
            }
            else{
                System.out.printf("\n\n\n\n\n\n");
            }
            
        } while( continuar );
        long i = System.currentTimeMillis();
        //boolean imprimir = true;
        
        for(count=1 ; count <=1000000 ; count++){
			if(count % 2 == 0){
                continue;
            }
            if((count % 17 == 0) && (count % 19 == 0))
                //if(imprimir){
                    System.out.println(count);
                    //imprimir=false;
                    break;
                //}
        }

        System.out.println("Tempo de execução, em milisegundos: "+ (System.currentTimeMillis() -i));
    }

}
