package com.example.finallogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CursorAdapter;
import android.widget.GridView;

public class Sylhet_places extends AppCompatActivity {
    private GridView gridView;
    String[] sylhet;
    int[] flags={R.drawable.bichanakandi,R.drawable.jaflong,R.drawable.ratargul};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet_places);
        gridView=(GridView)findViewById(R.id.gridview);
        sylhet=getResources().getStringArray(R.array.Sylhet);
        CustomAdapter customAdapter=new CustomAdapter(this, flags, sylhet);
        gridView.setAdapter(customAdapter);
    }
}
