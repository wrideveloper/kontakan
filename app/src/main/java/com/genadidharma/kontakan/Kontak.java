package com.genadidharma.kontakan;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.DrawableRes;

public class Kontak implements Parcelable {
    private @DrawableRes int foto;
    private String nama;
    private String noTelepon;
    private String email;

    public Kontak(){

    }

    protected Kontak(Parcel in) {
        foto = in.readInt();
        nama = in.readString();
        noTelepon = in.readString();
        email = in.readString();
    }

    public static final Creator<Kontak> CREATOR = new Creator<Kontak>() {
        @Override
        public Kontak createFromParcel(Parcel in) {
            return new Kontak(in);
        }

        @Override
        public Kontak[] newArray(int size) {
            return new Kontak[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(foto);
        dest.writeString(nama);
        dest.writeString(noTelepon);
        dest.writeString(email);
    }
}
