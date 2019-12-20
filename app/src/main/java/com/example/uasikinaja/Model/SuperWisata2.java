package com.example.uasikinaja.Model;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uasikinaja.R;

public class SuperWisata2 {
    int imageName;
    String namaName;
    String jamName;
    String hargaName;

    public SuperWisata2(int imageName, String namaName, String jamName, String hargaName) {
        this.imageName = imageName;
        this.namaName = namaName;
        this.jamName = jamName;
        this.hargaName = hargaName;
    }

    public int getImageName() {
        return imageName;
    }

    public void setImageName(int imageName) {
        this.imageName = imageName;
    }

    public String getNamaName() {
        return namaName;
    }

    public void setNamaName(String namaName) {
        this.namaName = namaName;
    }

    public String getJamName() {
        return jamName;
    }

    public void setJamName(String jamName) {
        this.jamName = jamName;
    }

    public String getHargaName() {
        return hargaName;
    }

    public void setHargaName(String hargaName) {
        this.hargaName = hargaName;
    }

    public SuperWisata2(int b, int c, int d, int a) {

    }

    }

