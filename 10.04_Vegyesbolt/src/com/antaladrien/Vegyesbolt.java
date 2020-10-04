package com.antaladrien;

import java.io.*;
import java.util.ArrayList;

public class Vegyesbolt {

    public static ArrayList<Termek> lista = new ArrayList<>();

    public static void bevasarlok(String path) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        while (line != null) {
            String[] szavak = line.split(";");
            if (szavak[0].equals("salata")) {
                Salata a = new Salata(Integer.parseInt(szavak[1]), Integer.parseInt(szavak[2]));
                lista.add(a);
            } else if (szavak[0].equals("paradicsom")) {
                RohadtParadicsom a = new RohadtParadicsom(Double.parseDouble(szavak[2]), Integer.parseInt(szavak[1]));
                lista.add(a);
            } else {
                System.out.println("Rossz sor");
            }
            line = br.readLine();
        }
        br.close();
    }

    public static void mivanakosaramban() {
        for (Object o:lista) {
            if (o instanceof RohadtParadicsom) {
                System.out.println(((RohadtParadicsom) o).toString() + " az akciós ára: " + ((RohadtParadicsom) o).akciosAr());
            } else {
                System.out.println(((Salata) o).toString());
            }
        }
    }

    public static void main(String[] args) {
        try {
            bevasarlok("input.txt");
            mivanakosaramban();
        } catch (Exception ex) {
            System.out.println("Hiba történt");
        }
    }
}
