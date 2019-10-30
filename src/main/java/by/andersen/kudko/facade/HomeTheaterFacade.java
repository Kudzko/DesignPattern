package by.andersen.kudko.facade;

import by.andersen.kudko.facade.equipment.*;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    Popcorn popcorn;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner,
                             DvdPlayer dvd, CdPlayer cd,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             Popcorn popcorn) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popcorn = popcorn;
    }

    public  void watckMovie(String movie){
        System.out.println("Get ready to watch movie...");
        popcorn.on();
        popcorn.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);

    }
    // Another methods
}
