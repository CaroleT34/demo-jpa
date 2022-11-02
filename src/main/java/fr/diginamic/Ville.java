/**
 * Ville.java
 */
package fr.diginamic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Krol
 *
 */
@Entity
@Table(name="ville")
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="nom", length = 50, nullable = false , unique = true)
	private String nom;
	
	@Column(name ="codePostal", length = 5, nullable = false , unique = true)
	private int codePostal;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name ="dateDernierRecensement", nullable = true , unique = true)
	private Date dateDernierRecensement;
	
	@Column(name ="categorie", nullable = true , unique = true)
	@Enumerated(EnumType.STRING) // Stock le nom
	private Categorie categorie;
	
	/**Constructeur
	 *
	 */
	public Ville() {
		super();
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

	/**Getter codePostal
	 * 
	 * @return int codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/** Setter codePostal
	 * 
	 * @param codePostal the codePostal to set (type int)
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**Getter dateDernierRecensement
	 * 
	 * @return Date dateDernierRecensement
	 */
	public Date getDateDernierRecensement() {
		return dateDernierRecensement;
	}

	/** Setter dateDernierRecensement
	 * 
	 * @param dateDernierRecensement the dateDernierRecensement to set (type Date)
	 */
	public void setDateDernierRecensement(Date dateDernierRecensement) {
		this.dateDernierRecensement = dateDernierRecensement;
	}

	/**Getter categorie
	 * 
	 * @return Categorie categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/** Setter categorie
	 * 
	 * @param categorie the categorie to set (type Categorie)
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Ville [id=" + id + ", nom=" + nom + ", codePostal=" + codePostal + ", dateDernierRecensement="
				+ dateDernierRecensement + ", categorie=" + categorie + "]";
	}
	
	

}
