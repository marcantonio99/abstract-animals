package org.lessons.java.ex1e2;

public class Aquila extends Animale implements Volante{

    @Override
    public void dormi() {
        super.dormi();
    }
    public void verso() {
        System.out.println("Keee-yah!");
    }
    public void mangia(){
        System.out.println("Sto mangiando carne");
    }
    public void vola() {
        System.out.println("Volo");
    }
}
