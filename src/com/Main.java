package com;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.eat();
        dog.eat();
        giveMePet(new Dog());
        giveMePet(new Cat());
    }
    public static void giveMePet(Animal a){
        if(a instanceof Cat){
            ((Cat) a).catchMouse();
        }
        if(a instanceof Dog){
            ((Dog) a).watchHouse();
        }
        a.eat();
    }
}
