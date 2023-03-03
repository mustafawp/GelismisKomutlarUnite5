package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {
    TextView text;
    Button AracKapiSayisi,AracMaksHizi,AracCalistir,AracIseGit,MinibusKapiSayisi,MinibusMaksHizi,MinibusCalistir,MinibusYolcuIndir;
    public void tanimlamalar(){
        AracKapiSayisi = findViewById(R.id.uyg8AracKapiSayisi);
        AracMaksHizi = findViewById(R.id.uyg8AracMaksHiz);
        AracCalistir = findViewById(R.id.uyg8AracCalistir);
        AracIseGit = findViewById(R.id.uyg8AracIseGit);
        MinibusKapiSayisi = findViewById(R.id.uyg8MinibusKapiSayisi);
        MinibusMaksHizi = findViewById(R.id.uyg8MinibusMaksHiz);
        MinibusCalistir = findViewById(R.id.uyg8MinibusCalistir);
        MinibusYolcuIndir = findViewById(R.id.uyg8MinibusYolcuIndir);
        text = findViewById(R.id.uyg8FaaliyetlerTw);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8_activity);
        tanimlamalar();
        AracKapiSayisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uyg8Araba arac = new uyg8Araba(120,5);
                int kapisayisi = arac.getKapiSayisi();
                text.setText("Kapı Sayısı = "+kapisayisi);
            }
        });
        AracMaksHizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uyg8Araba arac = new uyg8Araba(120,5);
                int hizi = arac.getMaksHiz();
                text.setText("Araba Hızı = "+hizi);
            }
        });
        AracCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uyg8Araba arac = new uyg8Araba(120,5);
                String calistrma = arac.araciCalistir();
                text.setText("Durum = "+calistrma);
            }
        });
        AracIseGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uyg8Araba arac = new uyg8Araba(120,5);
                String calistrma = arac.IseGit();
                text.setText("Durum = "+calistrma);
            }
        });
        MinibusKapiSayisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uyg8Minibus minibus = new uyg8Minibus(100,3);
                int kapisayisi = minibus.getKapiSayisi();
                text.setText("Kapı Sayısı = "+kapisayisi);
            }
        });
        MinibusMaksHizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uyg8Minibus minibus = new uyg8Minibus(100,3);
                int hizi = minibus.getMaksHiz();
                text.setText("Minibüs Hızı = "+hizi);
            }
        });
        MinibusCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uyg8Minibus minibus = new uyg8Minibus(100,3);
                String calistrma = minibus.araciCalistir();
                text.setText("Durum = "+calistrma);
            }
        });
        MinibusYolcuIndir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uyg8Minibus minibus = new uyg8Minibus(100,3);
                String durum = minibus.YolcuIndir();
                text.setText("Durum = "+durum);
            }
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg8Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
