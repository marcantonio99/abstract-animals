package org.lessons.java.ex1e2;

public class Passerotto extends Animale implements Volante{

    @Override
    public void dormi() {
        super.dormi();
    }

    public void verso() {
        System.out.println("Cip!");
    }
    public void mangia(){
        System.out.println("Sto mangiando frutta");
    }
    public void vola() {
        System.out.println("Volo");
    }
}
