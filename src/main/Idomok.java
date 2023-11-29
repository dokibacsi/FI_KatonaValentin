package main;

import idomok.Idom;
import java.util.ArrayList;
import java.util.List;

public class Idomok {

    private List<Idom> idomList;

    public Idomok() {
        idomList = new ArrayList<>();
    }

    public double osszSuly() {
        double oSuly = 0;
        for (Idom idom : idomList) {
            oSuly += idom.suly();
        }
        return oSuly;
    }

    public double osszGombSuly() {
        double oGSuly = 0;
        for (Idom idom : idomList) {
            if (idom instanceof idomok.Gomb) {
                oGSuly += idom.suly();
            }
        }
        return oGSuly;
    }
    

    public Idom minTerfogat() {

    }

    public Idom maxTerfogat() {

    }

    public void run() {

    }

}
