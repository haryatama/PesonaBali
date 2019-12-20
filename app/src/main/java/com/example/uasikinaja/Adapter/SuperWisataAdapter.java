package com.example.uasikinaja.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uasikinaja.Activity.WisataActivity;
import com.example.uasikinaja.Fragment.Wisatafragment;
import com.example.uasikinaja.Model.SuperWisata;
import com.example.uasikinaja.R;

import java.util.List;

public class SuperWisataAdapter extends RecyclerView.Adapter<SuperWisataAdapter.MyViewHolder> {

    Context context;
    LayoutInflater inflater;
    List<SuperWisata> wisataList;
    View wisataListView;

    public SuperWisataAdapter (Context c, List<SuperWisata> wisataList) {
        this.context = c;
        this.wisataList = wisataList;
        this.inflater = LayoutInflater.from(this.context);
    }

public SuperWisataAdapter(List<SuperWisata>wisataList){this.wisataList=wisataList;}

    @NonNull
    @Override
    public SuperWisataAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    wisataListView = inflater.inflate(R.layout.item_super_wisata,parent,false);
    return new MyViewHolder(wisataListView);
    }

    @Override
    public void onBindViewHolder(@NonNull SuperWisataAdapter.MyViewHolder holder, final int position) {
    SuperWisata wisata = wisataList.get(position);
    holder.wisataName.setText(wisata.getWisataName());
    holder.wisataImage.setImageResource(wisata.getWisataImage());
    holder.cardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
if (position == 0 ){
    Toast.makeText(view.getContext(),"berhasil memilih",Toast.LENGTH_SHORT).show();
    Intent intent = new Intent(view.getContext(), WisataActivity.class);
    intent.putExtra("gambar",R.drawable.tanahlot1);
    intent.putExtra("deskripsi","Pura Tanah Lot adalah salah satu tempat wisata di Bali yang terkenal dengan keindahannya, terutama pada saat matahari terbenam. Pura Tanah Lot yang terdiri dari 2 buah pura yang merupakan pura tempat memuja dewa laut Keunikan dari Pura Tanah Lot adalah lokasinpura yang berada di atas sebuah batu karang besar di pinggir laut. Pada saat air laut pasang, anda tidak dapat mendekat ke Pura Tanah Lot karena di sekitar batu karang penyangga Pura Tanah Lot akan digenangi air laut, sedangkan Pada saat air surut anda dapat melihat beberapa ular laut jinak yang menurut penduduk setempat merupakan penjaga Pura Tanah Lot. Selain itu, di lokasi ini anda juga dapat memegang ular suci tersebut, karena memang sudah dikenal jinak dan tidak berbahaya.");
    intent.putExtra("jam","LOKASI : Beraban, Kec. Kediri, Kabupaten Tabanan, Bali , JAM BUKA : Senin - Minggu 07.00 - 19.00");
    intent.putExtra("harga","HARGA TIKET : Dewasa: Rp 20.000/orang. Anak: Rp 15.000/orang. Parkir motor: Rp 2.000/motor. Parkir mobil: Rp 5.000/mobil.");
    view.getContext().startActivity(intent);
}else if (position == 1){
    Toast.makeText(view.getContext(),"berhasil memilih",Toast.LENGTH_SHORT).show();
    Intent intent = new Intent(view.getContext(), WisataActivity.class);
    intent.putExtra("gambar",R.drawable.bedugul1);
    intent.putExtra("deskripsi","Danau Beratan Bedugul adalah sebuah danau yang berlokasi di daerah pegunungan dengan suasana alam yang asri. Keunikan dari Danau Beratan Bedugul adalah keberadaan pura yang bernama Pura Ulun Danu. Pura Ulun Danu terletak di pinggir Danau Beratan Bedugul dan merupakan salah satu daya tarik utama Danau Beratan Bedugul. Selain itu wisatawan juga dapat menikmati permainan air dan menyewa perahu di Danau Beratan Bedugul.");
    intent.putExtra("jam","LOKASI : Jl. Puncak Mangu No.1, Batunya, Buleleng, Kabupaten Tabanan, Bali , JAM BUKA : Senin - Minggu 08.00 - 18.00");
    intent.putExtra("harga","HARGA TIKET : Rp 11.000/orang. Tiket parkir kendaraan roda dua Rp 3.000/motor. Tiket parkir mobil roda empat Rp 6.000/mobil. Biaya parkir bus, Rp 11.000/1 bus .");
    view.getContext().startActivity(intent);
}else if (position == 2){
    Toast.makeText(view.getContext(),"berhasil memilih",Toast.LENGTH_SHORT).show();
    Intent intent = new Intent(view.getContext(), WisataActivity.class);
    intent.putExtra("gambar",R.drawable.kuta1);
    intent.putExtra("deskripsi","Pantai Kuta adalah objek wisata di Bali yang paling terkenal dan paling banyak dikunjungi oleh wisatawan, karena selain lokasinya yang memang sangat strategis, Pantai Kuta juga menawarkan keindahan pantai yang sangat indah, biayanyapun sangat murah, dan yang pasti ombaknya cocok untuk para peselancar pemula. Pantai Kuta juga terkenal dengan sunsetnya yang terkenal sangat indah konon ceritanya, sebelum menjadi tempat wisata seterkenal ini, Pantai Kuta merupakan sebuah pelabuhan besar, tempat berpusatnya perdagangan di Bali dengan pasir putih dan laut birunya, dilengkapi dengan fasilitas pendukung yang sangat lengkap.");
    intent.putExtra("jam","LOKASI : Jalan Kartika Plaza , kuta ,bali , JAM BUKA : Senin - Minggu 07.00 - 23.00");
    intent.putExtra("harga","HARGA TIKET : Gratis");
    view.getContext().startActivity(intent);
}else if (position == 3){
    Toast.makeText(view.getContext(),"berhasil memilih",Toast.LENGTH_SHORT).show();
    Intent intent = new Intent(view.getContext(), WisataActivity.class);
    intent.putExtra("gambar",R.drawable.kintamani1);
    intent.putExtra("deskripsi","Kintamani terletak di Kecamatan Kintamani, Kabupaten Bangli. Perjalanan menuju tempat wisata ini dari Kota Denpasar sekitar 2 jam dengan kendaraanbermotor atau sekitar 79,9 kilometer dari Bandara Udara Ngurah Rai.Kintamani menyediakan pemandangan perbukitan dengan udara yang masih segar dan suhu udara berkisar 18 derajat celcius. Di daerah ini terdapat objek wisata Penelokan yang berada di Desa Kedisan, daerah ini menawarkan pemandangan alam pegunungan Batur dan danau Batur yang sejuk di siang hari dan dingin di malam hari.");
    intent.putExtra("jam","LOKASI : Beraban, Kec. Kediri, Kabupaten Tabanan, JAM BUKA : Senin - Minggu 07.00 - 19.00");
    intent.putExtra("harga","HARGA TIKET : Rp 15.000 / orang. Parkir Rp 5000 / mobil.");
    view.getContext().startActivity(intent);
}else if (position == 4){
    Toast.makeText(view.getContext(),"berhasil memilih",Toast.LENGTH_SHORT).show();
    Intent intent = new Intent(view.getContext(), WisataActivity.class);
    intent.putExtra("gambar",R.drawable.ubud1);
    intent.putExtra("deskripsi","Ubud merupakan sebuah nama desa yang berjarak kurang lebih 40 km dari bandara Denpasar, jika mengendarai mobil maka bisa ditempuh dalam waktu sekitar 1 1/2 jam.Desa Ubud, merupakan sebuah desa yang sangat kental dengan budaya asli Bali, jadi jika anda ingin mengetahui tentang kebudayaan asli Bali, jangan lupa mengunjungi tempat yang satu ini ya.");
    intent.putExtra("jam","LOKASI : Kecamatan Ubud, Kabupaten Gianyar, Bali, JAM BUKA : Senin - Minggu 08.00 - 17.00");
    intent.putExtra("harga","TIKET HARGA : Dewasa Rp 80.000/orang. Umur 3 – 12 tahun, Rp 60.000/anak");
    view.getContext().startActivity(intent);
}
        }
    });


    }

    @Override
    public int getItemCount() {
    return(wisataList != null)? wisataList.size():0;
//        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView wisataName;
    public ImageView wisataImage;
    public CardView cardView;
    public MyViewHolder(@NonNull View itemView){
    super(itemView);
    wisataName =itemView.findViewById(R.id.wisataName);
    wisataImage =itemView.findViewById(R.id.wisataImage);
    cardView = itemView.findViewById(R.id.cardView);
    }
    }
}
