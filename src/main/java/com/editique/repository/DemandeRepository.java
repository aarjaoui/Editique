package com.editique.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.editique.entity.Demande;

public interface DemandeRepository extends CrudRepository<Demande, Long> {

	public List<Demande> findAll();

	public Demande save(Demande demande);

}
