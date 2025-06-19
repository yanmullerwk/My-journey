public class Ninja {
    private String nome;
    private int chakra;
    private final Jutsu jutsuPrincipal;

    public Ninja(String nome, Jutsu jutsuPrincipal) {
        this.nome = nome;
        this.chakra = 100;
        this.jutsuPrincipal = jutsuPrincipal;
    }

    public void atacar(Ninja ninja){
        ninja.receberGolpe(jutsuPrincipal.getDano());
        this.chakra -= this.jutsuPrincipal.getConsumoChakra();
    }

    public void receberGolpe(int dano){
        this.chakra -= dano;
    }

    public String getNome() {
        return nome;
    }

    public int getChakra() {
        return this.chakra;
    }

}
