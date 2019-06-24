package com.inti.formation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.IMetier.IDocumentMetier;
import com.inti.formation.Model.Document;


@RestController
@CrossOrigin("*")
@RequestMapping("/apiDocument")
public class DocumentRestController {

	@Autowired
	private IDocumentMetier metier;

	public IDocumentMetier getMetier() {
		return metier;
	}

	public void setMetier(IDocumentMetier metier) {
		this.metier = metier;
	}
	@RequestMapping(value="/ajouterDoc", method=RequestMethod.POST)
	public Document ajouter (@RequestBody Document d) {
		return metier.ajouter(d);
			}
	
	@RequestMapping(value="/updateDoc", method=RequestMethod.PUT)
	public Document update(@RequestBody Document d) {
		return metier.update(d);
	}
	@RequestMapping(value="deleteDoc/{idDocument}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("idDocument")long idDocument) {
		metier.delete(idDocument);
	}
	
	@RequestMapping(value="/document/{idDocument}",method=RequestMethod.GET)
	public Document findOne (@PathVariable("idDocument")long idDocument) {
		return metier.findOne(idDocument);
	}
	
	@RequestMapping(value="/documents", method=RequestMethod.GET)
	public List<Document> findAll(){
		return metier.findAll();
	}

	
	
}
