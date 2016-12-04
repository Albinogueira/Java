public class alunos {
    public String nome;
    public double notaMat,
                  notaFis,
                  media;
   
    public alunos(){
        System.out.println("Objeto criado");
    }
   
    public alunos(String Nome, double NotaMat, double NotaFis){
        nome=Nome;
        notaMat=NotaMat;
        notaFis=NotaFis;
       
        media = (notaMat + notaFis)/2;
    }
}
