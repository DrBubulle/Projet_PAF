package com.inti.formation;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inti.formation.Metier.AffaireMetier;
import com.inti.formation.Metier.DocumentMetier;
import com.inti.formation.Metier.PhaseMetier;
import com.inti.formation.Metier.TacheMetier;
import com.inti.formation.Metier.TribunalMetier;
import com.inti.formation.Metier.UtilisateurMetier;
import com.inti.formation.Model.Affaire;
import com.inti.formation.Model.Document;
import com.inti.formation.Model.Phase;
import com.inti.formation.Model.Tache;
import com.inti.formation.Model.Tribunal;
import com.inti.formation.Model.Utilisateur;


@SpringBootApplication
public class ProjetPafApplication implements CommandLineRunner {

	@Autowired
	private AffaireMetier affairemetier;
	@Autowired
	private DocumentMetier documentmetier;
	@Autowired
	private PhaseMetier phasemetier;
	@Autowired
	private TacheMetier tachemetier;
	@Autowired
	private TribunalMetier tribunalmetier;
	@Autowired
	private UtilisateurMetier utilisateurmetier;



	public static void main(String[] args) {
		SpringApplication.run(ProjetPafApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {




		Utilisateur u1 = new Utilisateur(100,"J.Donovan@avocat.com", "Donovan", "James");
		Utilisateur u2 = new Utilisateur(101,"M.Haller@avocat.fr", "Haller", "Mickey");
		Utilisateur u3 = new Utilisateur(102,"A.Mcbeal@avocat.fr", "McBeal", "Ally");
		Utilisateur u4 = new Utilisateur(103,"A.Florrick@avocat.fr", "Florrick", "Alicia");
		Utilisateur u5 = new Utilisateur(104,"H.Specter@avocat.fr", "Specter", "Harvey");
		Utilisateur u6 = new Utilisateur(105,"L.Litt@avocat.fr", "Litt", "Louis");
		Utilisateur u7 = new Utilisateur(106,"J.Pearson@avocat.fr", "Pearson", "Jessica");
		Utilisateur u8 = new Utilisateur(107,"K.Wexler@avocat.fr", "Wexler", "Kim");
		Utilisateur u9 = new Utilisateur(108,"J.McGill@avocat.fr", "McGill", "Jim");

		utilisateurmetier.ajouter(u1);
		utilisateurmetier.ajouter(u2);
		utilisateurmetier.ajouter(u3);
		utilisateurmetier.ajouter(u4);
		utilisateurmetier.ajouter(u5);
		utilisateurmetier.ajouter(u6);
		utilisateurmetier.ajouter(u7);
		utilisateurmetier.ajouter(u8);
		utilisateurmetier.ajouter(u9);

		

		Tache ta1 = new Tache("16/11/2018", "Tache 1", "description tache 1", true);
		Tache ta2 = new Tache("31/4/2017", "Tache 2", "description tache 2", false);
		Tache ta3 = new Tache("31/1/2018", "Tache 3", "description tache 3", false);
		Tache ta4 = new Tache("23/9/2015", "Tache 4", "description tache 4", true);
		Tache ta5 = new Tache("5/12/2017", "Tache 5", "description tache 5", true);
		Tache ta6 = new Tache("4/9/2017", "Tache 6", "description tache 6", true);
		Tache ta7 = new Tache("19/2/2018", "Tache 7", "description tache 7", false);
		Tache ta8 = new Tache("19/2/2018", "Tache 8", "description tache 8", false);
		Tache ta9 = new Tache("21/5/2016", "Tache 9", "description tache 9", true);

		tachemetier.ajouter(ta1);
		tachemetier.ajouter(ta2);
		tachemetier.ajouter(ta3);
		tachemetier.ajouter(ta4);
		tachemetier.ajouter(ta5);
		tachemetier.ajouter(ta6);
		tachemetier.ajouter(ta7);
		tachemetier.ajouter(ta8);
		tachemetier.ajouter(ta9);



		Affaire a1 = new Affaire("BBBBBB", "Affaire1", "X contre Y", 1);
		Affaire a2 = new Affaire("CCCCCC", "Affaire2", "Z contre état", 2);
		Affaire a3 = new Affaire("DDDDDD", "Affaire3", "Drogue", 1);
		Affaire a4 = new Affaire("FFFFFF", "Affaire4", "Accident", 2);
		Affaire a5 = new Affaire("GGGGGG", "Affaire5", "Drogue", 2);
		Affaire a6 = new Affaire("HHHHHH", "Affaire6", "Accident", 3);
		Affaire a7 = new Affaire("JJJJJJ", "Affaire7", "Drogue", 2);
		Affaire a8 = new Affaire("KKKKKK", "Affaire8", "Accident", 4);
		Affaire a9 = new Affaire("LLLLLL", "Affaire9", "Divorce", 5);
		
		affairemetier.ajouter(a1);
		affairemetier.ajouter(a2);
		affairemetier.ajouter(a3);
		affairemetier.ajouter(a4);
		affairemetier.ajouter(a5);
		affairemetier.ajouter(a6);
		affairemetier.ajouter(a7);
		affairemetier.ajouter(a8);
		affairemetier.ajouter(a9);
		
		

		Document d1 = new Document("25/10/2015", "Doc1", "description doc1");
		Document d2 = new Document("24/11/2017", "Doc2", "description doc2");
		Document d3 = new Document("21/7/2016", "Doc3", "description doc3");
		Document d4 = new Document("30/2/2017", "Doc4", "description doc4");
		Document d5 = new Document("15/2/2017", "Doc5", "description doc5");
		Document d6 = new Document("3/2/2015", "Doc6", "description doc6");
		Document d7 = new Document("7/10/2015", "Doc7", "description doc7");
		Document d8 = new Document("27/10/2019", "Doc8", "description doc8");
		Document d9 = new Document("27/9/2016", "Doc9", "description doc9");
		
		documentmetier.ajouter(d1);
		documentmetier.ajouter(d2);
		documentmetier.ajouter(d3);
		documentmetier.ajouter(d4);
		documentmetier.ajouter(d5);
		documentmetier.ajouter(d6);
		documentmetier.ajouter(d7);
		documentmetier.ajouter(d8);
		documentmetier.ajouter(d9);
		
		

		Tribunal tr1 = new Tribunal("Tribunal de commerce - 43-45 Rue du Fossé des Treize, 67000 Strasbourg", 115819290, 115819299, "Alsace");
		Tribunal tr2 = new Tribunal("Tribunal d'instance - 27 Rue Général Fabvier, 54000 Nancy", 384100758, 384100759, "Lorraine");
		Tribunal tr3 = new Tribunal("Tribunal de Grande Instance - 58 Grand Rue, 68000 Colmar", 229088806, 229088809, "Alsace");
		Tribunal tr4 = new Tribunal("Tribunal correctionnel -  Rue Haute Pierre, 57000 Metz", 286380454, 286380459, "Lorraine");
		Tribunal tr5 = new Tribunal("Tribunal de Police - 3 Rue Haute Pierre, 57000 Metz", 433598290, 433598299, "Lorraine");
		Tribunal tr6 = new Tribunal("Cour d'assises - 35 Rue Berthe Molly, 68000 Colmar", 302397075, 302397079, "Alsace");
		Tribunal tr7 = new Tribunal("cour d'appel - 201 Rue des Capucins, 51100 Reims", 374934733, 374934739, "Lorraine");
		Tribunal tr8 = new Tribunal("Cour de cassation - 5 quai de l’Horloge - TSA 70660 - 75055 PARIS CEDEX 01", 465824577, 465824579,  "‎Île-de-France‎");

		tribunalmetier.ajouter(tr1);
		tribunalmetier.ajouter(tr2);
		tribunalmetier.ajouter(tr3);
		tribunalmetier.ajouter(tr4);
		tribunalmetier.ajouter(tr5);
		tribunalmetier.ajouter(tr6);
		tribunalmetier.ajouter(tr7);
		tribunalmetier.ajouter(tr8);
	
		
		
		Phase p1 = new Phase("Phase 1", "31/11/2017", "16/1/2018");
		Phase p2 = new Phase("Phase 2", "4/11/2017", "25/7/2018");
		Phase p3 = new Phase("Phase 3", "21/11/2015", "4/8/2017");
		Phase p4 = new Phase("Phase 4", "29/7/2016", "24/6/2017");
		Phase p5 = new Phase("Phase 5", "29/2/2016", "1/7/2016");
		Phase p6 = new Phase("Phase 6", "20/8/2017", "24/11/2018");
		Phase p7 = new Phase("Phase 7", "29/1/2017", "19/10/2018");
		Phase p8 = new Phase("Phase 8", "5/9/2015", "1/12/2017");
		Phase p9 = new Phase("Phase 9", "2/9/2015", "7/9/2016");

		phasemetier.ajouter(p1);
		phasemetier.ajouter(p2);
		phasemetier.ajouter(p3);
		phasemetier.ajouter(p4);
		phasemetier.ajouter(p5);
		phasemetier.ajouter(p6);
		phasemetier.ajouter(p7);
		phasemetier.ajouter(p8);
		phasemetier.ajouter(p9);
		
//////////////////////////////////////////////////
		List<Tache> listTaUt1= new ArrayList<Tache>();
		listTaUt1.add(ta1);
		listTaUt1.add(ta2);
		listTaUt1.add(ta3);
		listTaUt1.add(ta4);
		listTaUt1.add(ta5);
		listTaUt1.add(ta6);
		listTaUt1.add(ta7);
		listTaUt1.add(ta8);
		List<Tache> listTaUt2= new ArrayList<Tache>();
		listTaUt2.add(ta1);
		listTaUt2.add(ta2);
		listTaUt2.add(ta3);
		listTaUt2.add(ta4);
		List<Tache> listTaUt3= new ArrayList<Tache>();
		listTaUt3.add(ta5);
		listTaUt3.add(ta6);
		listTaUt3.add(ta7);
		listTaUt3.add(ta8);
		List<Tache> listTaUt4= new ArrayList<Tache>();
		listTaUt4.add(ta1);
		List<Tache> listTaUt5= new ArrayList<Tache>();
		listTaUt5.add(ta1);
		listTaUt5.add(ta2);
		List<Tache> listTaUt6= new ArrayList<Tache>();
		listTaUt6.add(ta3);
		listTaUt6.add(ta4);
		List<Tache> listTaUt7= new ArrayList<Tache>();
		listTaUt7.add(ta6);
		listTaUt7.add(ta7);
		List<Tache> listTaUt8= new ArrayList<Tache>();
		listTaUt8.add(ta8);
		List<Tache> listTaUt9= new ArrayList<Tache>();
		listTaUt9.add(ta9);
		
		
		u1.setTaches(listTaUt1);
		utilisateurmetier.update(u1);
		u2.setTaches(listTaUt2);
		utilisateurmetier.update(u2);
		u3.setTaches(listTaUt3);
		utilisateurmetier.update(u3);
		u4.setTaches(listTaUt4);
		utilisateurmetier.update(u4);
		u5.setTaches(listTaUt5);
		utilisateurmetier.update(u5);
		u6.setTaches(listTaUt6);
		utilisateurmetier.update(u6);
		u7.setTaches(listTaUt7);
		utilisateurmetier.update(u7);
		u8.setTaches(listTaUt8);
		utilisateurmetier.update(u8);
		u9.setTaches(listTaUt9);
		utilisateurmetier.update(u9);
		
		List<Tache> listTaAf1= new ArrayList<Tache>();
		listTaAf1.add(ta1);
		listTaAf1.add(ta2);
		List<Tache> listTaAf2= new ArrayList<Tache>();
		listTaAf2.add(ta3);
		List<Tache> listTaAf3= new ArrayList<Tache>();
		listTaAf3.add(ta4);
		List<Tache> listTaAf4= new ArrayList<Tache>();
		listTaAf4.add(ta5);
		List<Tache> listTaAf5= new ArrayList<Tache>();
		listTaAf5.add(ta6);
		List<Tache> listTaAf6= new ArrayList<Tache>();
		listTaAf6.add(ta7);
		listTaAf6.add(ta8);
		listTaAf6.add(ta9);
		List<Tache> listTaAf7= new ArrayList<Tache>();
		List<Tache> listTaAf8= new ArrayList<Tache>();
		List<Tache> listTaAf9= new ArrayList<Tache>();
		
		
		a1.setTaches(listTaAf1);
		affairemetier.update(a1);
		a2.setTaches(listTaAf2);
		affairemetier.update(a2);
		a3.setTaches(listTaAf3);
		affairemetier.update(a3);
		a4.setTaches(listTaAf4);
		affairemetier.update(a4);
		a5.setTaches(listTaAf5);
		affairemetier.update(a5);
		a6.setTaches(listTaAf6);
		affairemetier.update(a6);
		a7.setTaches(listTaAf7);
		affairemetier.update(a7);
		a8.setTaches(listTaAf8);
		affairemetier.update(a8);
		a9.setTaches(listTaAf9);
		affairemetier.update(a9);
		
		
		List<Tache> listTaTr1= new ArrayList<Tache>();
		listTaTr1.add(ta1);
		listTaTr1.add(ta2);
		listTaTr1.add(ta3);
		listTaTr1.add(ta4);
		List<Tache> listTaTr2= new ArrayList<Tache>();
		listTaTr1.add(ta5);
		listTaTr1.add(ta6);
		List<Tache> listTaTr3= new ArrayList<Tache>();
		listTaTr1.add(ta7);
		List<Tache> listTaTr4= new ArrayList<Tache>();
		listTaTr1.add(ta8);
		List<Tache> listTaTr5= new ArrayList<Tache>();
		listTaTr1.add(ta9);
		List<Tache> listTaTr6= new ArrayList<Tache>();
		List<Tache> listTaTr7= new ArrayList<Tache>();
		List<Tache> listTaTr8= new ArrayList<Tache>();
		
		tr1.setTaches(listTaTr1);
		tribunalmetier.update(tr1);
		tr2.setTaches(listTaTr2);
		tribunalmetier.update(tr2);
		tr3.setTaches(listTaTr3);
		tribunalmetier.update(tr3);
		tr4.setTaches(listTaTr4);
		tribunalmetier.update(tr4);
		tr5.setTaches(listTaTr5);
		tribunalmetier.update(tr5);
		tr6.setTaches(listTaTr6);
		tribunalmetier.update(tr6);
		tr7.setTaches(listTaTr7);
		tribunalmetier.update(tr7);
		tr8.setTaches(listTaTr8);
		tribunalmetier.update(tr8);
		
		
		
		List<Phase> listPhTa1= new ArrayList<Phase>();
		listPhTa1.add(p1);
		List<Phase> listPhTa2= new ArrayList<Phase>();
		listPhTa1.add(p2);
		listPhTa1.add(p3);
		listPhTa1.add(p4);
		List<Phase> listPhTa3= new ArrayList<Phase>();
		listPhTa1.add(p5);
		listPhTa1.add(p6);
		List<Phase> listPhTa4= new ArrayList<Phase>();
		listPhTa1.add(p7);
		List<Phase> listPhTa5= new ArrayList<Phase>();
		listPhTa1.add(p8);
		List<Phase> listPhTa6= new ArrayList<Phase>();
		listPhTa1.add(p9);
		List<Phase> listPhTa7= new ArrayList<Phase>();
		List<Phase> listPhTa8= new ArrayList<Phase>();
		List<Phase> listPhTa9= new ArrayList<Phase>();
		
		ta1.setPhases(listPhTa1);
		tachemetier.update(ta1);
		ta2.setPhases(listPhTa2);
		tachemetier.update(ta2);
		ta3.setPhases(listPhTa3);
		tachemetier.update(ta3);
		ta4.setPhases(listPhTa4);
		tachemetier.update(ta4);
		ta5.setPhases(listPhTa5);
		tachemetier.update(ta5);
		ta6.setPhases(listPhTa6);
		tachemetier.update(ta6);
		ta7.setPhases(listPhTa7);
		tachemetier.update(ta7);
		ta8.setPhases(listPhTa8);
		tachemetier.update(ta8);
		ta9.setPhases(listPhTa9);
		tachemetier.update(ta9);
		
		
		
		List<Document> listDoAf1= new ArrayList<Document>();
		listDoAf1.add(d1);
		listDoAf1.add(d2);
		listDoAf1.add(d3);
		List<Document> listDoAf2= new ArrayList<Document>();
		listDoAf2.add(d4);
		listDoAf2.add(d5);
		List<Document> listDoAf3= new ArrayList<Document>();
		listDoAf3.add(d6);
		List<Document> listDoAf4= new ArrayList<Document>();
		listDoAf4.add(d7);
		List<Document> listDoAf5= new ArrayList<Document>();
		listDoAf5.add(d8);
		List<Document> listDoAf6= new ArrayList<Document>();
		listDoAf6.add(d9);
		List<Document> listDoAf7= new ArrayList<Document>();
		List<Document> listDoAf8= new ArrayList<Document>();
		List<Document> listDoAf9= new ArrayList<Document>();
				
		a1.setDocuments(listDoAf1);
		affairemetier.update(a1);
		a2.setDocuments(listDoAf2);
		affairemetier.update(a2);
		a3.setDocuments(listDoAf3);
		affairemetier.update(a3);
		a4.setDocuments(listDoAf4);
		affairemetier.update(a4);
		a5.setDocuments(listDoAf5);
		affairemetier.update(a5);
		a6.setDocuments(listDoAf6);
		affairemetier.update(a6);
		a7.setDocuments(listDoAf7);
		affairemetier.update(a7);
		a8.setDocuments(listDoAf8);
		affairemetier.update(a8);
		a9.setDocuments(listDoAf9);
		affairemetier.update(a9);
	
		
		
		
		
	ta1.setAffaire(a1);
	ta2.setAffaire(a2);
	ta3.setAffaire(a3);
	ta4.setAffaire(a4);
	ta5.setAffaire(a5);
	ta6.setAffaire(a6);
	ta7.setAffaire(a7);
	ta8.setAffaire(a8);
	ta9.setAffaire(a9);
	
	ta1.setTribunal(tr1);
	ta2.setTribunal(tr2);
	ta3.setTribunal(tr3);
	ta4.setTribunal(tr4);
	ta5.setTribunal(tr5);
	ta6.setTribunal(tr6);
	ta7.setTribunal(tr7);
	ta8.setTribunal(tr8);
	ta9.setTribunal(tr1);
	tachemetier.update(ta1);
	tachemetier.update(ta2);
	tachemetier.update(ta3);
	tachemetier.update(ta4);
	tachemetier.update(ta5);
	tachemetier.update(ta6);
	tachemetier.update(ta7);
	tachemetier.update(ta8);
	tachemetier.update(ta9);
	

	p1.setTache(ta1);
	p2.setTache(ta2);
	p3.setTache(ta3);
	p4.setTache(ta4);
	p5.setTache(ta5);
	p6.setTache(ta6);
	p7.setTache(ta7);
	p8.setTache(ta8);
	p9.setTache(ta9);
	phasemetier.update(p1);
	phasemetier.update(p2);
	phasemetier.update(p3);
	phasemetier.update(p4);
	phasemetier.update(p5);
	phasemetier.update(p6);
	phasemetier.update(p7);
	phasemetier.update(p8);
	phasemetier.update(p9);
	
	d1.setAffaire(a1);
	d2.setAffaire(a2);
	d3.setAffaire(a3);
	d4.setAffaire(a4);
	d5.setAffaire(a5);
	d6.setAffaire(a6);
	d7.setAffaire(a7);
	d8.setAffaire(a8);
	d9.setAffaire(a9);
	documentmetier.update(d1);
	documentmetier.update(d2);
	documentmetier.update(d3);
	documentmetier.update(d4);
	documentmetier.update(d5);
	documentmetier.update(d6);
	documentmetier.update(d7);
	documentmetier.update(d8);
	documentmetier.update(d9);
		
	
	}



}
