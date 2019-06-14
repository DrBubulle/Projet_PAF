package com.inti.formation.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.inti.formation.IMetier.IDocumentMetier;
import com.inti.formation.Model.Document;
import com.inti.formation.repository.IDocumentRepository;

@Service
public class DocumentMetier implements IDocumentMetier{

	@Autowired
	@Qualifier("docRepo")
	private IDocumentRepository docRepo;
	
	
	public IDocumentRepository getDocRepo() {
		return docRepo;
	}

	public void setDocRepo(IDocumentRepository docRepo) {
		this.docRepo = docRepo;
	}

	@Override
	public Document ajouter(Document a) {
		
		return docRepo.save(a);
	}

	@Override
	public Document update(Document a) {
		
		return docRepo.save(a);
	}

	@Override
	public void delete(Long idDocument) {
		docRepo.deleteById(idDocument);
		
	}

	@Override
	public Document findOne(Long idDocument) {
		
		return docRepo.getOne(idDocument);
	}

	@Override
	public List<Document> findAll() {
		
		return docRepo.findAll() ;
	}

}
