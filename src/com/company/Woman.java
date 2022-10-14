package com.company;

public class Woman extends Human{


    public Woman(String name, int age, int iq) {
        super(name, age, iq);
    }

    @Override
    public void goPee() {
        System.out.println("Curam v sede");
    }

    public void eat(){
        System.out.printf("chroncht chroncht");
    }
}
