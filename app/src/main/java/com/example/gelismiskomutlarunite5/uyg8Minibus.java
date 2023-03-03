package com.example.gelismiskomutlarunite5;

public class uyg8Minibus extends uyg8Arac {
    public uyg8Minibus(int hiz,int kapisayisi) {
        this.setKapiSayisi(kapisayisi);
        this.setMaksHiz(hiz);
    }
    public String YolcuIndir() {
        return "Yolcu İndiriliyor..";
    }
}
