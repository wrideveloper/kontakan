package com.genadidharma.kontakan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

// TODO 23: Menampilkan data hasil dari Intent Explicit
/*
Beberapa langkah yang dilakukan:
- Melakukan binding terhadap komponen dari activity_detail_main.xml
- Mengambil data dari Intent Explicit dan memasukan ke dalam variabel sesuai atribut pada objek Kontak
- Mengisi data-data ke dalam komponen layout
*/
public class DetailKontakActivity extends AppCompatActivity {
    // TODO 24: Mendeklarasikan data-data yang dikirmkan oleh Intent Explicit

    // TODO 25: Mendeklarasikan komponen pada activity_detail_kontak.xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kontak);

        // TODO 28: Panggil method initLayout

        // TODO 29: Panggil method getIntentExtra


        //TODO 30: Mengisi data-data ke dalam komponen layout

    }

    // TODO 26: Melakukan binding terhadap komponen layout


    // TODO 27: Mengambil semua data kiriman Intent Explicit dan menyimpannya ke variabel

}