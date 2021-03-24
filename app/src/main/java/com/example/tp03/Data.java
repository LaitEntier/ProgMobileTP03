package com.example.tp03;

import java.util.ArrayList;

public class Data {
    private ArrayList<String> planetes;

    private String[] taillePlanetes = {"4900", "12000", "12800", "6800", "144000", "120000", "52000", "50000", "2300"};
    public Data() {
        this.planetes = new ArrayList<>();
    }

    public ArrayList<String> getPlanetes() {
        planetes.add("Mercure");
        planetes.add("Venus");
        planetes.add("Terre");
        planetes.add("Mars");
        planetes.add("Jupiter");
        planetes.add("Saturne");
        planetes.add("Uranus");
        planetes.add("Neptune");
        planetes.add("Pluton");
        return planetes;
    }

    public String[] getTaillePlanetes() {
        return taillePlanetes;
    }

}
