/**
 * Habitants.java
 */
package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Krol
 *
 */
@Entity
@Table(name="habitants")
public class Habitant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="nom", length = 50, nullable = false , unique = true)
	private String nom;
	
	@Column(name ="prenom", length = 50, nullable = false , unique = true)
	private String prenom;
	
	
	/**Constructeur
	 *
	 */
	public Habitant() {
		// TODO Auto-generated constructor stub
	}

	
	/**Getter id
	 * 
	 * @return int id
	 */
	public int getId() {
		return id;
	}



	/** Setter id
	 * 
	 * @param id the id to set (type int)
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**Getter nom
	 * 
	 * @return String nom
	 */
	public String getNom() {
		return nom;
	}



	/** Setter nom
	 * 
	 * @param nom the nom to set (type String)
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/**Getter prenom
	 * 
	 * @return String prenom
	 */
	public String getPrenom() {
		return prenom;
	}



	/** Setter prenom
	 * 
	 * @param prenom the prenom to set (type String)
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
