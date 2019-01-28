package com.example.tugaslogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tugaslogin.R;

public class Login extends AppCompatActivity implements View.OnClickListener{
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnGo = findViewById(R.id.btnGo);
        btnGo.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGo:
                startActivity(new Intent(this,Singup.class));
                break;

        }

    }
}

