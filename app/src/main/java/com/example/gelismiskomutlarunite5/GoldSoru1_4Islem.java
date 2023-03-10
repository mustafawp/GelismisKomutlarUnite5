package com.example.gelismiskomutlarunite5;

public class GoldSoru1_4Islem {
    public int sonuc = 0;
    public GoldSoru1_4Islem(String islem, int sayi1, int sayi2) {
        if(islem == "topla") sonuc = sayi1 + sayi2;
        else if(islem == "cikar") sonuc = sayi1 - sayi2;
        else if(islem == "carp") sonuc = sayi1 * sayi2;
        else if(islem == "bol") sonuc = sayi1 / sayi2;
    }
}
