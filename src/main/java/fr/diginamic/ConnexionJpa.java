/**
 * ConnexionJpa.java
 */
package fr.diginamic;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 * @author Krol
 *
 */
public class ConnexionJpa {

	public static void main(String[] args) {
		// Créer une instance d’entityManagerFactory
		EntityManagerFactory entity = Persistence.createEntityManagerFactory("recensement");
		// Créer une instance d’entityManager
		EntityManager em = entity.createEntityManager();
		EntityTransaction transac = em.getTransaction();

		// REGION
		// transac.begin();
//		
//		Region region1 = new Region();
//		Region region2 = new Region();
//		//Extraire une région de votre choix à partir de son identifiant
//		//region1 = em.find(Region.class, 2);
//		//if (region1 != null) {
//			//System.out.println(region1);
//		//}
//		
//		region1.setNom("Aquitaine");
//		em.persist(region1);
//		Date date = Calendar.getInstance().getTime();
//		
//		Ville ville = new Ville();
//		ville.setNom("Marmande");
//		ville.setCodePostal(34070);
//		ville.setDateDernierRecensement(date);
//		ville.setCategorie(Categorie.MOYENNE);
//		ville.setRegion(region1);
//		em.persist(ville);
//		//transac.commit();
//
//		// Insérer une nouvelle région en base de données
//		//transac.begin();
//		region2.setId(3);
//		region2.setNom("Centre");
//		em.merge(region2);
//		System.out.println(region2);
//		//transac.commit();
//
//		// LIVRE
//		// transac.begin();
//		Livre livre = new Livre();
//		// Réaliser un find simple permettant d’extraire un livre en fonction de son id.
//		livre = em.find(Livre.class, 1);
//		System.out.println(livre);
//		// Ajoutez progressivement les autres champs et vérifier qu’ils sont bien
//		// renseignés
//		TypedQuery<Livre> query = em.createQuery("SELECT l FROM Livre l", Livre.class);
//		List<Livre> livres = query.getResultList();
//
//		for (Livre l : livres) {
//			System.out.println(l);
//		}
//
//		// transac.commit();
//
//		// TP3
//		// Mapper tous les attributs avec tous les champs de toutes les tables
		transac.begin();
//
//		TypedQuery<Client> query2 = em.createQuery("SELECT c FROM Client c", Client.class);
//		List<Client> clients = query2.getResultList();
//
//		TypedQuery<Emprunt> query3 = em.createQuery("SELECT e FROM Emprunt e", Emprunt.class);
//		List<Emprunt> emprunts = query3.getResultList();
//
//		// TypedQuery<Emprunt> query3 = em.createQuery("SELECT e FROM Emprunt e INNER
//		// JOIN Client c ON emprunt.id_client = client.id", Emprunt.class);
//		// List<Emprunt> emprunts = query3.getResultList();
//
//		for (Client c : clients) {
//			System.out.println(c);
//		}
//
//		for (Emprunt e : emprunts) {
//
//			System.out.println(e);
//		}

		// Réaliser une requête qui permet d’extraire un emprunt en fonction son id.
		//Affichez tous les livres associés
//		TypedQuery<Emprunt> query4 = em.createQuery("SELECT e, l.titre FROM Emprunt e JOIN e.compo c JOIN c.livre l WHERE e.id = :id", Emprunt.class);
//		query4.setParameter("id", 1);
//		List<Emprunt> empruntsID = query4.getResultList();
//		
//		Livre livre = em.find(Livre.class, 1);
//		System.out.println(livre);
//		
//		for (Emprunt e : livre.getEmprunts()) {
//			System.out.println( "Affichez tous les livres associés"  + e);
//		}
//		

		transac.commit();

	}
}
