package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.Model.Tache;

public interface ITacheRepository extends JpaRepository<Tache, Long>{

	
}
