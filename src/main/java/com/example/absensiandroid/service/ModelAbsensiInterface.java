package com.example.absensiandroid.service;

import java.util.List;

import com.example.absensiandroid.entity.Absensi;

public interface ModelAbsensiInterface {
	public List<Absensi> getHistoryByName(String name);
	public String checkInAbsensi(Absensi absensi);
	public List<Absensi> checkOutAbsensi(String name);
}
