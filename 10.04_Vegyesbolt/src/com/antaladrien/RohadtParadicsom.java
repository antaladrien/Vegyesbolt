package com.antaladrien;

public class RohadtParadicsom extends Termek implements Akciozhato {
    private double tomeg;

    public RohadtParadicsom(double tomeg, int egysegar) {
        super("rohadt paradicsom", egysegar);
        this.tomeg = tomeg;
    }

    @Override
    public int akciosAr() {
        return (int)Math.round(mennyibeKerül() * 0.8);
    }

    @Override
    public int mennyibeKerül() {
        return (int)Math.round(this.tomeg * this.egysegar);
    }

    @Override
    public String toString() {
        return this.tomeg + " kg " + super.toString();
    }
}
