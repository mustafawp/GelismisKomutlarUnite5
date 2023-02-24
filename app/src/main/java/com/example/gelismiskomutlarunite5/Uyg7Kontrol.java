package com.example.gelismiskomutlarunite5;

import android.util.Log;

public class Uyg7Kontrol {
    private int yas = 0;
    public int getYas(){
        return yas;
    }
    public void setYas(int yas){
        if(yas<18 ||yas>55){
            Log.e("Hata!","Yaşı yetmiiyo");
            this.yas = 18;
        }
        else {
            this.yas = yas;
        }
    }
}
