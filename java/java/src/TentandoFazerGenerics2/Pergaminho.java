package TentandoFazerGenerics2;

public class Pergaminho implements Usavel{

    private String jutsu;
    private int gastoChakra;

    public Pergaminho(){}
    public Pergaminho(String justu , int gastoChakra){
        this.jutsu = justu;
        this.gastoChakra = gastoChakra;

    }

    public String getJutsu(){
        return jutsu;
    }
    public void setJutsu(String jutsu){
        this.jutsu = jutsu;
    }

    public int getGastoChakra(){
        return gastoChakra;
    }
    public void setGastoChakra(int gastoChakra){
        this.gastoChakra = gastoChakra;
    }

    @Override
    public String toString()
    {
        return "Pergaminho : " + jutsu + " - Gasto de Chskra: " + gastoChakra;
    }

    @Override
    public void usar(){
        System.out.println("Lendo pergaminho e ativando " + jutsu);
    }
}
