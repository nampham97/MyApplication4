package com.example.eunra.myapplication;

public class Twoso {
    private int soa, sob;

    @Override
    public String toString() {
        return "Twoso{" +
                "soa=" + soa +
                ", sob=" + sob +
                '}';
    }

    public Twoso(int soa, int sob) {
        this.soa = soa;
        this.sob = sob;
    }

    public int getSoa() {
        return soa;
    }

    public void setSoa(int soa) {
        this.soa = soa;
    }

    public int getSob() {
        return sob;
    }

    public void setSob(int sob) {
        this.sob = sob;
    }
}
