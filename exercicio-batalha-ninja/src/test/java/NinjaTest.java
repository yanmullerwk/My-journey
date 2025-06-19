import org.junit.Assert;
import org.junit.Test;

public class NinjaTest {
    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar(){
        Jutsu razengan = new Jutsu(5, 10);
        Ninja mestreJiraya = new Ninja("Mestre Jiraya", razengan);

        Jutsu jutsuOponente = new Jutsu(2, 3);
        Ninja oponente =  new Ninja("Oponente", jutsuOponente);

        int chakraEsperadoOponente = 90;


        mestreJiraya.atacar(oponente);

        int chakraDepoisDoAtaque = oponente.getChakra();

        Assert.assertEquals(chakraEsperadoOponente, chakraDepoisDoAtaque);
    }
}
