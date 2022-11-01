package com.example.observer.instance;

public class Main {
    public static void main(String[] args) {
        var beobachter = new TemperaturAnzeige();
        var subjekt = new TemperaturFuehler();
        subjekt.registriereBeobachter(beobachter);
        subjekt.setTemperatur(17);
        subjekt.entferneBeobachter(beobachter);
        subjekt.setTemperatur(19);
        /**
         * Wasn los?
         * ich habe ANgst
         * achsooooo. Aber stärker jetzt oder?
         * kickt jetzt
         * okay. Switched du bald?
         * kann sein
         * okiiii :D
         * nicht oki
         * kann ich dir denn irgendwie helfen?
         * tust du
         * ein biischen sanfter oki? <3
         * nein mach weiter. beruhigt mich auch
         *
         */
    }
}
