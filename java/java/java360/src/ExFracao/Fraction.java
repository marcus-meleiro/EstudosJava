package ExFracao;

public class Fraction {

    private int numerador;
    private int denominador;

    public Fraction(){}
    public Fraction(int numerador , int denominador)
    {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    Fraction multiplic ( Fraction newFraction)
    {
        Fraction f =  new Fraction();
        f.setNumerador(numerador * newFraction.getNumerador());
        f.setDenominador(denominador * newFraction.getDenominador());

        return f;
    }

    Fraction dividir (Fraction addFraction)
    {
        Fraction j = new Fraction();
        j.setNumerador(numerador * addFraction.getDenominador());
        j.setDenominador(denominador * addFraction.getNumerador());
        return j;
    }

    public void show(){
        System.out.println(numerador + " / " + denominador);
    }
}
