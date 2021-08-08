package com.example.absensiandroid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.absensiandroid.entity.Login;
import com.example.absensiandroid.service.ModelLogin;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	ModelLogin modelLogin;
	
	@GetMapping("/{name}&{pass}")
	public List<Login> loginAbsensi(@PathVariable String name, @PathVariable String pass) {
		return this.modelLogin.getByUsername(name, pass);
	}
}
