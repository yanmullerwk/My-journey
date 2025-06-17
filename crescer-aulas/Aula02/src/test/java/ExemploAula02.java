import org.junit.Assert;
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
        final double PI = 3.14;
        double areaCirculo = PI * raio;
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
    //aula 3 - operadores aritmeticos
    @Test
    public void operadoresAritimeticos(){
        int a = 5;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(b / a);
        System.out.println("modulo:"+ b%a);
    }

    // aula 4 - testes unitarios
    //Boas praticas escrita de nome teste deveFazerAlgumaCoisaQuando()
    @Test
    public void soma(){
        //test TripleA -> (Arrange, Act, Assert)

        //arrange
        int a = 10;
        int b = 20;
        int resultadoEsperado = 30;

        //act
        int soma = a + b;

        //assert
        Assert.assertEquals(resultadoEsperado, soma);
    }

    //
    @Test
    public void delta(){
        double valorA = 1.5;
        double valorB = 2;
        double resultadoEsperado = 3.5;

        double soma = valorA + valorB;

        Assert.assertEquals(resultadoEsperado, soma, 0);
    }
    @Test
    public void testeDelta(){
        double valorA = 3.1415;
        double valorComparar = 3.14;


        Assert.assertEquals(valorA, valorComparar, 0.01);
    }

    //aula 5 - operadores logicos
    @Test
    public void tabelaVerdadeOperadoresLogicos(){
        // Operador lógico E (AND) - &&
        System.out.println("Operador AND (&&):");
        System.out.println("true && true = " + (true && true));   // true
        System.out.println("true && false = " + (true && false)); // false
        System.out.println("false && true = " + (false && true)); // false
        System.out.println("false && false = " + (false && false)); // false

        System.out.println();

        // Operador lógico OU (OR) - ||
        System.out.println("Operador OR (||):");
        System.out.println("true || true = " + (true || true));   // true
        System.out.println("true || false = " + (true || false)); // true
        System.out.println("false || true = " + (false || true)); // true
        System.out.println("false || false = " + (false || false)); // false

        System.out.println();

        // Operador lógico NÃO (NOT) - !
        System.out.println("Operador NOT (!):");
        System.out.println("!true = " + (!true));   // false
        System.out.println("!false = " + (!false));//true

        // Operador lógico XOR (^) - ou exclusivo
        System.out.println("Operador XOR (^):");
        System.out.println("true ^ true = " + (true ^ true));     // false
        System.out.println("true ^ false = " + (true ^ false));   // true
        System.out.println("false ^ true = " + (false ^ true));   // true
        System.out.println("false ^ false = " + (false ^ false)); // false
    }

    //aula 6 - operadores relacionais
    @Test
    public void operadoresRelacionais(){
        System.out.println("3 menor que 5: "+(3<5));//true
        System.out.println("3 maior que 5: "+(3>5));//false
        System.out.println("3 igual a 5: "+(3==5));//false
        System.out.println("3 diferente 5: "+(3!=5));//true

        // === compara tipo e resultado
        //<=, >=; outros comparadores logicos, incluen o referencial
    }

}
