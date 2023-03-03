package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Type;

public class Uyg9Activity extends AppCompatActivity {
    Button KareHesapla,DikdortgenHesapla;
    EditText sayi;
    TextView text;
    private void tanimlamalar() {
        KareHesapla = findViewById(R.id.uyg9KareHesaplaBtn);
        DikdortgenHesapla = findViewById(R.id.uyg9DikdortgenHesapla);
        sayi = findViewById(R.id.uyg9SayiTxt);
        text = findViewById(R.id.uyg9SonucLbl);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);
        tanimlamalar();
    }

    public void kare(View view){
        int sayimiz = Integer.parseInt(sayi.getText().toString());
        uyg9Kare kare2 = new uyg9Kare(sayimiz);
        text.setText("Sonuç: "+kare2.Sonuc());
    }
    public void dortgen(View view){
        int sayimiz = Integer.parseInt(sayi.getText().toString());
        uyg9Dikdortgen dort2 = new uyg9Dikdortgen(sayimiz);
        text.setText("Sonuç: "+dort2.Sonuc());
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg9Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
