package com.example.gelismiskomutlarunite5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ss_173_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_173_layout);
    }
    public void btnMerhaba1(View view)
    {
        EditText ad = findViewById(R.id.ss173_adtxt);
        Toast.makeText(this, "Merhaba " + adsoyad(ad), Toast.LENGTH_SHORT).show();
    }

    public void btnMerhaba2(View view)
    {
        EditText ad = findViewById(R.id.ss173_adtxt);
        EditText soyad = findViewById(R.id.ss173_soyadtxt);
        Toast.makeText(this, "İyi Günler, bay " + adsoyad(ad,soyad), Toast.LENGTH_SHORT).show();
    }

    public String adsoyad(EditText ad){
        return ad.getText().toString();
    }
    public String adsoyad(EditText ad, EditText soyad){
        return ad.getText().toString() + " " + soyad.getText().toString();
    }
}