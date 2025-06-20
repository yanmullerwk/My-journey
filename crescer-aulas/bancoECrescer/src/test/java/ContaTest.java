import com.crescer.yan.conta.Conta;
import com.crescer.yan.pessoa.Pessoa;
import org.junit.Assert;
import org.junit.Test;

public class ContaTest {
    @Test
    public void deveAtualizarOSaldoQuandoOcorerUmSaque(){
        //arrange
        Pessoa titular = new Pessoa("GUSTA", "12312312345", "123123123");
        Conta contaPablo = new Conta(titular, 111);
        double saldoEsperado = 700;

        //act
        contaPablo.sacar(300);

        //assert
        Assert.assertEquals(saldoEsperado, contaPablo.getSaldo(), 0.01);
    }

    @Test
    public void deveSacarComSucessoQuandoOcorrerUmSaqueComSaldoSuficiente(){
        Pessoa titular = new Pessoa("GUSTA", "12312312345", "123123123");
        Conta contaPablo = new Conta(titular, 111);
        contaPablo.deposita(3000);

        boolean foiPosivelSacar = contaPablo.sacar(300);

        Assert.assertTrue(foiPosivelSacar);

    }

    @Test
    public void deveImpedirOSaqueQuandoOcorrerUmaTentetivaDeSaqueSemSaldoSuficiente(){
        Pessoa titular = new Pessoa("GUSTA", "12312312345", "123123123");
        Conta contaPablo = new Conta(titular, 111);
        contaPablo.deposita(1000);

        boolean foiPossivelSacar = contaPablo.sacar(1020);

        Assert.assertFalse(foiPossivelSacar);
    }

    @Test
    public void deveManterOSaldoQuandoOcorrerUmaTentetivaDeSaqueSemSaldoSuficiente(){
        Pessoa titular = new Pessoa("GUSTA", "12312312345", "123123123");
        Conta contaPablo = new Conta(titular, 111);
        contaPablo.deposita(1000);
        double saldoEsperado = 1000;

        contaPablo.sacar(1500);

        Assert.assertEquals(saldoEsperado, contaPablo.getSaldo(), 0.01);
    }

    @Test
    public void deveAtualizarOSaldoQuandoOcorrerUmDeposito(){
        Pessoa titular = new Pessoa("GUSTA", "12312312345", "123123123");
        Conta contaPablo = new Conta(titular, 111, 1000);
        double saldoEsperado = 1500;

        contaPablo.deposita(500);

        Assert.assertEquals(saldoEsperado, contaPablo.getSaldo(), 0.01);
    }

    @Test
    public void deveAtualizarOSaldoDaContaOrigemQuandoOcorrerUmaTransferencia(){
        Pessoa titular = new Pessoa("GUSTA", "12312312345", "123123123");
        Conta contaPablo = new Conta(titular, 111);
        Pessoa titular2 = new Pessoa("MILA", "12312313345", "123121123");
        Conta conta2 = new Conta(titular2,112, 1000);
        double saldoEsperadoContaOrigem = 400;

        contaPablo.transferir(conta2, 600);

        Assert.assertEquals(saldoEsperadoContaOrigem, contaPablo.getSaldo(), 0.01);
    }

}
