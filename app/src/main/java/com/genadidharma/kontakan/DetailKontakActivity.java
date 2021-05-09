package com.genadidharma.kontakan;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailKontakActivity extends AppCompatActivity {
    private String nama;
    private String noTelepon;
    private String email;
    private @DrawableRes int foto;

    private CircleImageView ciFoto;
    private TextView tvNama;
    private TextView tvNoTelepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kontak);

        initLayout();
        getIntentExtra();

        Glide
                .with(getApplicationContext())
                .load(foto)
                .apply(new RequestOptions().override(100, 100))
                .into(ciFoto);
        tvNama.setText(nama);
        tvNoTelepon.setText(noTelepon);
    }

    private void initLayout(){
        ciFoto = findViewById(R.id.ci_foto);
        tvNama = findViewById(R.id.tv_nama);
        tvNoTelepon = findViewById(R.id.tv_no_telepon);
    }

    private void getIntentExtra(){
        nama = getIntent().getStringExtra(MainActivity.EXTRA_KEY_NAMA);
        noTelepon = getIntent().getStringExtra(MainActivity.EXTRA_KEY_NO_TELEPON);
        email = getIntent().getStringExtra(MainActivity.EXTRA_KEY_EMAIL);
        foto = getIntent().getIntExtra(MainActivity.EXTRA_KEY_FOTO, 0);
    }
}