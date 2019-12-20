package com.example.uasikinaja.Model;

public class SuperWisata {
    public String wisataName;
    public int wisataImage;
    public String key;

    public SuperWisata(String wisataName , int wisataImage) {
        this.wisataName = wisataName;
        this.wisataImage = wisataImage;
    }

    public String getWisataName() {
        return wisataName;
    }

    public void setWisataName(String wisataName) {
        this.wisataName = wisataName;
    }

    public int getWisataImage() {
        return wisataImage;
    }

    public void setWisataImage(int wisataImage) {
        this.wisataImage = wisataImage;
    }
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
