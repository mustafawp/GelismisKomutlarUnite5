package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ss_206_Activity extends AppCompatActivity {
    Button AskerBtn,TankciBtn,TopcuBtn;
    TextView text;
    private void tanimlamalar(){
        AskerBtn = findViewById(R.id.ss206_AskerBtn);
        TankciBtn = findViewById(R.id.ss206_TankciBtn);
        TopcuBtn = findViewById(R.id.ss206_TopcuBtn);
        text = findViewById(R.id.ss206Sonuc2);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_206layout);
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
    public void topcua(View view){
        ss206Topcu mesaj = new ss206Topcu();
        text.setText(mesaj.ates());
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(ss_206_Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
