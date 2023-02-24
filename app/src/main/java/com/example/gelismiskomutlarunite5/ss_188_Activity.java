package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ss_188_Activity extends AppCompatActivity {
    EditText kenar1, kenar2,kenar3;
    int deger, deger2,deger3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_188_layout);
        kenar1 = findViewById(R.id.ss_188Kenar1);
        kenar2 = findViewById(R.id.ss_188Kenar2);
        kenar3 = findViewById(R.id.ss_188Kenar3);
        Button eskenar = findViewById(R.id.ss_188Eskenar);
        eskenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger = Integer.parseInt(kenar1.getText().toString());
                SiraSizde188 islem = new SiraSizde188(deger);
                Toast.makeText(ss_188_Activity.this, "Sonuç = "+islem.dd, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void IkizVeCesit(View view){
        deger = Integer.parseInt(kenar1.getText().toString());
        deger2 = Integer.parseInt(kenar2.getText().toString());
        deger3 = Integer.parseInt(kenar3.getText().toString());
        if(kenar3.getText().toString() == "")
        {
            SiraSizde188 islem = new SiraSizde188(deger,deger2);
            Toast.makeText(ss_188_Activity.this, "Sonuç = "+islem.dd, Toast.LENGTH_SHORT).show();
        }
        else {
            SiraSizde188 islem = new SiraSizde188(deger, deger2, deger3);
            Toast.makeText(ss_188_Activity.this, "Sonuç = " + islem.dd, Toast.LENGTH_SHORT).show();
        }
    }
}