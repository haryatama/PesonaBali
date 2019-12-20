package com.example.uasikinaja.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uasikinaja.Adapter.SuperWisataAdapter;
import com.example.uasikinaja.Model.SuperWisata;
import com.example.uasikinaja.R;

import java.util.ArrayList;
import java.util.List;


///**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link Wisatafragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// */
public class Wisatafragment extends Fragment {
    RecyclerView recyclerView;
    View view;
    SuperWisataAdapter adapters;
    List<SuperWisata> ListSuper = new ArrayList<>();


    public Wisatafragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_wisatafragment, container, false);

       recyclerView = view.findViewById(R.id.listMenu);

        SuperWisata item = new SuperWisata("Tanah Lot" , R.drawable.tanahlot1);
        ListSuper.add(item);
        SuperWisata item2 = new SuperWisata("Bedugul", R.drawable.bedugul);
        ListSuper.add(item2);
        SuperWisata item3 = new SuperWisata("Kuta", R.drawable.kuta);
        ListSuper.add(item3);
        SuperWisata item4 = new SuperWisata("Kintamani", R.drawable.kintamani);
        ListSuper.add(item4);
        SuperWisata item5 = new SuperWisata("Ubud", R.drawable.ubud);
        ListSuper.add(item5);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        SuperWisataAdapter adapters = new SuperWisataAdapter(getActivity(), ListSuper);
        recyclerView.setAdapter(adapters);
        return view;
    }

}