package com.genadidharma.kontakan;

import java.util.ArrayList;
import java.util.List;

public class KontakData {
    //TODO 3: Membuat 10 data untuk mengisi atribut
    /*
    Masing-masing atribut(foto, nama, noTelepon, email) harus diinisalisasikan datanya terlebih dahulu
    menggunakan Array masing-masing sebanyak 10.
    */
    private static final int[] foto = {
            R.drawable.brian_lowe,
            R.drawable.dean_robertson,
            R.drawable.jed_pope,
            R.drawable.julia_fox,
            R.drawable.nelson_goodman,
            R.drawable.priscilla_baker,
            R.drawable.selena_brooks,
            R.drawable.stewart_gill,
            R.drawable.troy_newman,
            R.drawable.wilda_green
    };

    private static final String[] nama = {
            "Brian Lowe",
            "Dean Robertson",
            "Jed Pope",
            "Julia Fox",
            "Nelson Goodman",
            "Priscilla Baker",
            "Selena Brooks",
            "Stewart Gill",
            "Troy Newman",
            "Wilda Green"
    };

    private static final String[] noTelepon = {
            "+62 827-314-390",
            "+62 885-7245-79170",
            "+62 818-937-619",
            "+62 877-1881-2746",
            "+62 829-5160-65544",
            "+62 839-191-933",
            "+62 832-995-456",
            "+62 860-1391-90978",
            "+62 819-8485-242",
            "+62 892-0499-694"
    };

    private static final String[] email = {
            "brianlowe@gmail.com",
            "deanrobertson@gmail.com",
            "jedpope@gmail.com",
            "juliafox@gmail.com",
            "nelsongoodman@gmail.com",
            "priscillabaker@gmail.com",
            "selenabrooks@gmail.com",
            "stewartgill@gmail.com",
            "troynewman@gmail.com",
            "wildagreen@gmail.com"
    };

    // TODO 4: Membuat method untuk membuat objek kontak dan menyimpan ke dalam List
    // Method mengembalikan nilai bertipe List<Kontak>
    public static List<Kontak> getKontakData() {
        // Mendeklarasikan varibel ArrayList berjenis Kontak
        ArrayList<Kontak> listKontak = new ArrayList<>();
        // Melakukan perulangan sebanyak jumlah data(10 kali)
        for (int i = 0; i < nama.length; i++) {
            // Membuat objek Kontak
            Kontak kontak = new Kontak();
            // Mengisi data setiap atribut menggunakan setter()
            kontak.setFoto(foto[i]);
            kontak.setNama(nama[i]);
            kontak.setNoTelepon(noTelepon[i]);
            kontak.setEmail(email[i]);

            // Menambahkan objek kontak ke dalam ArrayList Kontak
            listKontak.add(kontak);
        }
        // Mengembalikan nilai ArrayList Kontak
        return listKontak;
    }
}
