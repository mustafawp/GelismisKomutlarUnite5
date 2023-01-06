package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);
    }
    public void btnClicks1(View view)
    {
        mesajgonder("Buton 1 e tıklandı.");
    }
    public void btnClicks2(View view) { mesajgonder("Buton 2 e tıklandı."); }
    public void mesajgonder(String gonderilcek){ Toast.makeText(this, gonderilcek, Toast.LENGTH_SHORT).show(); }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg1Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
