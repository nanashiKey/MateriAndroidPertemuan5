package com.irfandev.project.materiandroidpertemuan5.latihanrcview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.irfandev.project.materiandroidpertemuan5.R;

import java.util.ArrayList;

/**
 * created by Irfan Assidiq
 * email : assidiq.irfan@gmail.com
 **/
public class RCViewMain extends AppCompatActivity {

    private RecyclerView rcView;
    private ArrayList<Kota> listKota = new ArrayList<>();
    private KotaAdapter kotaAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcview);
        rcView = findViewById(R.id.rcView);
        setListKota();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rcView.setLayoutManager(layoutManager);
        rcView.setHasFixedSize(true);

        kotaAdapter = new KotaAdapter(RCViewMain.this, listKota);
        rcView.setAdapter(kotaAdapter);
    }

    private void setListKota(){
        Kota kotaBandung = new Kota("Bandung", "Kota Parahyangan");
        listKota.add(kotaBandung);

        Kota kotaCimahi = new Kota("Cimahi", "Kota Cimahi");
        listKota.add(kotaCimahi);

        Kota kotaBogor = new Kota("Bogor", "Kota Bogor");
        listKota.add(kotaBogor);

        Kota kotaDepok = new Kota("Depok", "Kota Depok");
        listKota.add(kotaDepok);

        Kota kotaJakarta = new Kota("Jakarta", "Kota Jakarta");
        listKota.add(kotaJakarta);

        Kota kotaJambi = new Kota("Jambi", "Kota Jambi");
        listKota.add(kotaJambi);

        Kota kotaPadang = new Kota("Padang", "Kota Padang");
        listKota.add(kotaPadang);

        Kota kotaMedan = new Kota("Medan", "Kota Medan");
        listKota.add(kotaMedan);
    }
}
