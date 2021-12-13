package com.company;

public class Duck extends Animal implements Swimmable,Edible,Flyable{
    @Override
    void makeSound() {
        System.out.println("кря");
    }

    @Override
    public boolean isEdible() {
        System.out.println("Вкусно!");
        return true;
    }

    @Override
    public void fly() {
        System.out.println("лечу!");
    }

    @Override
    public void swim() {
        System.out.println("плыву!");
    }
}
