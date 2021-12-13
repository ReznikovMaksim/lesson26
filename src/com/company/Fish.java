package com.company;

public class Fish implements Swimmable, Edible{
    private int DateOfCreation;
    private int days;
    private int currentDate;
    @Override
    public void swim() {
        System.out.println("Плыву под водой!");
    }

    @Override
    public boolean isEdible() {
        return true;
    }

    @Override
    public boolean isFresh() {
        if(DateOfCreation + days < currentDate){
            return false;
        }else {
            return true;
        }
    }
}
