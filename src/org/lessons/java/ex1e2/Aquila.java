package org.lessons.java.ex1e2;

public class Aquila extends Animale implements Volante{

    @Override
    public void dormi() {
        System.out.println("zzZ");
    }

    @Override
    public void verso() {
        System.out.println("Keee-yah!");
    }
    public void mangia(){
        System.out.println("Sto mangiando carne");
    }

    @Override
    public void vola() {
        System.out.println("Volo");
    }
}
