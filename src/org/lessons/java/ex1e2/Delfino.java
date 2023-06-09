package org.lessons.java.ex1e2;

public class Delfino extends Animale implements Nuotante{
    @Override
    public void verso() {
        System.out.println("fischio!");
    }
    @Override
    public void mangia(){
        System.out.println("Sto mangiando pesce");
    }
    @Override
    public void nuota() {
        System.out.println("Nuoto");
    }
}
