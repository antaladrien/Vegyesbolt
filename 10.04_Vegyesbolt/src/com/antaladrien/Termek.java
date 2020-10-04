package com.antaladrien;

public abstract class Termek {
    private String nev;
    protected int egysegar;

    public Termek(String nev, int egysegar) {
        this.nev = nev;
        this.egysegar = egysegar;
    }

    public abstract int mennyibeKerül();

    @Override
    public String toString() {
        return nev + " - " + mennyibeKerül() + " Ft";
    }
}
