package com.example.tp03;

import android.util.Log;

import java.util.ArrayList;

public class Data {
    private ArrayList<Planet> planetes;


    public Data() {
        this.planetes = new ArrayList<>();
    }

    public ArrayList<Planet> getPlanetes() {

        Planet mercure = new Planet("Mercure", new String("4900"));
        Planet venus = new Planet("Venus", "12000");
        Planet terre = new Planet("Terre", "12800");
        Planet mars = new Planet("Mars", "6800");
        Planet jupiter = new Planet("Jupiter", "144000");
        Planet saturne = new Planet("Saturne", "4900");
        Planet uranus = new Planet("Uranus", "120000");
        Planet neptune = new Planet("Neptune", "50000");
        Planet pluton = new Planet("Pluton", "2300");


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
        String[] taillePlanetes = new String[planetes.size()];
        for (int i = 0; i < planetes.size(); i++) {
            taillePlanetes[i] = planetes.get(i).getTaille();

        }
        return taillePlanetes;
    }

}
