public class parafrase {
	public static void main(String arga[]) {
		// crie tres conjuntos de palavras onde sera feita a seleção; Adicione o que quiser!
		String [] listaum = {"24/7", "várias camadas", "30.000 pés","B-to-B","todos ganham","front-end", "baseado na Web", "difundido", "inteligente", "seis sigma", "caminho crítico", "dinâmico"};
		String [] listadois= {"habilitado", "adesivo", "valor agregado", "orientado", "central", "distribuído", "agrupado", "solidificado", "independente da máquina", "posicionado", "em rede", "dedicado", "compartilhado", "cooperativo", "acelerado"};
		String [] listatres= {"processo", "ponto máximo", "solução", "arquitetura", "habilitação no núcleo", "estratégia", "mindshare", "portal", "espaço", "visão", "paradigma", "missão"};
		// descubra quantas palavras existem em cada lista
		int umlength = listaum.length;
		int doislength = listadois.length;
		int treslength = listatres.length;
		// gera tres numeros aleatorios
		int rand1 = (int) (Math.random() * umlength);
		int rand2 = (int) (Math.random() * doislength);
		int rand3 = (int) (Math.random() * treslength);
		//agora construa uma frase
		String frase = listaum[rand1] + " " + listadois[rand2] + " " + listatres[rand3];
		// exiba a frase
		System.out.println("Precisamos de "+frase);
	}
}


