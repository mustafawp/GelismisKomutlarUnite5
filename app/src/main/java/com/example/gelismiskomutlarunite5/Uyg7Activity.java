package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7Activity extends AppCompatActivity {
    EditText txt;
    TextView label;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_activity);
        txt = findViewById(R.id.uyg7YasTxt);
        label = findViewById(R.id.uyg7SonucLbl);
    }
    public void btnSonuc(View view){
        int sa = Integer.parseInt(txt.getText().toString());
        Uyg7Kontrol yas = new Uyg7Kontrol();
        yas.setYas(sa);
        label.setText("Yaşın = "+Integer.toString(yas.getYas()));
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg7Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
