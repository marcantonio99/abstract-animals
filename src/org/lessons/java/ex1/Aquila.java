package org.lessons.java.ex1;

public class Aquila extends Animale{

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
}
