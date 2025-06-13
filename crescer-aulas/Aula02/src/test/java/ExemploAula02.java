import org.junit.Test;

public class ExemploAula02 {
    @Test
    public void exemploVarivais(){
        //isso é um comentario
        //imprimindo variavel idade do tipo inteiro que deve ser um inteiro qualquer
        int idade = 20;
        System.out.println("Idade: " + idade);
    }

    @Test
    public void exemploCalculoAreaQuadrado(){
        int ladoA = 2;
        int ladoB = 3;
        int areaQuadrado = ladoA * ladoB;

        System.out.println("Area de quadrado: " + areaQuadrado);
    }

    @Test
    public void exemploCalculoAreaCirculo(){
        double raio = 1.4;
        double pi = 3.14;
        double areaCirculo = pi * raio;
        System.out.println("Area de circulo: " + areaCirculo);
    }

    @Test
    public void outrasVariaveis(){
        boolean informacao = true;
        System.out.println(informacao);

        boolean umEMaiorQueZero = 1>0;
        System.out.println(umEMaiorQueZero);

        boolean umEMenorQueZero = 1<0;
        System.out.println(umEMenorQueZero);
    }

    @Test
    public void copiaValoresEntreVariaveisPrimitivas(){
        int i = 2;
        int j = i;
        System.out.println(i);
        System.out.println(j);
    }

    @Test
    public void castingDeTiposPrimitivos(){
        double d = 3.14;
        int meuInteiro = (int) d;
        System.out.println("Valor double: "+d);
        System.out.println("Valor em inteiro:" + meuInteiro);
    }
}
