package com.example.dcodingsubmission;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBandAdapter extends RecyclerView.Adapter<ListBandAdapter.ListViewHolder>{
    private ArrayList<Band> listBand;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListBandAdapter(ArrayList<Band> list){
        this.listBand = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup v, int viewType) {
        View view = LayoutInflater.from(v.getContext()).inflate(R.layout.list_row_band,
                v, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Band band =listBand.get(position);
        Glide.with(holder.itemView.getContext())
                .load(band.getFotothumbnail())
                .apply(new RequestOptions().override(100,150))
                .into(holder.imgphoto);
        holder.tvNama.setText(band.getNamaBand());
        holder.tvDetail.setText(band.getDescBand());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback. onItemClicked(listBand.get(holder.getAdapterPosition()));
            }

        });
    }

    @Override
    public int getItemCount() {
        return listBand.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgphoto;
        TextView tvNama,tvDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgphoto = itemView.findViewById(R.id.imageView);
            tvNama =itemView.findViewById(R.id.tv_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);

        }
    }
    public interface  OnItemClickCallback{
        void onItemClicked(Band data);
    }
}
