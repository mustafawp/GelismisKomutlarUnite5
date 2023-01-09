package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);
        EditText txt1 = findViewById(R.id.uyg3_txt1);
        EditText txt2 = findViewById(R.id.uyg3_txt2);
        TextView goster = findViewById(R.id.uyg3_sonucview);
        Button btn = findViewById(R.id.uyg3_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goster.setText("Sonuç = " + sayilaritopla(txt1,txt2));
            }
        });
    }

    public int sayilaritopla(EditText txt1, EditText txt2)
    {
        return Integer.parseInt(txt1.getText().toString()) + Integer.parseInt(txt2.getText().toString());
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg3Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
