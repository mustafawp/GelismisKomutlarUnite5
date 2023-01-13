package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg4Activity.this, MainActivity.class);
        startActivity(uyg);
    }

    public void ikiToplaBtn(View view){
        EditText txt1 = findViewById(R.id.uyg4_txt1);
        EditText txt2 = findViewById(R.id.uyg4_txt2);
        Toast.makeText(this, "2 ile toplamı Sonucu = " + topla(txt1,txt2), Toast.LENGTH_SHORT).show();
    }
    public void ucToplaBtn(View view){
        EditText txt1 = findViewById(R.id.uyg4_txt1);
        EditText txt2 = findViewById(R.id.uyg4_txt2);
        EditText txt3 = findViewById(R.id.uyg4_txt3);
        Toast.makeText(this, "3 ile toplamı Sonucu = " + topla(txt1,txt2,txt3), Toast.LENGTH_SHORT).show();
    }
    public int topla(EditText txt1, EditText txt2){
        return Integer.parseInt(txt1.getText().toString()) + Integer.parseInt(txt2.getText().toString());
    }
    public int topla(EditText txt1, EditText txt2, EditText txt3){
        return Integer.parseInt(txt1.getText().toString()) + Integer.parseInt(txt2.getText().toString()) + Integer.parseInt(txt3.getText().toString());
    }

}
