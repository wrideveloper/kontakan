package com.genadidharma.kontakan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_KEY_NAMA = "nama";
    public static final String EXTRA_KEY_NO_TELEPON = "no_telepon";
    public static final String EXTRA_KEY_EMAIL = "email";
    public static final String EXTRA_KEY_FOTO = "gambar";

    private RecyclerView rvKontak;

    private final List<Kontak> lisKontak = KontakData.getKontakData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLayout();

        rvKontak.setLayoutManager(new LinearLayoutManager(this));
        KontakAdapter kontakAdapter = new KontakAdapter(lisKontak, new OnItemClickListener() {
            @Override
            public void onItemClick(Kontak kontak) {
                Intent intent = new Intent(MainActivity.this, DetailKontakActivity.class);
                intent.putExtra(EXTRA_KEY_NAMA, kontak.getNama());
                intent.putExtra(EXTRA_KEY_NO_TELEPON, kontak.getNoTelepon());
                intent.putExtra(EXTRA_KEY_EMAIL, kontak.getEmail());
                intent.putExtra(EXTRA_KEY_FOTO, kontak.getFoto());
                startActivity(intent);
            }
        });
        rvKontak.setAdapter(kontakAdapter);
    }

    private void initLayout(){
        rvKontak = findViewById(R.id.rv_kontak);
    }
}