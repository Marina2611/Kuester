package com.example.observer.instance;

import com.example.observer.Beobachter;
import com.example.observer.Subjekt;

import java.util.ArrayList;
import java.util.Collection;

public class TemperaturFuehler implements Subjekt {
    private Collection<Beobachter> beobachterCollection = new ArrayList<>();

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
        for (Beobachter b : beobachterCollection
        ) {
            b.aktualisieren(this);
        }
    }

    private int temperatur;

    @Override
    public void registriereBeobachter(Beobachter b) {
        beobachterCollection.add(b);
    }

    @Override
    public void entferneBeobachter(Beobachter b) {
        beobachterCollection.remove(b);
    }


    @Override
    public String gibZustand() {
        return temperatur + "";
    }
}
