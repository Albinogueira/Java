package Facul;

import java.io.File;

public class diretorio {

public static void main(String args[])

{

 File file = new File("./");
 File[] arquivos = file.listFiles();

 for (File fileTmp : arquivos) {
     System.out.println(fileTmp.getName());
   }
 }
}
