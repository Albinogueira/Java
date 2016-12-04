public class thismetodo{
    
    public static void main(String[] args){
        String nome = "Fulado de Tal";
        int ID=2112; 
        double salario = 1000000;
        
        funcionario chefe = new funcionario(nome, ID, salario);
        
        chefe.exibir();
    }

}
