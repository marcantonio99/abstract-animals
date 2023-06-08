package org.lessons.java.ex1e2;

public class Delfino extends Animale implements Nuotante{
    @Override
    public void dormi() {
        super.dormi();
    }
    public void verso() {
        System.out.println("fischio!");
    }
    public void mangia(){
        System.out.println("Sto mangiando pesce");
    }
    public void nuota() {
        System.out.println("Nuoto");
    }
}
