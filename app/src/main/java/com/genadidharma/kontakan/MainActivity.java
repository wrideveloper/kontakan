package com.genadidharma.kontakan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

// TODO 13: Mengimplementasikan Adapter pada RecyclerView
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

    // TODO 14: Mendeklarasikan variabel bertipe objek RecyclerView untuk di binding nantinya

    // TODO 15: Menginisialisasikan variabel bertipe objek List<Kontak> dan menmanggil method getKontakData() dari class KontakData untuk mengambil Data Kontaknya.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 17: Memanggil method initLayout

        // TODO 18:  Menentukan Layout Manager dari RecyclerViewnya. Karen dalam bentuk List, maka bisa menggunakan LinearLayoutManager

        // TODO 19:  Menginstansiasi Adapter yang sudah dibuat

        // TODO 20: Memasang adapter ke dalam RecyclerView
            // TODO 23: Membuat Intent Explicit dan mengirimkan setiap data pada objek Kontak

    }

    // TODO 16: Melakukan binding terhadap RecyclerView

}