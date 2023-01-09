package com.example.gelismiskomutlarunite5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ss_169_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_169_layout);
        EditText txt1 = findViewById(R.id.ss_txt1);
        EditText txt2 = findViewById(R.id.ss_txt2);
        Button toplabtn = findViewById(R.id.ss_topla);
        Button cikarbtn = findViewById(R.id.ss_cikar);
        Button carpbtn = findViewById(R.id.ss_carp);
        Button bolbtn = findViewById(R.id.ss_bol);
        toplabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ss_169_Activity.this, "Sayıların Toplamı = " + topla(txt1,txt2), Toast.LENGTH_SHORT).show();
            }
        });
        cikarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ss_169_Activity.this, "Sayıların Çıkarımı = " + cikar(txt1,txt2), Toast.LENGTH_SHORT).show();
            }
        });
        carpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ss_169_Activity.this, "Sayıların Çarpımı = " + carp(txt1,txt2), Toast.LENGTH_SHORT).show();
            }
        });
        bolbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ss_169_Activity.this, "Sayıların Bölümü = " + bol(txt1,txt2), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public int topla(EditText txt1, EditText txt2)
    {
        return Integer.parseInt(txt1.getText().toString()) + Integer.parseInt(txt2.getText().toString());
    }
    public int cikar(EditText txt1, EditText txt2)
    {
        return Integer.parseInt(txt1.getText().toString()) - Integer.parseInt(txt2.getText().toString());
    }
    public int carp(EditText txt1, EditText txt2)
    {
        return Integer.parseInt(txt1.getText().toString()) * Integer.parseInt(txt2.getText().toString());
    }
    public int bol(EditText txt1, EditText txt2)
    {
        return Integer.parseInt(txt1.getText().toString()) / Integer.parseInt(txt2.getText().toString());
    }
}