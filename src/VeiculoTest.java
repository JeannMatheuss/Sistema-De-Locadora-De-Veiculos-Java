import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void testCalcularCustoSemDesconto() {
        Veiculo veiculo = new Veiculo("Sedan", 100.0);
        assertEquals(500.0, veiculo.calcularCusto(5));
    }

    @Test
    void testCalcularCustoComDesconto() {
        Veiculo veiculo = new Veiculo("Sedan", 100.0);
        assertEquals(630.0, veiculo.calcularCusto(7)); // 10% de desconto
    }

    @Test
    void testCalcularCustoComZeroDias() {
        Veiculo veiculo = new Veiculo("Sedan", 100.0);
        assertEquals(0.0, veiculo.calcularCusto(0));
    }

    @Test
    void testCalcularMultaPorAtraso() {
        Veiculo veiculo = new Veiculo("Sedan", 100.0);
        assertEquals(360.0, veiculo.calcularMulta(3)); // 3 dias de atraso com 20% sobre a diária
    }

    @Test
    void testValorDiariaNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Veiculo("Sedan", -50.0));
        assertEquals("O valor da diária não pode ser negativo.", exception.getMessage());
    }

    @Test
    void testDiasNegativosNoAluguel() {
        Veiculo veiculo = new Veiculo("Sedan", 100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> veiculo.calcularCusto(-3));
        assertEquals("O número de dias não pode ser negativo.", exception.getMessage());
    }

    @Test
    void testDiasNegativosNaMulta() {
        Veiculo veiculo = new Veiculo("Sedan", 100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> veiculo.calcularMulta(-2));
        assertEquals("O número de dias de atraso não pode ser negativo.", exception.getMessage());
    }
}
