package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.Model.Affaire;

@Repository("afRepo")
public interface IAffaireRepository extends JpaRepository<Affaire, Long> {

}
