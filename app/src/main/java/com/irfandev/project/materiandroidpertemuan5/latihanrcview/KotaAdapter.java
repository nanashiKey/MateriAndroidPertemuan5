package com.irfandev.project.materiandroidpertemuan5.latihanrcview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.irfandev.project.materiandroidpertemuan5.R;

import java.util.ArrayList;

/**
 * created by Irfan Assidiq
 * email : assidiq.irfan@gmail.com
 **/
public class KotaAdapter extends RecyclerView.Adapter<KotaAdapter.KotaViewHolder>{

    private ArrayList<Kota> listKota;
    private Context ctx;
    public KotaAdapter(){}
    public KotaAdapter(Context ctx, ArrayList<Kota> listKota){
        this.listKota = listKota;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public KotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.item_rcview, parent, false);
        return new KotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KotaViewHolder holder, int position) {
        Kota kota = listKota.get(position);
        holder.tvTitle.setText(kota.getTitle());
        holder.tvSubtitle.setText(kota.getSubtitle());
        holder.llayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(ctx, "kota "+kota.getTitle(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ctx, DetailKotaActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("title", kota.getTitle());
                bundle.putString("subtitle", kota.getSubtitle());
                intent.putExtras(bundle);
                ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKota.size();
    }

    public class KotaViewHolder extends RecyclerView.ViewHolder{
        public LinearLayout llayout;
        public TextView tvTitle, tvSubtitle;
        public KotaViewHolder(View view){
            super(view);
            llayout = view.findViewById(R.id.llayout);
            tvTitle = view.findViewById(R.id.tvTitle);
            tvSubtitle = view.findViewById(R.id.tvSubtitle);
        }
    }
}
