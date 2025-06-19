import org.junit.Test;

public class Exemplos {

    @Test
    public void testaPessoa(){
        Pessoa rogeria = new Pessoa();
        rogeria.nome = "Rogeria";
        rogeria.idade = 23;
        Pessoa joao = new Pessoa();
        joao.nome = "Joao";
        joao.idade = 10;

        rogeria.apresentarse();
        joao.apresentarse();
    }

}
