/**
 * ConnexionJpa.java
 */
package fr.diginamic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * @author Krol
 *
 */
public class ConnexionJpa {

	public static void main(String[] args) {
		//Créer une instance d’entityManagerFactory
		EntityManagerFactory entity = Persistence.createEntityManagerFactory("recensement");
		//Créer une instance d’entityManager
		EntityManager em = entity.createEntityManager();
		EntityTransaction transac = em.getTransaction();
		
		//REGION
		transac.begin();
		
		Region region1 = new Region();
		Region region2 = new Region();
		//Extraire une région de votre choix à partir de son identifiant
		region1 = em.find(Region.class, 2);
		if (region1 != null) {
			System.out.println(region1);
		}
		
		//Insérer une nouvelle région en base de données
		region2.setId(3);
		region2.setNom("Centre");
		em.merge(region2);
		System.out.println(region2);
		transac.commit();
		
		//LIVRE
		transac.begin();
		Livre livre = new Livre();
		//Réaliser un find simple permettant d’extraire un livre en fonction de son id.
		livre = em.find(Livre.class,1);
		System.out.println(livre);
		//Ajoutez progressivement les autres champs et vérifier qu’ils sont bien renseignés
		TypedQuery<Livre> query = em.createQuery("SELECT l FROM Livre l", Livre.class);
		List<Livre> livres = query.getResultList();
		
		for (Livre l : livres) {
			System.out.println(l);
		}
		
		
		transac.commit();
		
		}
}