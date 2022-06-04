package com.example.toastandalert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater= getLayoutInflater();
                View mylayout=inflater.inflate(R.layout.customtoastlayout,null);
                ImageView i=mylayout.findViewById(R.id.cam);
                TextView tv=mylayout.findViewById(R.id.camtext);

                Toast t= new Toast(getApplicationContext());
                t.setDuration(Toast.LENGTH_LONG);
                t.setView(mylayout);
                t.setGravity(Gravity.CENTER|Gravity.LEFT,-100,0);   
                t.show();
            }
        });
    }
}