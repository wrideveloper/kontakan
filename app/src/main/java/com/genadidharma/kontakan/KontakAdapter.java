package com.genadidharma.kontakan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

// TODO 7: Membuat class Adapter yang meng-extends class RecyclerView.Adapter
/*
RecylerView.Adapter merupakan sebuah abstract class yang di dalamnya berisi berbagai method untuk
membuat sebuah RecyclerView
*/

class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.KontakAdapterViewHolder> {
    // TODO 11: Membuat atribut yang menyimpan List Kontak dan OnItemClickListener pada class KontakAdapter
    /*
    listKontak: List<Kontak>
    itemClikcListener: OnItemClickListener
    */
    private final List<Kontak> listKontak;
    private final OnItemClickListener itemClickListener;

    // TODO 12: Membuat Konstruktor untuk mengisi atribut
    public KontakAdapter(List<Kontak> listKontak, OnItemClickListener itemClickListener) {
        this.listKontak = listKontak;
        this.itemClickListener = itemClickListener;
    }

    // TODO 9: Mengimplementasikan 3 method utama dari class RecyclerView.Adapter
    /*
    onCreateViewHolder() = Berfungsi untuk menginisialisasikan file layout, yaitu item_list.xml ke dalam Adapter
    onBindViewHolder() = Digunakan untuk mengirimkan data Kontak ke dalam ViewHolder
    getItemCount() = Mengambil jumlah data dalam RecyclerView
    */

    @NonNull
    @Override
    public KontakAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)  {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new KontakAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KontakAdapter.KontakAdapterViewHolder holder, int position) {
        holder.bindItem(listKontak.get(position), itemClickListener);
    }

    @Override
    public int getItemCount() {
        return listKontak.size();
    }

    // TODO 8: Membuat Inner Class KontakAdapterViewHolder yang meng-extends class RecyclerView.ViewHolder
    // ViewHolder berfungsi untuk melakukan binding terhadap komponen di item_layout.xml dengan data Kontak
    public class KontakAdapterViewHolder extends RecyclerView.ViewHolder {
        public KontakAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        // Membuat method untuk melakukan binding data Kontak ke item_layout
        private void bindItem(Kontak kontak, OnItemClickListener itemClickListener) {
            // Mendeklarasikan komponen foto dan nama dan melakukan Binding
            CircleImageView ciFoto = itemView.findViewById(R.id.ci_foto);
            TextView tvNama = itemView.findViewById(R.id.tv_nama);

            // Memasukan data foto ke dalam komponen foto menggunakan library Glide
            Glide
                    .with(itemView.getContext())
                    .load(kontak.getFoto())
                    .apply(new RequestOptions())
                    .override(100, 100)
                    .into(ciFoto);
            // Memasukan data nama ke dalam komponen nama.
            tvNama.setText(kontak.getNama());

            //Ketika item diklik, panggil event setOnClickListener
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Panggil method onItemClick dari Inteface OnItemClickListener, lalu kirimkan data Kontak ke parameternya
                    itemClickListener.onItemClick(kontak);
                }
            });
        }
    }
}
