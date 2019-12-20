package com.example.uasikinaja.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uasikinaja.Model.SuperWisata2;
import com.example.uasikinaja.R;

import java.util.List;

public class SuperWisataAdapter2 extends RecyclerView.Adapter<SuperWisataAdapter2.MyHolder2View> {

    Context context;
    LayoutInflater inflater;
    List<SuperWisata2> wisata2List;
    View wisata2ListView;

    public SuperWisataAdapter2(Context context, List<SuperWisata2> wisata2List) {
        this.context = context;
        this.wisata2List = wisata2List;
        this.inflater = LayoutInflater.from(this.context);
    }

    @NonNull
    @Override
    public MyHolder2View onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        wisata2ListView = inflater.inflate(R.layout.item_super_wisata, parent, false);
        return new MyHolder2View(wisata2ListView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder2View holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyHolder2View extends RecyclerView.ViewHolder {
        public TextView wisataName;
        public ImageView wisataImage;
        public CardView cardView;

        public MyHolder2View(@NonNull View itemView) {
            super(itemView);
            wisataName = itemView.findViewById(R.id.wisataName);
            wisataImage = itemView.findViewById(R.id.wisataImage);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
