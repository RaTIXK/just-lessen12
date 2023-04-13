package com.project12;

public class Cat extends Animal {
    public Cat(AnymalType type, double wheight, int age, Gender gender) {
        super(type, wheight, age, gender);
    }

    @Override
    public String eat(String food) {
        return "Cat eating " + food + " :3";
    }

    @Override
    public String makeSound() {
        return "meau :3";
    }
}
