public class Jutsu {
    private final int consumoChakra;
    private final int dano;

    public Jutsu(int consumoChakra, int dano){
        if(consumoChakra<0){
            consumoChakra=0;
        }
        if(dano<0){
            dano=0;
        }
        if(consumoChakra>5){
            consumoChakra=5;
        }
        if(dano>10){
            dano=10;
        }
        this.consumoChakra = consumoChakra;
        this.dano = dano;
    }

    public int getConsumoChakra(){
        return this.consumoChakra;
    }
    public int getDano(){
        return this.dano;
    }

}
