package com.genadidharma.kontakan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailKontakActivity extends AppCompatActivity {
    private CircleImageView ciFoto;
    private TextView tvNama;
    private TextView tvNoTelepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kontak);

        initLayout();

        Kontak kontak = getParcelable();

        Glide
                .with(getApplicationContext())
                .load(kontak.getFoto())
                .apply(new RequestOptions().override(100, 100))
                .into(ciFoto);
        tvNama.setText(kontak.getNama());
        tvNoTelepon.setText(kontak.getNoTelepon());
    }

    private void initLayout(){
        ciFoto = findViewById(R.id.ci_foto);
        tvNama = findViewById(R.id.tv_nama);
        tvNoTelepon = findViewById(R.id.tv_no_telepon);
    }

    private Kontak getParcelable(){
        return getIntent().getParcelableExtra("kontak");
    }
}