package com.example.absensiandroid.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Responses implements Parcelable {
    @SerializedName("status")
    private int status;
    @SerializedName("message")
    private String message;
    @SerializedName("dataAbsensi")
    private ArrayList<Absensi> dataAbsensi;
    @SerializedName("dataLogin")
    private  ArrayList<Login> dataLogin;

    public Responses() {
    }

    public Responses(int status, String message, ArrayList<Absensi> dataAbsensi, ArrayList<Login> dataLogin) {
        this.status = status;
        this.message = message;
        this.dataAbsensi = dataAbsensi;
        this.dataLogin = dataLogin;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<Absensi> getDataAbsensi() {
        return dataAbsensi;
    }

    public void setDataAbsensi(ArrayList<Absensi> dataAbsensi) {
        this.dataAbsensi = dataAbsensi;
    }

    public ArrayList<Login> getDataLogin() {
        return dataLogin;
    }

    public void setDataLogin(ArrayList<Login> dataLogin) {
        this.dataLogin = dataLogin;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.status);
        dest.writeString(this.message);
        dest.writeTypedList(this.dataAbsensi);
        dest.writeTypedList(this.dataLogin);
    }

    public void readFromParcel(Parcel source) {
        this.status = source.readInt();
        this.message = source.readString();
        this.dataAbsensi = source.createTypedArrayList(Absensi.CREATOR);
        this.dataLogin = source.createTypedArrayList(Login.CREATOR);
    }

    protected Responses(Parcel in) {
        this.status = in.readInt();
        this.message = in.readString();
        this.dataAbsensi = in.createTypedArrayList(Absensi.CREATOR);
        this.dataLogin = in.createTypedArrayList(Login.CREATOR);
    }

    public static final Parcelable.Creator<Responses> CREATOR = new Parcelable.Creator<Responses>() {
        @Override
        public Responses createFromParcel(Parcel source) {
            return new Responses(source);
        }

        @Override
        public Responses[] newArray(int size) {
            return new Responses[size];
        }
    };
}