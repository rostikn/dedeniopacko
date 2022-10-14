package com.company;

public class Main {

    public static void main(String[] args) {
       /* Animal myAnimal = new Animal("David", 9, "blue" );
        System.out.println(myAnimal);

        Man myMan = new Man("Petr", 5, 99);
        myMan.eat();
        myMan.driving();
        myMan.driving("bus");*/
        Animal a = new Animal("a", 1, "cervena");
        Man b = new Man ("Petr", 5, 38);
        Woman c = new Woman("Denisa", 8, 12);
        c.goPee();
        b.goPee();
    }
}
