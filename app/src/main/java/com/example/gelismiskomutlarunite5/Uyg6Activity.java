package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
    EditText Uzunluk,Genislik;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);
        Uzunluk = findViewById(R.id.uyg6Uzunluk);
        Genislik = findViewById(R.id.uyg6Genislik);
    }

    public void uyg6KareClick(View view){
        Log.e("İmdat","geliyo 1");
        int a = Integer.parseInt(Uzunluk.getText().toString());
        Log.e("İmdat","geliyo s");
        if (Genislik.getText().toString() == "") {
            Log.e("İmdat","geliyo 2");
            Uyg6Hesaplamalar hesapla = new Uyg6Hesaplamalar(a);
            Log.e("İmdat","geliyo 3");
            int sa = hesapla.sonuc;
            Log.e("İmdat","geliyo 4");
            Toast.makeText(this, "Sonuç "+sa, Toast.LENGTH_LONG).show();
        }
        else {
            int b = Integer.parseInt(Genislik.getText().toString());
            Uyg6Hesaplamalar hesapla = new Uyg6Hesaplamalar(a,b);
            int sa = hesapla.sonuc;
            Toast.makeText(this, "Sonuç "+sa, Toast.LENGTH_LONG).show();
        }
    }
    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg6Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
