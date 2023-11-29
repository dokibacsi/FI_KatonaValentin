package idomok;
public class Hasab extends Idom{
    
    private int magassag;
    private int a, b;
    
    public Hasab(int magassag, int a, int b) {
        this.magassag = magassag;
        this.a = a;
        this.b = b;
    }

    @Override
    public double terfogat() {
        double terfogat;
        terfogat = (a * b) * magassag;
        return terfogat;
    }

    @Override
    public String toString() {
        return "Hasab{" + "magassag=" + magassag + ", a=" + a + ", b=" + b + '}';
    }    
    
}
