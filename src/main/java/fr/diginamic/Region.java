/**
 * Region.java
 */
package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Krol
 *
 */

@Entity
@Table(name="region")
public class Region {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name ="NOM", length = 30, nullable = false , unique = true)
	private String nom;
	
	@OneToMany(mappedBy = "region")
	private List<Ville> villes = new ArrayList<Ville>();
	/**Constructeur
	 *
	 */
	public Region() {
		
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

	/**Getter villes
	 * 
	 * @return List<Ville> villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

	/** Setter villes
	 * 
	 * @param villes the villes to set (type List<Ville>)
	 */
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", Nom=" + nom + "]";
	}
	

}
