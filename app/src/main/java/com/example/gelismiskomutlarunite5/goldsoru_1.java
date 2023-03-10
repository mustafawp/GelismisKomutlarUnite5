package com.example.gelismiskomutlarunite5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class goldsoru_1 extends AppCompatActivity {
    Button birbtn,ikibtn,ucbtn,dortbtn,besbtn,altibtn,yedibtn,sekizbtn,dokuzbtn,sifirbtn,sifirlamabtn,sonucbtn, artibtn, eksibtn, carpmabtn, bolmebtn;
    EditText metin;

    public void tanimlamalar() {
        birbtn = findViewById(R.id.birBtn);
        ikibtn = findViewById(R.id.ikiBtn);
        ucbtn = findViewById(R.id.ucBtn);
        dortbtn = findViewById(R.id.dortBtn);
        besbtn = findViewById(R.id.besBtn);
        altibtn = findViewById(R.id.altiBtn);
        yedibtn = findViewById(R.id.yediBtn);
        sekizbtn = findViewById(R.id.sekizBtn);
        dokuzbtn = findViewById(R.id.dokuzBtn);
        sifirbtn = findViewById(R.id.sifirBtn);
        sifirlamabtn = findViewById(R.id.sifirlamaBtn);
        sonucbtn = findViewById(R.id.sonucBtn);
        artibtn = findViewById(R.id.artiBtn);
        eksibtn = findViewById(R.id.eksiBtn);
        carpmabtn = findViewById(R.id.carpmaBtn);
        bolmebtn = findViewById(R.id.bolmeBtn);
        metin = findViewById(R.id.toplamaIslemTxt);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goldsoru1);
        tanimlamalar();
        birbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "1");
            }
        });
        ikibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "2");
            }
        });
        ucbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "3");
            }
        });
        dortbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "4");
            }
        });
        besbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "5");
            }
        });
        altibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "6");
            }
        });
        yedibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "7");
            }
        });
        sekizbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "8");
            }
        });
        dokuzbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "9");
            }
        });
        sifirbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "0");
            }
        });
        artibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "+");
            }
        });
        eksibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "-");
            }
        });
        carpmabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "x");
            }
        });
        bolmebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gettext = metin.getText().toString();
                metin.setText(gettext.toString() + "/");
            }
        });
        sifirlamabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                metin.setText("");
            }
        });
        sonucbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = metin.getText().toString();
                String durum = "";
                int sayi1,sayi2;
                sayi1 = 0;
                sayi2 = 0;
                for(int i = 0; i <= text.length()-1;i++) {
                    Log.e("error",String.valueOf(text.charAt(i)));
                    switch (String.valueOf(text.charAt(i))) {
                        case "+":
                            durum = "topla";
                            String sa = text.substring(0,i);
                            String as = text.substring(i+1,text.length());
                            sayi1 = Integer.parseInt(sa);
                            sayi2 = Integer.parseInt(as);
                            break;
                        case "-":
                            durum = "cikar";
                            String say1 = text.substring(0,i);
                            String say2 = text.substring(i+1,text.length());
                            sayi1 = Integer.parseInt(say1);
                            sayi2 = Integer.parseInt(say2);
                            break;
                        case "x":
                            durum = "carp";
                            String say3 = text.substring(0,i);
                            String say4 = text.substring(i+1,text.length());
                            sayi1 = Integer.parseInt(say3);
                            sayi2 = Integer.parseInt(say4);
                            break;
                        case "/":
                            durum = "cikar";
                            String say5 = text.substring(0,i);
                            String say6 = text.substring(i+1,text.length());
                            sayi1 = Integer.parseInt(say5);
                            sayi2 = Integer.parseInt(say6);
                            break;
                    }
                }
                GoldSoru1_4Islem islem = new GoldSoru1_4Islem(durum,sayi1,sayi2);
                int sonuc = islem.sonuc;
                metin.setText(String.valueOf(sonuc));
            }
        });
    }
}