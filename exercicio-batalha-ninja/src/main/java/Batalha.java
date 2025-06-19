public class Batalha {
    public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja){
        primeiroNinja.atacar(segundoNinja);
        primeiroNinja.atacar(segundoNinja);
        primeiroNinja.atacar(segundoNinja);
        segundoNinja.atacar(primeiroNinja);
        segundoNinja.atacar(primeiroNinja);
        segundoNinja.atacar(primeiroNinja);

        if(primeiroNinja.getNome().equals("Itachi")){
            System.out.println("Vencedor por ser o ninja mais top, ninja numero 1: "+primeiroNinja.getNome());
            return primeiroNinja;
        }
        if(segundoNinja.getNome().equals("Itachi")){
            System.out.println("Vencedor por ser o ninja mais top, ninja numero 2: "+segundoNinja.getNome());
            return segundoNinja;
        }

        int chakra1 = primeiroNinja.getChakra();
        int chakra2 = segundoNinja.getChakra();

        if(chakra1>=chakra2){
            System.out.println("Vencedor ninja numero 1: "+primeiroNinja.getNome());
            return primeiroNinja;
        }else {
            System.out.println("Vencedor ninja numero 2: "+segundoNinja.getNome());
            return segundoNinja;
        }

    }

}
