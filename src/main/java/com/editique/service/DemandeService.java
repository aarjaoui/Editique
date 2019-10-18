package com.editique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.editique.entity.Demande;
import com.editique.repository.DemandeRepository;

@Service
public class DemandeService {

	@Autowired
	private DemandeRepository repository;

	public Demande save(Demande demande) {
		return repository.save(demande);
	}

	public List<Demande> findAll() {
		return (List<Demande>) repository.findAll();
	}

}
