package com.example.observer.instance;

import com.example.observer.Beobachter;
import com.example.observer.Subjekt;

public class TemperaturAnzeige implements Beobachter {

    @Override
    public void aktualisieren(Subjekt subjekt) {
        System.out.println(subjekt.gibZustand());
    }
}

// registriereBeobachter
// aktualisiereBeobachter
// entferneBeobachter
/*
Zeichnen sie das BeobachterMuster in UML da müssen auch die Methoden
rein zeichnen also registriere, aktualisiere, entferne..
 */
