package calculadora;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculadora {

    private Calculadora calculadora;

    @Test
    public void testGetAdicao() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getAdicao();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    public void testGetSubtracao() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoExperado = 2.0;
        double retornoFeito = calculadora.getSubtracao();
    }

    @Test
    public void testGetProduto() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoExperado = 8.0;
        double retornoFeito = calculadora.getProduto();
    }

    @Test
    public void testGetDivisao() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoExperado = 2.0;
        double retornoFeito = calculadora.getDivisao();
    }
}
