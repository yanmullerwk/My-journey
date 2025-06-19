import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros(){
        //Arrange
        int valorA = 32;
        int valorB = 10;
        int valorEsperado = 42;
        Calculadora calculadora = new Calculadora();

        //Act
        int resultado = calculadora.soma(valorA,valorB);

        //Assert
        Assert.assertEquals(valorEsperado, resultado);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros(){
        double valorA = 18;
        double valorB = 2;
        int valorEsperado = 9;

        Calculadora calculadora = new Calculadora();

        int resultado = (int) calculadora.divide(valorA,valorB);


        Assert.assertEquals(valorEsperado, resultado);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes(){
        double valorA = 3.0;
        double valorB = 1.5;

        double valorEsperado = 2;
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divide(valorA,valorB);

        Assert.assertEquals(valorEsperado, resultado,0.001);

    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros(){
        int valorA = 2;
        int valorB = 3;
        int valorEsperado = 6;
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.multiplica(valorA,valorB);

        Assert.assertEquals(valorEsperado, resultado);
    }

    @Test
    public void deveSubtrairCorretamenteQuandoNumerosForemInteiros(){
        int valorA = 10;
        int valorB = 5;
        int valorEsperado = 5;
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.subtrai(valorA,valorB);
        Assert.assertEquals(valorEsperado, resultado);
    }

    @Test
    public void deveFazerARaizCorretamente(){
        double valorA = 9;
        double valorEsperado = 3;
        Calculadora calculadora = new Calculadora();


        Assert.assertEquals(valorEsperado, calculadora.raiz(valorA),0.001);
    }

    @Test
    public void deveFazerAPotenciaCorretamente(){
        double valorA = 5;
        double potencia = 3;
        double valorEsperado = 125;
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.potencia(valorA,potencia);

        Assert.assertEquals(valorEsperado, resultado,0.001);
    }

    @Test
    public void deveFazerASomaDasRaizesCorretamente(){
        double a = 1;
        double b = -5;
        double c = 6;
        double valorEsperado = 5;

        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.bhaskara(a,b,c);

        Assert.assertEquals(valorEsperado, resultado,0.001);

    }


}
