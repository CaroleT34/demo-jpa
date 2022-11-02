/**
 * Livre.java
 */
package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Krol
 *
 */

@Entity
@Table(name="livre")
public class Livre {
	
	@Id
	private Integer id;
	
	@Column(name ="titre", length = 255, nullable = false , unique = true)
	private String titre;
	
	@Column(name ="auteur", length = 50, nullable = false , unique = true)
	private String auteur;
	
	/**Constructeur
	 *
	 */
	public Livre() {
		// TODO Auto-generated constructor stub
	}

	/**Getter id
	 * 
	 * @return Integer id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter id
	 * 
	 * @param id the id to set (type Integer)
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**Getter titre
	 * 
	 * @return String titre
	 */
	public String getTitre() {
		return titre;
	}

	/** Setter titre
	 * 
	 * @param titre the titre to set (type String)
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**Getter auteur
	 * 
	 * @return String auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/** Setter auteur
	 * 
	 * @param auteur the auteur to set (type String)
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + "]";
	}
	

}
