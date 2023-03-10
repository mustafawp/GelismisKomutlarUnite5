package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
    Button AskerBtn,TopcuBtn;
    TextView text;
    private void tanimlamalar(){
        AskerBtn = findViewById(R.id.Uyg10AskerBtn);
        TopcuBtn = findViewById(R.id.uyg10TankciBtn);
        text = findViewById(R.id.ss206Sonuc);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);
        tanimlamalar();
    }
    public void asker(View view){
        Uyg10Asker mesaj = new Uyg10Asker();
        text.setText(mesaj.ates());
    }
    public void topcu(View view){
        Uyg10Topcu mesaj = new Uyg10Topcu();
        text.setText(mesaj.ates());
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg10Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
