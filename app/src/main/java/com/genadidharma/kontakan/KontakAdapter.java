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

class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.KontakAdapterViewHolder> {
    private List<Kontak> listKontak;

    public KontakAdapter(List<Kontak> listKontak) {
        this.listKontak = listKontak;
    }

    @NonNull
    @Override
    public KontakAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new KontakAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KontakAdapter.KontakAdapterViewHolder holder, int position) {
        holder.bindItem(listKontak.get(position));
    }

    @Override
    public int getItemCount() {
        return listKontak.size();
    }

    public class KontakAdapterViewHolder extends RecyclerView.ViewHolder {
        public KontakAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        private void bindItem(Kontak kontak) {
            CircleImageView ciFoto = itemView.findViewById(R.id.ci_foto);
            TextView tvNama = itemView.findViewById(R.id.tv_nama);

            Glide
                    .with(itemView.getContext())
                    .load(kontak.getFoto())
                    .apply(new RequestOptions())
                    .override(55, 55).into(ciFoto);
            tvNama.setText(kontak.getNama());
        }
    }
}
