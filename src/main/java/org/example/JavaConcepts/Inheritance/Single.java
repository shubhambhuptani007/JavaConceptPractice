package org.example.JavaConcepts.Inheritance;

public class Single {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.animalSound();
        dog.animalSound();
    }
}
class Dog extends Animal{
    @Override
    void animalSound() {
        System.out.println("Dog barks");
    }
}
class Animal{
    void animalSound(){
        System.out.println("Animal makes sound");
    }
}
