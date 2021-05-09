package com.genadidharma.kontakan;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import de.hdodenhof.circleimageview.CircleImageView;

// TODO 23: Menampilkan data hasil dari Intent Explicit
/*
Beberapa langkah yang dilakukan:
- Melakukan binding terhadap komponen dari activity_detail_main.xml
- Mengambil data dari Intent Explicit dan memasukan ke dalam variabel sesuai atribut pada objek Kontak
- Mengisi data-data ke dalam komponen layout
*/
public class DetailKontakActivity extends AppCompatActivity {
    // TODO 24: Mendeklarasikan data-data yang dikirmkan oleh Intent Explicit
    private String nama;
    private String noTelepon;
    private String email;
    private @DrawableRes int foto;

    // TODO 25: Mendeklarasikan komponen pada activity_detail_kontak.xml
    private CircleImageView ciFoto;
    private TextView tvNama;
    private TextView tvNoTelepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kontak);

        // TODO 28: Panggil method initLayout
        initLayout();
        // TODO 29: Panggil method getIntentExtra
        getIntentExtra();

        //TODO 30: Mengisi data-data ke dalam komponen layout
        Glide
                .with(getApplicationContext())
                .load(foto)
                .apply(new RequestOptions().override(100, 100))
                .into(ciFoto);
        tvNama.setText(nama);
        tvNoTelepon.setText(noTelepon);
    }

    // TODO 26: Melakukan binding terhadap komponen layout
    private void initLayout(){
        ciFoto = findViewById(R.id.ci_foto);
        tvNama = findViewById(R.id.tv_nama);
        tvNoTelepon = findViewById(R.id.tv_no_telepon);
    }

    // TODO 27: Mengambil semua data kiriman Intent Explicit dan menyimpannya ke variabel
    private void getIntentExtra(){
        // Panggil key yang sudah dibuat pada Mainactivity sesuai tipe data variabel pada atribut Kontak dan
        nama = getIntent().getStringExtra(MainActivity.EXTRA_KEY_NAMA);
        noTelepon = getIntent().getStringExtra(MainActivity.EXTRA_KEY_NO_TELEPON);
        email = getIntent().getStringExtra(MainActivity.EXTRA_KEY_EMAIL);
        foto = getIntent().getIntExtra(MainActivity.EXTRA_KEY_FOTO, 0);
    }
}