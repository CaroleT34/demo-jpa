/**
 * InsertionVilleJpa.java
 */
package fr.diginamic;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author Krol
 *
 */
public class InsertionVilleJpa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Créer une instance d’entityManagerFactory
		EntityManagerFactory entity = Persistence.createEntityManagerFactory("recensement");
		// Créer une instance d’entityManager
		EntityManager em = entity.createEntityManager();
		EntityTransaction transac = em.getTransaction();
		
		transac.begin();
//		
		Date date = Calendar.getInstance().getTime();
//		
//		
//		Ville ville = new Ville();
//		ville.setNom("Marmande");
//		ville.setCodePostal(34070);
//		ville.setDateDernierRecensement(date);
//		ville.setCategorie(Categorie.MOYENNE);
//		em.persist(ville); //Genere Insert
//		
		Habitant hab = new Habitant();
		hab.setNom("Gus");
		hab.setPrenom("GusGus");
		Ville ville = new Ville();
		ville.setNom("Floirac");
		ville.setCodePostal(33000);
		ville.setDateDernierRecensement(date);
		ville.setCategorie(Categorie.MOYENNE);
		hab.setVille(ville);
		em.persist(hab);
//		
//		ville.getHabitants().add(hab);
		
		
		transac.commit();

	}

}
