package com.example.absensiandroid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.absensiandroid.entity.Absensi;
import com.example.absensiandroid.repository.AbsensiRepository;

@Service
public class ModelAbsensi implements ModelAbsensiInterface {

	@Autowired
	AbsensiRepository absensiRepository;

	@Override
	public List<Absensi> getHistoryByName(String name) {
		// TODO Auto-generated method stub
		return this.absensiRepository.findHistoryByUsername(name);
	}

	@Override
	public String checkInAbsensi(Absensi absensi) {
		// TODO Auto-generated method stub
		this.absensiRepository.save(absensi);
		return "Berhasil check in";
	}

	@Override
	public List<Absensi> checkOutAbsensi(String name) {
		// TODO Auto-generated method stub
		return this.absensiRepository.findTanggalKeluarByUsername(name);
	}

}
