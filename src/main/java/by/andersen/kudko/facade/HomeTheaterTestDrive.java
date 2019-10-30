package by.andersen.kudko.facade;

import by.andersen.kudko.facade.equipment.*;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd= new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        Popcorn poppeer = new Popcorn();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                amp, tuner, dvd, cd, projector, lights, screen,
                poppeer);
        homeTheater.watckMovie("Raiders of the lost Ark");


    }
}
