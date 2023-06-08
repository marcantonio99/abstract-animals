package org.lessons.java.ex1e2;

public class Passerotto extends Animale implements Volante{

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

    @Override
    public void vola() {
        System.out.println("Volo");
    }
}
