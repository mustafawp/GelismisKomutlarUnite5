package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Uyg13Activity extends AppCompatActivity {
    ProgressBar oyuncu1Pb, oyuncu2Pb;
    Button topcuatis1, tankciatis1, topcuatis2, tankciatis2, oyunubaslat;
    TextView vurusbilgi;
    EditText TopcuAtisSiddeti, TankciAtisSiddeti;
    Uyg13Players pl1,pl2;
    public void tanimlamalar() {
        oyuncu1Pb = findViewById(R.id.oyuncu1Progress);
        oyuncu2Pb = findViewById(R.id.oyuncu2Progress);
        topcuatis1 = findViewById(R.id.topcu1Atis);
        tankciatis1 = findViewById(R.id.tankci1Atis);
        topcuatis2 = findViewById(R.id.topcu2Atis);
        tankciatis2 = findViewById(R.id.tankci2Atis);
        vurusbilgi = findViewById(R.id.vurusSiddetiLbl);
        oyunubaslat = findViewById(R.id.ayarlarKayitBtn);
        TopcuAtisSiddeti = findViewById(R.id.topcuAtisSiddetitxt);
        TankciAtisSiddeti = findViewById(R.id.tankciAtisSiddetitxt);
    }
    ArrayList<Uyg13Players> players = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg13_activity);
        tanimlamalar();
        pl1 = new Uyg13Players("Player 1",100);
        pl2 = new Uyg13Players("Player 2",100);
        players.add(pl1);
        players.add(pl2);
        oyuncu1Pb.setProgress(100);
        oyuncu2Pb.setProgress(100);
        topcuatis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uyg13TopcuAtisi atis = new Uyg13TopcuAtisi("s",2);
                if(TopcuAtisSiddeti.getText().toString().trim().length() == 0) {
                    Toast.makeText(Uyg13Activity.this, "Lütfen Topçu Atış Şiddetini gir.", Toast.LENGTH_SHORT).show();
                    return;
                }
                int sayi = Integer.parseInt(TopcuAtisSiddeti.getText().toString());
                int vv = atis.topcuAtis(pl2,sayi);
                for(Uyg13Players pl:players) {
                    if(pl.getCan() <= 0) {
                        vurusbilgi.setText("Oyun Bitti.");
                        return;
                    }
                    if(pl.getKadi() == "Player 1") oyuncu1Pb.setProgress(pl.getCan());
                    if(pl.getKadi() == "Player 2") oyuncu2Pb.setProgress(pl.getCan());
                }
                vurusbilgi.setText("VURUŞ: ("+ vv + ")");
            }
        });
        topcuatis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uyg13TopcuAtisi atis = new Uyg13TopcuAtisi("s",2);
                if(TopcuAtisSiddeti.getText().toString().trim().length() == 0) {
                    Toast.makeText(Uyg13Activity.this, "Lütfen Topçu Atış Şiddetini gir.", Toast.LENGTH_SHORT).show();
                    return;
                }
                int sayi = Integer.parseInt(TopcuAtisSiddeti.getText().toString());
                int vv = atis.topcuAtis(pl1,sayi);
                for(Uyg13Players pl:players) {
                    if(pl.getCan() <= 0) {
                        vurusbilgi.setText("Oyun Bitti.");
                        return;
                    }
                    if(pl.getKadi() == "Player 1") oyuncu1Pb.setProgress(pl.getCan());
                    if(pl.getKadi() == "Player 2") oyuncu2Pb.setProgress(pl.getCan());
                }
                vurusbilgi.setText("VURUŞ: ("+ vv + ")");
            }
        });
        tankciatis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uyg13TankciAtis atis = new Uyg13TankciAtis("s",2);
                if(TankciAtisSiddeti.getText().toString().trim().length() == 0) {
                    Toast.makeText(Uyg13Activity.this, "Lütfen Tankçı Atış Şiddetini gir.", Toast.LENGTH_SHORT).show();
                    return;
                }
                int sayi = Integer.parseInt(TankciAtisSiddeti.getText().toString());
                int vv = atis.tankciAtis(pl2,sayi);
                for(Uyg13Players pl:players) {
                    if(pl.getCan() <= 0) {
                        vurusbilgi.setText("Oyun Bitti.");
                        return;
                    }
                    if(pl.getKadi() == "Player 1") oyuncu1Pb.setProgress(pl.getCan());
                    if(pl.getKadi() == "Player 2") oyuncu2Pb.setProgress(pl.getCan());
                }
                vurusbilgi.setText("VURUŞ: ("+ vv + ")");
            }
        });
        tankciatis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uyg13TankciAtis atis = new Uyg13TankciAtis("s",2);
                if(TankciAtisSiddeti.getText().toString().trim().length() == 0) {
                    Toast.makeText(Uyg13Activity.this, "Lütfen Tankçı Atış Şiddetini gir.", Toast.LENGTH_SHORT).show();
                    return;
                }
                int sayi = Integer.parseInt(TankciAtisSiddeti.getText().toString());
                int vv = atis.tankciAtis(pl1,sayi);
                for(Uyg13Players pl:players) {
                    if(pl.getCan() <= 0) {
                        vurusbilgi.setText("Oyun Bitti.");
                        return;
                    }
                    if(pl.getKadi() == "Player 1") oyuncu1Pb.setProgress(pl.getCan());
                    if(pl.getKadi() == "Player 2") oyuncu2Pb.setProgress(pl.getCan());
                }
                vurusbilgi.setText("VURUŞ: ("+ vv + ")");
            }
        });
        oyunubaslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vurusbilgi.setText("VURUŞ: (0)");
                for(Uyg13Players pl:players) { pl.setCan(100); }
                TankciAtisSiddeti.setText("");
                TopcuAtisSiddeti.setText("");
                oyuncu1Pb.setProgress(100);
                oyuncu2Pb.setProgress(100);
            }
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg13Activity.this, MainActivity.class);
        startActivity(uyg);
    }

}
