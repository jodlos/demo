package com.example.demo.zadanie;

import java.util.List;

public class Profil {

    private int id;
    private String nazwa;
    private List<String> zainteresowania;
    private  boolean aktywny;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<String> getZainteresowania() {
        return zainteresowania;
    }

    public void setZainteresowania(List<String> zainteresowania) {
        this.zainteresowania = zainteresowania;
    }

    public boolean isAktywny() {
        return aktywny;
    }

    public void setAktywny(boolean aktywny) {
        this.aktywny = aktywny;
    }
}
