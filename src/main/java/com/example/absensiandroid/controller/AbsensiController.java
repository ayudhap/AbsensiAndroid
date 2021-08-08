package com.example.absensiandroid.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.absensiandroid.entity.Absensi;
import com.example.absensiandroid.entity.Response;
import com.example.absensiandroid.service.ModelAbsensi;
import com.example.absensiandroid.utility.FileUtility;
import com.google.gson.Gson;

@RestController
@RequestMapping("/absensi")
public class AbsensiController {

	@Autowired
	ModelAbsensi modelAbsensi;

	@PostMapping("/checkin")
	public ResponseEntity<Response> checkInAbsensi(@RequestParam("file") MultipartFile file,
			@ModelAttribute("data") String dataJSON) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		
		String uploadDir = "src/main/java/user-photos/";
		try {
			FileUtility.saveFile(uploadDir, fileName, file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		FileUtility.saveFile(uploadDir, fileName, file);
		Absensi absensi = new Gson().fromJson(dataJSON, Absensi.class);
		absensi.setDataFoto(uploadDir);

		Response response = new Response<>();
		response.setStatus(200);
		response.setMessage("Berhasil check in");
		response.setData(this.modelAbsensi.checkInAbsensi(absensi));
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(response);
	
	}
	
//	@GetMapping(value = "/image/{name}", produces = MediaType.IMAGE_JPEG_VALUE)
//	public @ResponseBody byte[] getImageWithMediaType(@PathVariable String name) throws IOException {
//		final InputStream in = getClass().getResourceAsStream("/user-photos/" + name);
//		return IOUtils.toByteArray(in);
//	}

	@PutMapping("/checkout/{name}")
	public ResponseEntity<Response> checkOutAbsensi(String name) {
		Response response = new Response<>();
		response.setStatus(200);
		response.setMessage("Berhasil check out");
		response.setData(this.modelAbsensi.checkOutAbsensi(name));
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(response);
	}

	@GetMapping("/history/{name}")
	public List<Absensi> getHistoryByName(@PathVariable String name) {
		return this.modelAbsensi.getHistoryByName(name);
	}

}
