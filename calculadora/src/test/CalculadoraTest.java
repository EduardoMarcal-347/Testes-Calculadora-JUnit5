package test;

import calculadora.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    //arrange
    //act
    //Assign

    @Test
    public void testaMemoriaConstrutorVazio(){
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 0;
        assertEquals(resultadoEsperado, calculadora.getMemoria(),"A memória está diferente de 0");
    }

    @Test
    public void testaMemoriaContrutorValorZero(){
        Calculadora calculadora = new Calculadora(0);
        int  resultadoEsperado = 0;

        assertEquals(resultadoEsperado, calculadora.getMemoria(),"A memória está diferente da entrada do construtor");
    }
    @Test
    public void testaMemoriaContrutorValorDez(){
        Calculadora calculadora = new Calculadora(10);
        int  resultadoEsperado = 10;

        assertEquals(resultadoEsperado, calculadora.getMemoria(),"A memória está diferente da entrada do construtor");
    }
    @Test
    public void testaMemoriaContrutorValorDezNegativo(){
        Calculadora calculadora = new Calculadora(-10);
        int  resultadoEsperado = -10;

        assertEquals(resultadoEsperado, calculadora.getMemoria(),"A memória está diferente da entrada do construtor");
    }

    @Test
    public void testaSoma(){
        Calculadora calculadora = new Calculadora(0);
        int valorEntrada = -5, resultadoEsperado = -5;

        calculadora.somar(valorEntrada);
        assertEquals(resultadoEsperado, calculadora.getMemoria());
    }

    @Test
    public void testaSubtracao(){
        Calculadora calculadora = new Calculadora(0);
        int valorEntrada = 10, resultadoEsperado = -10;

        calculadora.subtrair(valorEntrada);
        assertEquals(resultadoEsperado, calculadora.getMemoria());
    }

    @Test
    public void testaMultiplicacao(){
        //inicializando memoria com valor 10
        Calculadora calculadora = new Calculadora(10);
        int valorEntrada = 5, resultadoEsperado = 50;

        calculadora.multiplicar(valorEntrada);
        assertEquals(resultadoEsperado, calculadora.getMemoria());
    }

    @Test
    public void testaDivisaoZero() throws Exception {
        Calculadora calculadora = new Calculadora(100);
        int valorEntrada = 0;

        assertThrows(Exception.class, () -> calculadora.dividir(valorEntrada));
    }
    @Test
    public void testaDivisaoValorPositivo() throws Exception {
        Calculadora calculadora = new Calculadora(100);
        int valorEntrada = 20, resultadoEsperado = 5;

        calculadora.dividir(valorEntrada);

        assertEquals(resultadoEsperado, calculadora.getMemoria());
    }

    @Test
    public void testaExponenciacaoPorUm() throws Exception{
        Calculadora calculadora = new Calculadora(3);
        int valorEntrada = 1, resultadoEsperado = 3;

        calculadora.exponenciar(valorEntrada);

        assertEquals(resultadoEsperado, calculadora.getMemoria());
    }

    @Test
    public void testaExponenciacao(){
        Calculadora calculadora = new Calculadora(3);
        int valorEntrada = 11;

        assertThrows(Exception.class, () -> calculadora.exponenciar(valorEntrada));
    }

    @Test
    public void testaZerarMemoria(){
        Calculadora calculadora = new Calculadora(100);
        int resultadoEsperado = 0;

        calculadora.zerarMemoria();

        assertEquals(resultadoEsperado, calculadora.getMemoria());
    }

}