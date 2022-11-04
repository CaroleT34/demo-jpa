/**
 * Livre.java
 */
package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	
	 @ManyToMany(mappedBy="livres")
	 private List<Emprunt> emprunts = new ArrayList<Emprunt>();

	/**Constructeur
	 *
	 */
	public Livre() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", emprunts=" + emprunts + "]";
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

	/**Getter emprunts
	 * 
	 * @return List<Emprunt> emprunts
	 */
	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	/** Setter emprunts
	 * 
	 * @param emprunts the emprunts to set (type List<Emprunt>)
	 */
	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
	

}
