package com.example.tugaslogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tugaslogin.R;

public class Singup extends AppCompatActivity implements View.OnClickListener{
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        btnBack = findViewById(R.id.buttonback);
        btnBack.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonback:
                startActivity(new Intent(Singup.this,Login.class));
                break;
        }

    }
}

