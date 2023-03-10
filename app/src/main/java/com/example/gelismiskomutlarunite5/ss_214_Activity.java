package com.example.gelismiskomutlarunite5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ss_214_Activity extends AppCompatActivity {
    ListView OgrenciAdiList, OgrenciNoList;
    Button ekle;
    EditText OgrenciAdiTxt, OgrenciNoTxt;
    public void tanimlamalar() {
        OgrenciAdiList = findViewById(R.id.ss214_OgrenciAdiList);
        OgrenciNoList = findViewById(R.id.ss214_OgrenciNoList);
        ekle = findViewById(R.id.ss214_Ekle);
        OgrenciAdiTxt = findViewById(R.id.ss214_OgrenciAdiTxt);
        OgrenciNoTxt = findViewById(R.id.ss214_OgrenciNoTxt);
    }
    ArrayList<String> ogrenciadlari = new ArrayList<>();
    ArrayList<String> ogrencinolari = new ArrayList<>();
    ArrayAdapter adlar,nolar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_214layout);
        tanimlamalar();
        adlar = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ogrenciadlari);
        nolar = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ogrencinolari);
        OgrenciAdiList.setAdapter(adlar);
        OgrenciNoList.setAdapter(nolar);
        ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ogrenciadlari.add(OgrenciAdiTxt.getText().toString());
                ogrencinolari.add(OgrenciNoTxt.getText().toString());
                adlar.notifyDataSetChanged();
                nolar.notifyDataSetChanged();
            }
        });
        OgrenciAdiList.setOnItemClickListener((adapterView, view, i, l) -> {
            ogrenciadlari.remove(i);
            ogrencinolari.remove(i);
            adlar.notifyDataSetChanged();
            nolar.notifyDataSetChanged();
        });
    }
}