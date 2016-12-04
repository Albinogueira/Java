class meufunc {
       double salario;
       String nome, departamento, rg;
       Data dataDeEntrada; // qual é o valor default aqui?
       void bonifica(double aumento) {
			this.salario=salario*aumento;
       }

		void mostra() {
			System.out.println("Nome do funcionario: "+this.nome);
			System.out.println("Departamento alocado: "+this.departamento);
			//System.out.println("Data de entrada: "+this.entrada);
			System.out.println("R.G. : "+this.rg);
			System.out.println("Dia: " + this.dataDeEntrada.dia);
            System.out.println("Mês: " + this.dataDeEntrada.mes);
            System.out.println("Ano: " + this.dataDeEntrada.ano);
		}
       double calculaGanhoAnual() {
		   double total;
		   return total = salario*12;
       }
}

