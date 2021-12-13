package com.company;

public class Bicycle {
    private String model;
    private int weight;
    private int seatPostDiameter;
    private SteeringWheel wheel;

    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }


    public void start(){
        System.out.println("Поехали!");
    }

    private class SteeringWheel{
        public void right(){
            System.out.println("Руль вправо!");
        }
        public void left(){
            System.out.println("Руль влево!");
        }
    }
    public class Seat{
        public void showInfo(){
            System.out.println("диаметр подсидельного штыря - " + seatPostDiameter);
        }
        public void up(){
            System.out.println("сидение поднялось");
        }
        public void down(){
            System.out.println("сидение опустилось");
        }
    }
}
