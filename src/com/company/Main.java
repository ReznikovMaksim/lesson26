package com.company;

public class Main {

    public static void main(String[] args) {
	    Bicycle peugeot = new Bicycle("Peugeot",120,40);
        Bicycle.Seat seat = peugeot.new Seat();

        seat.showInfo();
    }

}
