package com.example.gelismiskomutlarunite5;

import java.util.Random;

public class Uyg13TopcuAtisi extends Uyg13Players {
    public Uyg13TopcuAtisi(String kadi, int can) {
        super(kadi, can);
    }
    public int topcuAtis(Uyg13Players vurulacak, int siddet) {
        Random random = new Random();
        int vurus = random.nextInt(7) * siddet;
        vurulacak.setCan(vurulacak.getCan() - vurus);
        return vurus;
    }
}
