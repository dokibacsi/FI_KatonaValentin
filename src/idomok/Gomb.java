package idomok;
public class Gomb extends Idom{
    private int sugar;

    public Gomb(int sugar) {
        this.sugar = sugar;
    }
    
    @Override
    public double terfogat(){
        double terfogat;
        terfogat = (0.75) * Math.PI *(sugar * sugar * sugar);
        return terfogat;
    }

    @Override
    public String toString() {
        return "Gomb{" + "sugar=" + sugar + '}';
    }
    
    
    
}
