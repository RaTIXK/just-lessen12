package com.project12;

import java.util.Objects;

public abstract class Animal {
    protected  AnymalType type;
    protected  double wheight;
    protected int age;
    protected  Gender gender;

    public Animal(AnymalType type, double wheight, int age, Gender gender) {
        this.type = type;
        this.wheight = wheight;
        this.age = age;
        this.gender = gender;
    }

    public  abstract String eat(String food);
    public  abstract String makeSound();
    public AnymalType getType() {
        return type;
    }

    public void setType(AnymalType type) {
        this.type = type;
    }

    public double getWheight() {
        return wheight;
    }

    public void setWheight(double wheight) {
        this.wheight = wheight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.wheight, wheight) == 0 && age == animal.age && Objects.equals(type, animal.type) && Objects.equals(gender, animal.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, wheight, age, gender);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type=" + type +
                ", wheight=" + wheight +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
