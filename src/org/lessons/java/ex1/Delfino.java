package org.lessons.java.ex1;

public class Delfino extends Animale {
    @Override
    public void dormi() {
        System.out.println("zzZ");
    }

    @Override
    public void verso() {
        System.out.println("fischio!");
    }
    public void mangia(){
        System.out.println("Sto mangiando pesce");
    }
}
