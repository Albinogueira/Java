public class controlehorario {

    public static void main(String[] args) {

        Hora horaChegada = new Hora(8, 0, 0);
        Hora horaSaida = new Hora(19, 30, 0);
        Funcionario2 fulano = new Funcionario2("Fulano de Tal", horaChegada, horaSaida);
        
        System.out.println("Hora de chegada: " + horaChegada);
        System.out.println("Hora de saída: " + horaSaida);
        System.out.printf("Horas trabalhadas: %.1f\n",fulano.getHorasTrabalhadas());
        

    }

}
