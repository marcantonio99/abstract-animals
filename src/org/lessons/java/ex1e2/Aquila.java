package org.lessons.java.ex1e2;

public class Aquila extends Animale implements Volante{
    @Override
    public void verso() {
        System.out.println("Keee-yah!");
    }
    @Override
    public void mangia(){
        System.out.println("Sto mangiando carne");
    }
    public void vola() {
        System.out.println("Volo");
    }
}
