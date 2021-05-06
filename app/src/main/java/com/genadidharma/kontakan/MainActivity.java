package com.genadidharma.kontakan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

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

            }
        });
        rvKontak.setAdapter(kontakAdapter);
    }

    private void initLayout(){
        rvKontak = findViewById(R.id.rv_kontak);
    }
}