package org.lessons.java.ex1;

public class Passerotto extends Animale{

    @Override
    public void dormi() {
        System.out.println("zzZ");
    }

    @Override
    public void verso() {
        System.out.println("Cip!");
    }
    public void mangia(){
        System.out.println("Sto mangiando frutta");
    }
}
