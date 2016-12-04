class testameufunc {

      public static void main(String[] args) {
		meufunc f1 = new meufunc();
		f1.nome = "Fulano";
		f1.salario = 100;
		f1.bonifica(1.50);
		System.out.println("nome do funcionario: "+f1.nome);
		System.out.println("salario atual: " + f1.salario);
		System.out.println("ganho anual: " + f1.calculaGanhoAnual());
		
		f1.departamento = "Transito livre";
		f1.rg= "23.654.232-x";
		//f1.entrada="15/02/2015";
		Data data = new Data(); // ligação!
		data.dia=15;
		data.mes=9;
		data.ano=2015;
		f1.dataDeEntrada = data;
		f1.mostra();
		//criando outra referencia com o mesmo funcionario
		meufunc f2=f1;
		f1.mostra();
		f1.salario=1234;
		System.out.println(f1.calculaGanhoAnual());
	}
}
