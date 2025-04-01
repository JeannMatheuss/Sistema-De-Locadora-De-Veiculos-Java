public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Sedan", 100.0);
        System.out.println("Custo para 5 dias: " + veiculo.calcularCusto(5));
        System.out.println("Custo para 7 dias (com desconto): " + veiculo.calcularCusto(7));
        System.out.println("Multa por 3 dias de atraso: " + veiculo.calcularMulta(3));
    }
}