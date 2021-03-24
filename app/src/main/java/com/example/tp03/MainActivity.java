package com.example.tp03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    PlanetAdapter adapter;
    Button checkBtn;
    Spinner spinner;

    Data data = new Data();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listView);

        data = new Data();
        adapter = new PlanetAdapter(this, data);
        listview.setAdapter(adapter);

        checkBtn = findViewById(R.id.button);
        checkBtn.setEnabled(false);

        checkBtn.setOnClickListener((view) -> {
        int score = 0;
        String[] taillesPlanetes = data.getTaillePlanetes();
        for(int i=0; i<taillesPlanetes.length; i++) {
            View vw = listview.getChildAt(i);
            spinner = vw.findViewById(R.id.spinner);
            if(spinner.getSelectedItem().toString().equals(taillesPlanetes[i])) {
                score+=1;
            }
        }
        Toast.makeText(MainActivity.this, "Score : "+score+"/"+taillesPlanetes.length, Toast.LENGTH_LONG).show();
        });
    }
}