package com.company;

public interface Engine {
    int getMaxRpm();
    int getTorque();

    static int getHorsePower(Engine engine){
        return (engine.getMaxRpm() * engine.getTorque()) / 5252;
    }
}
