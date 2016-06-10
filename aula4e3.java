package Facul;

import javax.swing.*;
public class aula4e3 {
	public void exibir(){
		int escarea=0;
		int esccurso=0;
		double duracao=0;
		String curso=" ";
		escarea=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre: \n 1 para Cursos de Gest\u00e3o; \n 2 para Cursos de TI"));
		switch (escarea){
			case 1:
				duracao=2;
				esccurso=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre: \n 1 - Finan\u00e7as; \n 2 - RH; \n 3 - Log\u00edstica; \n 4 - Marketing"));
				switch (esccurso){
					case 1:
						curso="Finan\u00e7as";
						break;
					case 2:
						curso="RH";
						break;
					case 3:
						curso="Log\u00edstica";
						break;
					case 4:
						curso="Marketing";
						break;			
					default:
						curso="Curso Inv\u00e1lido";
				}
			break;
			case 2:
				duracao=2.5;
				esccurso=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre: \n 1 - SI; \n 2 - Redes; \n 3 - Banco de Dados; \n 4 - WebDesign"));
				switch (esccurso){
					case 1:
						curso="SI";
						break;
					case 2:
						curso="Redes";
						break;
					case 3:
						curso="Banco de Dados";
						break;
					case 4:
						curso="WebDesign";
						break;			
					default:
						curso="Curso Inv\u00e1lido";
				}
			break;
			default:
				curso="Opção Inválida";
		}
		JOptionPane.showMessageDialog(null, "O curso escolhido foi "+curso+" com dura\u00e7\u00e3o de "+duracao+" anos.");
	}
}
