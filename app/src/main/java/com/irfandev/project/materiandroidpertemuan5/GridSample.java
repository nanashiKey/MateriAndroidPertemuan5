package com.irfandev.project.materiandroidpertemuan5;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.irfandev.project.materiandroidpertemuan5.adapters.ImagesAdapter;

/**
 * created by Irfan Assidiq
 * email : assidiq.irfan@gmail.com
 **/
public class GridSample extends AppCompatActivity {
    GridView gvSample;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayout);
        gvSample = findViewById(R.id.gvSample);
        ImagesAdapter imgAdapter = new ImagesAdapter(this);
        gvSample.setAdapter(imgAdapter);
    }
}
