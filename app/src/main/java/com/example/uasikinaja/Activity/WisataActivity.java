package com.example.uasikinaja.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uasikinaja.Adapter.SuperWisataAdapter;
import com.example.uasikinaja.Model.SuperWisata;
import com.example.uasikinaja.Model.SuperWisata2;
import com.example.uasikinaja.R;

import java.util.ArrayList;
import java.util.List;

public class WisataActivity extends AppCompatActivity {

    public ImageView imageName;
    public TextView namaName;
    public TextView jamName;
    public TextView hargaName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        imageName = findViewById(R.id.imageName);
        namaName = findViewById(R.id.namaName);
        jamName = findViewById(R.id.jamName);
        hargaName = findViewById(R.id.hargaName);
        final int a = getIntent().getExtras().getInt("gambar");
        final String b = getIntent().getExtras().getString("deskripsi");
        final String c = getIntent().getExtras().getString("jam");
        final String d = getIntent().getExtras().getString("harga");
        imageName.setImageResource(a);
        namaName.setText(b);
        jamName.setText(c);
        hargaName.setText(d);

        final SuperWisata2 wisata2 = new SuperWisata2(a,b,c,d);

    }
}
