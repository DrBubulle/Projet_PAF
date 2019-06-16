package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.Model.Phase;

@Repository("phRepo")
public interface IPhaseRepository extends JpaRepository<Phase, Long> {

}
