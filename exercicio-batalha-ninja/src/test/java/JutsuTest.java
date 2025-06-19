import org.junit.Assert;
import org.junit.Test;

public class JutsuTest {

    @Test
    public void deveCriarJutsuValido(){
        Jutsu cloneDasSombras = new Jutsu(5, 10);
        int consumoEsperado = 5;
        int danoEsperado = 10;

        int consumo = cloneDasSombras.getConsumoChakra();
        int dano = cloneDasSombras.getDano();

        Assert.assertEquals(consumoEsperado, consumo);
        Assert.assertEquals(danoEsperado, dano);
    }

    @Test
    public void deveAjustarJutsuInvalido(){
        Jutsu cloneDasSombras = new Jutsu(10, 14);
        int consumoEsperado = 5;
        int danoEsperado = 10;

        int consumo = cloneDasSombras.getConsumoChakra();
        int dano = cloneDasSombras.getDano();

        Assert.assertEquals(consumoEsperado, consumo);
        Assert.assertEquals(danoEsperado, dano);
    }

    @Test
    public void deveAjustaChakraNegativoParaZero(){
        Jutsu cloneDasSombras = new Jutsu(-5, 10);
        int consumoEsperado = 0;

        int consumo = cloneDasSombras.getConsumoChakra();

        Assert.assertEquals(consumoEsperado, consumo);
    }

    @Test
    public void deveAjustaDanoNegativoParaZero(){
        Jutsu cloneDasSombras = new Jutsu(-5, -10);
        int danoEsperado = 0;

        int consumo = cloneDasSombras.getDano();

        Assert.assertEquals(danoEsperado, consumo);
    }

}
