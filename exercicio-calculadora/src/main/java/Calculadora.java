public class Calculadora {
    public int soma(int a, int b){
        return a+b;
    }

    public int subtrai(int a, int b){
        return a-b;
    }

    public int multiplica(int a, int b){
        return a*b;
    }

    public double divide(double a, double b){
        return a/b;
    }

    public double raiz(double a){
        return Math.sqrt(a);
    }

    public double potencia(double a, double b){
        return Math.pow(a,b);
    }

    public double bhaskara(double a, double b, double c){
        //-b +- raiz de b²-4ac/2*a
        double delta = (Math.pow(b, 2))-(4*a*c);
        double raizUm = ((-b)+delta)/(2*a);
        double raizDois = ((-b)-delta)/(2*a);

        System.out.println("raizUm: "+raizUm);
        System.out.println("raizDois: "+raizDois);

        return raizUm+raizDois;
    }
}
