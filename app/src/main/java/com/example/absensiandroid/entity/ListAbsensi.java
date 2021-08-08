package com.example.absensiandroid.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class ListAbsensi implements Parcelable {
    private ArrayList<Absensi> absensis;

    public ListAbsensi() {
    }

    public ListAbsensi(ArrayList<Absensi> absensis) {
        this.absensis = absensis;
    }

    public ArrayList<Absensi> getAbsensis() {
        return absensis;
    }

    public void setAbsensis(ArrayList<Absensi> absensis) {
        this.absensis = absensis;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.absensis);
    }

    public void readFromParcel(Parcel source) {
        this.absensis = source.createTypedArrayList(Absensi.CREATOR);
    }

    protected ListAbsensi(Parcel in) {
        this.absensis = in.createTypedArrayList(Absensi.CREATOR);
    }

    public static final Parcelable.Creator<ListAbsensi> CREATOR = new Parcelable.Creator<ListAbsensi>() {
        @Override
        public ListAbsensi createFromParcel(Parcel source) {
            return new ListAbsensi(source);
        }

        @Override
        public ListAbsensi[] newArray(int size) {
            return new ListAbsensi[size];
        }
    };
}
