package com.example.gelismiskomutlarunite5;

import java.util.Random;

public class Uyg13TankciAtis extends Uyg13Players{
    public Uyg13TankciAtis(String kadi, int can) {
        super(kadi, can);
    }
    public int tankciAtis(Uyg13Players vurulacak, int siddet) {
        Random random = new Random();
        int vurus = random.nextInt(5) * siddet;
        vurulacak.setCan(vurulacak.getCan() - vurus);
        return vurus;
    }
}
