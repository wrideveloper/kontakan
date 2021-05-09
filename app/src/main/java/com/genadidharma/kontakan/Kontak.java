package com.genadidharma.kontakan;

import androidx.annotation.DrawableRes;

public class Kontak {
    //TODO 1: Mendeklarasikan atribut-atribut pada Objek Kontak
    /*
    foto: int
    nama: String
    noTelepon: String
    email: String
    */
    private @DrawableRes int foto;
    private String nama;
    private String noTelepon;
    private String email;

    //TODO 2: Membuat Getter & Setter
    /*
    Getter: Method untuk mengambil data dari sebuah objek
    Setter: Method untuk mengisi data sebuah objek
    */
    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
