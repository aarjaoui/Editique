package com.editique.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.editique.entity.Demande;
import com.editique.service.DemandeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/editique")
public class DemandeController {

	public static Logger logger = LoggerFactory.getLogger(DemandeController.class);

	@Autowired
	private DemandeService service;

	@RequestMapping("/addDemande")
	@PostMapping
	public Demande save(@RequestBody Demande demande) {
		return service.save(demande);
	}

	@GetMapping
	@RequestMapping("/demandes")
	public List<Demande> findAll() {
		return service.findAll();
	}

}
