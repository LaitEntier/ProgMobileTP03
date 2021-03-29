package com.example.tp03;

import android.util.Log;

import java.util.ArrayList;

public class Data {
    private ArrayList<Planet> planetes;

    private Planet mercure = new Planet("Mercure", "4900");
    private Planet venus = new Planet("Venus", "12000");
    private Planet terre = new Planet("Terre", "12800");
    private Planet mars = new Planet("Mars", "6800");
    private Planet jupiter = new Planet("Jupiter", "144000");
    private Planet saturne = new Planet("Saturne", "4900");
    private Planet uranus = new Planet("Uranus", "120000");
    private Planet neptune = new Planet("Neptune", "50000");
    private Planet pluton = new Planet("Pluton", "2300");

    public Data() {
        this.planetes = new ArrayList<>();
    }

    public ArrayList<Planet> getPlanetes() {
        planetes.add(mercure);
        planetes.add(venus);
        planetes.add(terre);
        planetes.add(mars);
        planetes.add(jupiter);
        planetes.add(saturne);
        planetes.add(uranus);
        planetes.add(neptune);
        planetes.add(pluton);
        return planetes;
    }

    public String[] getTaillePlanetes() {
        String[] taillePlanetes = new String[19];
        for(int i=0;i<planetes.size();i++) {
            taillePlanetes[i] = planetes.get(i).getTaille();
        }
        return taillePlanetes;
    }

}
