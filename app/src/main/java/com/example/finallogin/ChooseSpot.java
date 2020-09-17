package com.example.finallogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseSpot extends AppCompatActivity {
    private Button dhaka;
    private Button chittagong;
    private Button sylhet;
    private Button khulna;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_spot);
        dhaka=findViewById(R.id.dhaka);
        khulna=findViewById(R.id.khulna);
        chittagong=findViewById(R.id.chittagong);
        sylhet=findViewById(R.id.sylhet);
        sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ChooseSpot.this,Sylhet_places.class);
                startActivity(intent);
            }
        });

    }
}
