package com.example.absensiandroid.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.absensiandroid.entity.Absensi;

public interface AbsensiRepository extends JpaRepository<Absensi, Long> {
	@Query(value = "SELECT * FROM absensi WHERE username LIKE %?1%", nativeQuery = true)
	List<Absensi> findHistoryByUsername(String name);
	
	@Query()
	List<Absensi> findTanggalKeluarByUsername(String name);
}
