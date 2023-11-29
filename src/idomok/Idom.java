package idomok;
public abstract class Idom {
    
    private final double fajSuly = 0.8;

    public abstract double terfogat();
    
    public double suly(){
        return terfogat() * fajSuly;
    }
    
    
    
    
    
}
