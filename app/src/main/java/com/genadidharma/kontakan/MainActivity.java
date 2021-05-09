package com.genadidharma.kontakan;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// TODO 14: Mengimplementasikan Adapter pada RecyclerView
/*
Beberapa langkah yang dilakukan:
- Melakukan binding terhadap komponen RecyclerView dari activity_main.xml
- Menginisialisaikan variabel listKontak dan memanggil method getKontakData dari class KontakData untuk mengambil data Kontak
- Menentukan LayoutManager
- Menginstansiasi Adapter yang sudah dibuat, dengan mengirimkan data listKontak dan mengimplementasikan OnItemClickListener untuk kebutuhan mengirim data nantinya
- Memasang Adapter ke RecyclerView
*/
public class MainActivity extends AppCompatActivity {

    // TODO 22: Membuat key untuk setiap data yang akan dikirimkan lewat Intent Explicit
    // Tujuannya adalah untuk menghindari typo, karena pada penggunaannya cukup memanggil variabelnya saja.
    public static final String EXTRA_KEY_NAMA = "nama";
    public static final String EXTRA_KEY_NO_TELEPON = "no_telepon";
    public static final String EXTRA_KEY_EMAIL = "email";
    public static final String EXTRA_KEY_FOTO = "gambar";

    // TODO 15: Mendeklarasikan variabel bertipe objek RecyclerView untuk di binding nantinya
    private RecyclerView rvKontak;

    // TODO 16: Menginisialisasikan variabel bertipe objek List<Kontak> dan menmanggil method getKontakData() dari class KontakData untuk mengambil Data Kontaknya.
    private final List<Kontak> lisKontak = KontakData.getKontakData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 18: Memanggil method initLayout
        initLayout();

        // TODO 19:  Menentukan Layout Manager dari RecyclerViewnya. Karen dalam bentuk List, maka bisa menggunakan LinearLayoutManager
        rvKontak.setLayoutManager(new LinearLayoutManager(this));

        // TODO 20:  Menginstansiasi Adapter yang sudah dibuat
        // Dilakukan pengiriman data listKontak dan mengimplementasikan OnItemClickListener pada paremeternya.
        KontakAdapter kontakAdapter = new KontakAdapter(lisKontak, new OnItemClickListener() {
            @Override
            public void onItemClick(Kontak kontak) {
                // TODO 23: Membuat Intent Explicit dan mengirimkan setiap data pada objek Kontak
                // Membuat objek Intent
                Intent intent = new Intent(MainActivity.this, DetailKontakActivity.class);
                // Mengirimkan data setiap atribut kontak
                intent.putExtra(EXTRA_KEY_NAMA, kontak.getNama());
                intent.putExtra(EXTRA_KEY_NO_TELEPON, kontak.getNoTelepon());
                intent.putExtra(EXTRA_KEY_EMAIL, kontak.getEmail());
                intent.putExtra(EXTRA_KEY_FOTO, kontak.getFoto());
                startActivity(intent);
            }
        });

        // TODO 21: Memasang adapter ke dalam RecyclerView
        rvKontak.setAdapter(kontakAdapter);
    }

    // TODO 17: Melakukan binding terhadap RecyclerView
    private void initLayout(){
        rvKontak = findViewById(R.id.rv_kontak);
    }
}