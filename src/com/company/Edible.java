package com.company;

public interface Edible {
    boolean isEdible();
    default boolean isFresh(){
        if(checkFresh(30)){
            return false;
        }
        return true;
    }

    private boolean checkFresh(int days){
        if(days > 30){
            return false;
        }else {
            return true;
        }
    }
}
