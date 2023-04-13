package com.project12;

public class Dog extends  Animal{
    public Dog(AnymalType type, double wheight, int age, Gender gender) {
        super(type, wheight, age, gender);
    }


    @Override
    public String eat(String food) {
        return "Dog eating " + food + " :";
    }

    @Override
    public String makeSound() {
        return "Wuf Wuf";
    }
}
