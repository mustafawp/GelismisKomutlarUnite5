package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg11Activity extends AppCompatActivity {
    Button topla,sifirla;
    TextView index,toplams;
    EditText sayi;
    protected void tanimlamalar() {
        topla = findViewById(R.id.uyg11ToplaBtn);
        sifirla = findViewById(R.id.uyg11SifirlaBtn);
        index = findViewById(R.id.uyg11Index);
        toplams = findViewById(R.id.uyg11Toplam);
        sayi = findViewById(R.id.uyg11SayiTxt);
    }
    int[] sayilar = new int[6];
    int ix = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg11_activity);
        tanimlamalar();
        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ix < 6){
                    int eklenecek = Integer.parseInt(sayi.getText().toString());
                    sayilar[ix] = eklenecek;
                    ix++;
                    index.setText("İndex: "+ix);
                    int toplam = 0;
                    for(int i = 0;i <= ix;i++){
                        toplam += sayilar[i];
                    }
                    toplams.setText("Toplam: "+toplam);
                    sayi.setText("");
                }
            }
        });
        sifirla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ix = 0;
                sayilar = new int[6];
                index.setText("İndex: 0");
                toplams.setText("Toplam: 0");
                sayi.setText("");
            }
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg11Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
