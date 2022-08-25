package com.example.demo.controller;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TestController {
	
	@NonNull
	private String cognome;
	
	private final String TOKEN = "TOKEN";
	
	@GetMapping("/getTest")
	public String getSaluto(@RequestParam Integer token) {
		DatiAnagrafici dati = new DatiAnagrafici();
		dati.setCognome(this.cognome);
		dati.setIndirizzo("via garibaldi 153");
		dati.setNome("pippo");
		dati.setEta(19);
		Integer localToken = 3845842;
		if (localToken == token) {
			return this.TOKEN + localToken;
		}
		System.out.println(token);
		
		return this.TOKEN + token + dati.toString();
	}

}
