package com.j2.w11;

public class HomeTheaterTestDriver {
  public static void main(String[] args) {
    Amplifier amp = new Amplifier("MY AMP");
    Tuner tuner = new Tuner("MY TUNER", amp);
    DvdPlayer dvd = new DvdPlayer("MY DVD Player");
    Projector projector = new Projector("MY PROJECTOR");
      
    HTFacade ht = new HTFacade(amp, tuner, dvd, projector);
    ht.watchMovie("Avengers");
    ht.endMovie();
    ht.listenToRadio(112.3);
    ht.endRadio();
  }
}

