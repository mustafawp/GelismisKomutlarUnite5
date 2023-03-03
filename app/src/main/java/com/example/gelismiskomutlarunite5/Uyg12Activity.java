package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Uyg12Activity extends AppCompatActivity {
    Button Ekle;
    EditText text;
    ListView list;
    private void tanimlama(){
        Ekle = findViewById(R.id.uyg12EkleBtn);
        text = findViewById(R.id.uyg12IsimTxt);
        list = findViewById(R.id.uyg12List);
    }

    ArrayList<String> isimler = new ArrayList<>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg12_activity);
        tanimlama();
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,isimler);
        list.setAdapter(adapter);
        Ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isim = text.getText().toString();
                isimler.add(isim);
                adapter.notifyDataSetChanged();
                text.setText("");
            }
        });
        list.setOnItemClickListener((adapterView, view, i, l) -> {
            isimler.remove(i);
            adapter.notifyDataSetChanged();
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg12Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
