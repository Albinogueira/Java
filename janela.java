package Facul;

import java.awt.*;
import javax.swing.JFrame;
public class janela {

	public static void main(String[] args) {
		JFrame janelas = new JFrame("Meu primeiro frame em Java");
		painel meuPainel = new painel();
		janelas.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		janelas.add(meuPainel);
		janelas.setSize(600,400);
		janelas.setVisible(true);
	}

}
