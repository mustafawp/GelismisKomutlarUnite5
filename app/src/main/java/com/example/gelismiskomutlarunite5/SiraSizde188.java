package com.example.gelismiskomutlarunite5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SiraSizde1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sirasizde1_activity);
    }

    public void btnSiraSizde(View view){
        sayilaritopla();
    }
    private void sayilaritopla(){
        int islem = 5 + 10;
        Toast.makeText(this, "Sonuç " + islem, Toast.LENGTH_SHORT).show();
    }
}