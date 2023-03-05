package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/podatki")

public class Podatki {

    enum Rodzaj {
        VAT(0.23f),
        DOCHODOWY(0.18f),
        BELKI(0.02f);

        float wartosc;

        Rodzaj(float wartosc) {
            this.wartosc = wartosc;
        }

        public float getWartosc() {
            return wartosc;
        }
    }

    // /podatki/policz?ilosc=700&rodzaj=VAT -> 700 * 0.23

    // /podatki?rodzaj=VAT -> 0.23f
    @GetMapping("/policz/{podatek}/{kwota}")
    public float policz(@PathVariable float Rodzaj, @PathVariable float kwota) {
        return Rodzaj * kwota;
    }
    @GetMapping("/nazwaPodatku/{podatek}")
    public float nazwaPodatku(@PathVariable float Rodzaj) {
        return Rodzaj;
    }

}
