package com.company.Interfaces;

public class Audi implements Engine, SpeedSpecs{

    @Override
    public void type() {
        System.out.println("It is a V10");
    }

    @Override
    public void capacity() {
        System.out.println("5.2L");
    }

    @Override
    public void bhp() {
        System.out.println("620 horsepower");
    }

    @Override
    public void topSpeed() {
        System.out.println("205 miles per hour");
    }

    @Override
    public void zeroToSixty() {
        System.out.println("3secs");
    }
}
