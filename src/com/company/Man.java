package com.company;

public class Man extends Human{
    public Man(String name, int age, int iq) {
        super(name, age, iq);
    }

    @Override
    public void goPee() {
        System.out.println("Curam ve stoje");
    }


    public void eat(){
        System.out.printf(" mnamek mnammm ");
    }

    public void driving(){
        System.out.printf(" is driving a car ");
    }

    public void driving(String vehicle){
        System.out.printf(" is driving a " + vehicle);
    }
}
