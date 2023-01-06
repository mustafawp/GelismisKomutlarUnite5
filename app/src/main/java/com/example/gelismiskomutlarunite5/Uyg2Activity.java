package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_activity);
        Button btn = findViewById(R.id.uyg2_toplabtn);
        EditText sayi1 = findViewById(R.id.uyg2_txtSayi1);
        EditText sayi2 = findViewById(R.id.uyg2_txtSayi2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Sonuç = " + toplamaislemi(sayi1,sayi2), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public int toplamaislemi(EditText sayi1, EditText sayi2) {
        return Integer.parseInt(sayi1.getText().toString()) + Integer.parseInt(sayi2.getText().toString()); }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg2Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
