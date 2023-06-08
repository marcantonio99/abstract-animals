package org.lessons.java.ex1e2;

public class Main {
    public static void main(String[] args) {
        Cane cane = new Cane();
        cane.dormi();
        cane.verso();
        cane.mangia();

        Passerotto passerotto = new Passerotto();
        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();
        faiVolare(passerotto);

        Aquila aquila = new Aquila();
        aquila.dormi();
        aquila.verso();
        aquila.mangia();
        faiVolare(aquila);

        Delfino delfino = new Delfino();
        delfino.dormi();
        delfino.verso();
        delfino.mangia();
        faiNuotare(delfino);
    }

    static void faiVolare(Volante animale){
        animale.vola();
    }
    static void faiNuotare(Nuotante animale){
        animale.nuota();
    }
}
