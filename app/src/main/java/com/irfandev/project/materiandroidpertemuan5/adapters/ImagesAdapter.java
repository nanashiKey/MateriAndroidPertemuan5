package com.irfandev.project.materiandroidpertemuan5.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import com.irfandev.project.materiandroidpertemuan5.R;

/**
 * created by Irfan Assidiq
 * email : assidiq.irfan@gmail.com
 **/
public class ImagesAdapter extends BaseAdapter {

    private Context ctx;
    public Integer[] dataGambar = {
            R.drawable.bgr, R.drawable.bdg, R.drawable.sby,
            R.drawable.dpk, R.drawable.jkt, R.drawable.bdg};

    public ImagesAdapter(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return dataGambar.length;
    }

    @Override
    public Object getItem(int i) {
        return dataGambar[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imgView = new ImageView(ctx);
        imgView.setImageResource(dataGambar[i]);
        imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GridView.LayoutParams grview = new GridView.LayoutParams(200, 200);
        imgView.setLayoutParams(grview);

        return imgView;
    }
}
