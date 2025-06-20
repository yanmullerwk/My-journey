import com.crescer.yan.pessoa.Funcionario;
import org.junit.Assert;
import org.junit.Test;

public class FuncionarioTest {
    //deve calcu o salario com acrescimo de 10 porcento quando consultado salario com bonificação
    @Test
    public void deveCalcularSalarioComAcrecimoDeDezPorCentoQuandoConsultadoOSalarioComBonificacao(){
        //arrange
        Funcionario funcionario = new Funcionario("mikael", "123456789","123456789");
        funcionario.setSalario(1000);
        double salarioEsperado = 1100;

        //act
        double salarioComBonificacao = funcionario.getSalarioComBonus();

        //assert
        Assert.assertEquals(salarioEsperado,salarioComBonificacao,0.01);
    }
}
