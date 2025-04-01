public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria) {
        if (valorDiaria < 0) {
            throw new IllegalArgumentException("O valor da diária não pode ser negativo.");
        }
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public double calcularCusto(int dias) {
        if (dias < 0) {
            throw new IllegalArgumentException("O número de dias não pode ser negativo.");
        }
        double custo = dias * valorDiaria;
        return aplicarDesconto(custo, dias);
    }

    private double aplicarDesconto(double custo, int dias) {
        if (dias >= 7) {
            return custo * 0.9; // 10% de desconto
        }
        return custo;
    }

    public double calcularMulta(int diasAtraso) {
        if (diasAtraso < 0) {
            throw new IllegalArgumentException("O número de dias de atraso não pode ser negativo.");
        }
        return diasAtraso * valorDiaria * 1.2; // Multa de 20% sobre a diária
    }
}
