package org.lessons.java.ex1e2;

public class Cane extends Animale {
    @Override
    public void dormi() {
        System.out.println("zzZ");
    }

    public void verso(){
        System.out.println("WWooff!");
    }

    public void mangia(){
        System.out.println("Sto mangiando croccantini");
    }
}
