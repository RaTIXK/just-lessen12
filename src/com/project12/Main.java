package com.project12;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(AnymalType.DOMESTIC, 20, 6, Gender.MALE),
                new Cat(AnymalType.DOMESTIC, 15, 5, Gender.FEMALE),
        };

        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.eat("grass"));
            System.out.println(animal.makeSound());
        }
    }

         
}