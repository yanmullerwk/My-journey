import org.junit.Assert;
import org.junit.Test;

public class BatalhaTest {
    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra(){
        Jutsu tidori= new Jutsu(5, 10);
        Ninja kakashi = new Ninja("Kakashi",tidori);

        Jutsu bolaDeFogo = new Jutsu(5, 8);
        Ninja sasuke = new Ninja("Sasuke",bolaDeFogo);

        Batalha batalha = new Batalha();

        Assert.assertEquals(kakashi, batalha.lutar(kakashi, sasuke));
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoForMaisForte(){
        Jutsu jutsuUm = new Jutsu(2, 2);
        Ninja primeiroNinja = new Ninja("NinjaNum1",jutsuUm);

        Jutsu bolaDeFogo = new Jutsu(5, 8);
        Ninja segundoNinja = new Ninja("NinjaNum2",bolaDeFogo);

        Batalha batalha = new Batalha();

        Assert.assertEquals(segundoNinja,batalha.lutar(primeiroNinja,segundoNinja));
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi(){
        Jutsu jutsuUm = new Jutsu(0, 0);
        Ninja ninjaUm = new Ninja("Itachi", jutsuUm);

        Jutsu jutsuDois = new Jutsu(5, 10);
        Ninja ninjaDois = new Ninja("Naruto", jutsuDois);

        Batalha batalha = new Batalha();


        Assert.assertEquals(ninjaUm, batalha.lutar(ninjaUm, ninjaDois));
    }

    @Test
    public  void  deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi(){
        Jutsu jutsuUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("soso", jutsuUm);
        Jutsu jutsuDois = new Jutsu(5, 10);
        Ninja ninjaDois = new Ninja("Itachi", jutsuUm);

        Batalha batalha = new Batalha();

        Assert.assertEquals(ninjaDois, batalha.lutar(ninjaUm, ninjaDois));
    }
    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar(){
        Jutsu jutsuUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("hinata", jutsuUm);
        Jutsu jutsuDois = new Jutsu(5, 10);
        Ninja ninjaDois = new Ninja("sakura", jutsuDois);

        Batalha batalha = new Batalha();

        Assert.assertEquals(ninjaUm, batalha.lutar(ninjaUm, ninjaDois));
    }



}
