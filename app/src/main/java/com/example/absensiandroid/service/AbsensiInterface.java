package com.example.absensiandroid.service;

import com.example.absensiandroid.entity.Responses;

import java.util.ArrayList;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface AbsensiInterface {
    @Multipart
    @POST("/absensi/checkin")
    Call<Responses> checkInAbsensi(@Part MultipartBody.Part file, @Part("dataAbsensi") RequestBody dataAbsensi);

    @PUT("/absensi/checkout/{name}")
    Call<Responses> checkOutAbsensi(@Part("name") String name);

    @GET("/absensi/history/{name}")
    Call<Responses> getHistoryByName(@Part("name") String name);
}
