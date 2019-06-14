package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.Model.Document;

@Repository("docRepo")
public interface IDocumentRepository extends JpaRepository<Document, Long> {

}
