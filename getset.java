public class getset{
    
    public static void main(String[] args){
        String nome = "Fulano de Tal";
        int ID=2112; 
        double salario = 1000000;
        
        funcionario1 chefe = new funcionario1();
        
        //funcionario chefe = new funcionario(nome, ID, salario); ou usar da maneira abaixo
        
        chefe.setNome(nome);
        chefe.setID(ID);
        chefe.setSalario(salario);
        
        chefe.exibir();
    }

}
