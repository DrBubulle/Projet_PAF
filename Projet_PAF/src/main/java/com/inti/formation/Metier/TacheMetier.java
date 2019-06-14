package com.inti.formation.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.IMetier.ITacheMetier;
import com.inti.formation.Model.Tache;
import com.inti.formation.repository.ITacheRepository;

@Service
public class TacheMetier implements ITacheMetier {

	@Autowired
	private ITacheRepository tacherepo;
	
//	get et set du repository
	
	public ITacheRepository getTacherepo() {
		return tacherepo;
	}

	public void setTacherepo(ITacheRepository tacherepo) {
		this.tacherepo = tacherepo;
	}

//	méthodes implémentées
	
	
	public Tache ajouter(Tache a) {
		
		return tacherepo.save(a);
	}

	
	public Tache update(Tache a) {
		
		return tacherepo.save(a);
	}

	
	public void delete(Long id) {
		
		tacherepo.deleteById(id);
				
	}

	
	public Tache findOne(Long id) {
		
		return tacherepo.getOne(id);
	}

	
	public List<Tache> findAll() {
		
		return tacherepo.findAll();
	}

}
