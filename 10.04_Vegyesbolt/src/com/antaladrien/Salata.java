package com.antaladrien;

public class Salata extends Termek {
    private  int vettdb;

    public Salata(int vettdb, int egysegar) {
        super("salata", egysegar);
        this.vettdb = vettdb;
    }

    @Override
    public int mennyibeKerül() {
        return this.vettdb * this.egysegar;
    }

    public int getVettdb() {
        return vettdb;
    }

    public void setVettdb(int vettdb) {
        this.vettdb = vettdb;
    }

    @Override
    public String toString() {
        return this.vettdb + " db " + super.toString();
    }
}
