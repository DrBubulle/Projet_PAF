package com.inti.formation;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");

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

		

		Tache ta1 = new Tache("16/11/2019", "Tache 1", "description tache 1", true);
		Tache ta2 = new Tache("31/04/2019", "Tache 2", "description tache 2", false);
		Tache ta3 = new Tache("31/01/2019", "Tache 3", "description tache 3", false);
		Tache ta4 = new Tache("23/09/2015", "Tache 4", "description tache 4", true);
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
	
		Date date1 = new Date(2019, 06, 25);
		Date date2 = new Date(2019, 06, 26);
		Date date3 = new Date(2019, 06, 27);
		Date date4 = new Date(2019, 06, 28);
		
		Phase p1 = new Phase("Phase 1", date1, "16/1/2018");
		Phase p2 = new Phase("Phase 2", date2, "25/7/2018");
		Phase p3 = new Phase("Phase 3", date3, "4/8/2017");
		Phase p4 = new Phase("Phase 4", date4, "24/6/2017");
		Phase p5 = new Phase("Phase 5", date1, "1/7/2016");
		Phase p6 = new Phase("Phase 6", date2, "24/11/2018");
		Phase p7 = new Phase("Phase 7", date3, "19/10/2018");
		Phase p8 = new Phase("Phase 8", date4, "1/12/2017");
		Phase p9 = new Phase("Phase 9", date1, "7/9/2016");
		Phase p10 = new Phase("Phase 10", date2, "16/1/2018");
		Phase p11 = new Phase("Phase 11", date3, "25/7/2018");
		Phase p12 = new Phase("Phase 12", date4, "4/8/2017");
		Phase p13 = new Phase("Phase 13", date1, "24/6/2017");
		Phase p14 = new Phase("Phase  14", date2, "1/7/2016");
		Phase p15 = new Phase("Phase 15", date3, "24/11/2018");
		Phase p16 = new Phase("Phase 16", date4, "19/10/2018");
		Phase p17 = new Phase("Phase 17", date1, "1/12/2017");
		Phase p18 = new Phase("Phase 18", date2, "7/9/2016");

		phasemetier.ajouter(p1);
		phasemetier.ajouter(p2);
		phasemetier.ajouter(p3);
		phasemetier.ajouter(p4);
		phasemetier.ajouter(p5);
		phasemetier.ajouter(p6);
		phasemetier.ajouter(p7);
		phasemetier.ajouter(p8);
		phasemetier.ajouter(p9);
		phasemetier.ajouter(p10);
		phasemetier.ajouter(p11);
		phasemetier.ajouter(p12);
		phasemetier.ajouter(p13);
		phasemetier.ajouter(p14);
		phasemetier.ajouter(p15);
		phasemetier.ajouter(p16);
		phasemetier.ajouter(p17);
		phasemetier.ajouter(p18);
		
//////////////////////////////////////////////////
		
		ta1 = tachemetier.findOne((long) 1);
		ta2 = tachemetier.findOne((long) 2);
		System.out.println("//////////////////////////////////////////////////////////////////////////////////");
		System.out.println(ta2);
		System.out.println("//////////////////////////////////////////////////////////////////////////////////");
		ta3 = tachemetier.findOne((long) 3);
		ta4 = tachemetier.findOne((long) 4);
		ta5 = tachemetier.findOne((long) 5);
		ta6 = tachemetier.findOne((long) 6);
		ta7 = tachemetier.findOne((long) 7);
		ta8 = tachemetier.findOne((long) 8);
		ta9 = tachemetier.findOne((long) 9);	
		
		List<Tache> listTaUt20= new ArrayList<Tache>();
		listTaUt20.add(ta1);
		listTaUt20.add(ta2);
		listTaUt20.add(ta3);
		List<Tache> listTaUt15 = new ArrayList<Tache>();
		listTaUt15.add(ta1);
		listTaUt15.add(ta2);
		listTaUt15.add(ta3);
		listTaUt15.add(ta4);
		listTaUt15.add(ta5);
		
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
		listTaUt4.add(ta9);
		List<Tache> listTaUt5= new ArrayList<Tache>();
		listTaUt5.add(ta1);
		listTaUt5.add(ta2);
		List<Tache> listTaUt6= new ArrayList<Tache>();
		listTaUt6.add(ta3);
		listTaUt6.add(ta4);
		List<Tache> listTaUt7= new ArrayList<Tache>();
		listTaUt7.add(ta5);
		listTaUt7.add(ta6);
		List<Tache> listTaUt8= new ArrayList<Tache>();
		listTaUt8.add(ta7);
		List<Tache> listTaUt9= new ArrayList<Tache>();
		listTaUt9.add(ta8);
		
		u1 = utilisateurmetier.findOne((long) 1);
		u2 = utilisateurmetier.findOne((long) 2);
		u3 = utilisateurmetier.findOne((long) 3);
		u4 = utilisateurmetier.findOne((long) 4);
		u5 = utilisateurmetier.findOne((long) 5);
		u6 = utilisateurmetier.findOne((long) 6);
		u7 = utilisateurmetier.findOne((long) 7);
		u8 = utilisateurmetier.findOne((long) 7);
		u9 = utilisateurmetier.findOne((long) 9);		
		
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
		
		a1 = affairemetier.findOne((long) 10);
		a2 = affairemetier.findOne((long) 11);
		a3 = affairemetier.findOne((long) 12);
		a4 = affairemetier.findOne((long) 13);
		a5 = affairemetier.findOne((long) 14);
		a6 = affairemetier.findOne((long) 15);
		a7 = affairemetier.findOne((long) 16);
		a8 = affairemetier.findOne((long) 17);
		a9 = affairemetier.findOne((long) 18);
		
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
		
		tr1 = tribunalmetier.findOne((long) 28);
		tr2 = tribunalmetier.findOne((long) 29);
		tr3 = tribunalmetier.findOne((long) 30);
		tr4 = tribunalmetier.findOne((long) 31);
		tr5 = tribunalmetier.findOne((long) 32);
		tr6 = tribunalmetier.findOne((long) 33);
		tr7 = tribunalmetier.findOne((long) 34);
		tr8 = tribunalmetier.findOne((long) 35);

		
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
		
		p1 = phasemetier.findOne((long) 36);
		p2 = phasemetier.findOne((long) 37);
		p3 = phasemetier.findOne((long) 38);
		p4 = phasemetier.findOne((long) 39);
		p5 = phasemetier.findOne((long) 40);
		p6 = phasemetier.findOne((long) 41);
		p7 = phasemetier.findOne((long) 42);
		p8 = phasemetier.findOne((long) 43);
		p9 = phasemetier.findOne((long) 44);
		p10 = phasemetier.findOne((long) 45);
		p11 = phasemetier.findOne((long) 46);
		p12 = phasemetier.findOne((long) 47);
		p13 = phasemetier.findOne((long) 48);
		p14 = phasemetier.findOne((long) 49);
		p15 = phasemetier.findOne((long) 50);
		p16 = phasemetier.findOne((long) 51);
		p17 = phasemetier.findOne((long) 52);
		p18 = phasemetier.findOne((long) 53);
		
		
		
//		List<Phase> listPhTa1= new ArrayList<Phase>();
//		listPhTa1.add(p1);
//		listPhTa1.add(p18);
//		listPhTa1.add(p17);
//		List<Phase> listPhTa2= new ArrayList<Phase>();
//		listPhTa1.add(p2);
//		listPhTa1.add(p3);
//		listPhTa1.add(p4);
//		List<Phase> listPhTa3= new ArrayList<Phase>();
//		listPhTa1.add(p5);
//		listPhTa1.add(p6);
//		List<Phase> listPhTa4= new ArrayList<Phase>();
//		listPhTa1.add(p7);
//		List<Phase> listPhTa5= new ArrayList<Phase>();
//		listPhTa1.add(p8);
//		List<Phase> listPhTa6= new ArrayList<Phase>();
//		listPhTa1.add(p9);
//		listPhTa1.add(p11);
//		List<Phase> listPhTa7= new ArrayList<Phase>();
//		listPhTa1.add(p12);
//		listPhTa1.add(p13);
//		List<Phase> listPhTa8= new ArrayList<Phase>();
//		listPhTa1.add(p14);
//		listPhTa1.add(p15);
//		List<Phase> listPhTa9= new ArrayList<Phase>();
//		listPhTa1.add(p16);
		
//		ta1.setPhases(listPhTa1);
//		tachemetier.update(ta1);
//		ta2.setPhases(listPhTa2);
//		tachemetier.update(ta2);
//		ta3.setPhases(listPhTa3);
//		tachemetier.update(ta3);
//		ta4.setPhases(listPhTa4);
//		tachemetier.update(ta4);
//		ta5.setPhases(listPhTa5);
//		tachemetier.update(ta5);
//		ta6.setPhases(listPhTa6);
//		tachemetier.update(ta6);
//		ta7.setPhases(listPhTa7);
//		tachemetier.update(ta7);
//		ta8.setPhases(listPhTa8);
//		tachemetier.update(ta8);
//		ta9.setPhases(listPhTa9);
//		tachemetier.update(ta9);
		
		
		
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
	p10.setTache(ta1);
	p11.setTache(ta2);
	p12.setTache(ta3);
	p13.setTache(ta4);
	p14.setTache(ta5);
	p15.setTache(ta6);
	p16.setTache(ta7);
	p17.setTache(ta8);
	p18.setTache(ta9);
	
	phasemetier.update(p1);
	phasemetier.update(p2);
	phasemetier.update(p3);
	phasemetier.update(p4);
	phasemetier.update(p5);
	phasemetier.update(p6);
	phasemetier.update(p7);
	phasemetier.update(p8);
	phasemetier.update(p9);
	phasemetier.update(p10);
	phasemetier.update(p11);
	phasemetier.update(p12);
	phasemetier.update(p13);
	phasemetier.update(p14);
	phasemetier.update(p15);
	phasemetier.update(p16);
	phasemetier.update(p17);
	phasemetier.update(p18);
	
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
	
//	System.out.println("//////////////////////////////////////////////////////////////////////////////////");
//	System.out.println(ta1);
//	System.out.println("//////////////////////////////////////////////////////////////////////////////////");
//	System.out.println(listTaUt15);
//	System.out.println("//////////////////////////////////////////////////////////////////////////////////");
//	System.out.println(listTaUt20);
//	System.out.println("//////////////////////////////////////////////////////////////////////////////////");
//	System.out.println(listTaUt3);
//	System.out.println("//////////////////////////////////////////////////////////////////////////////////");
//	System.out.println(u1);
//	System.out.println("//////////////////////////////////////////////////////////////////////////////////");
//	System.out.println(u9);
//	System.out.println("//////////////////////////////////////////////////////////////////////////////////");
	}


}
