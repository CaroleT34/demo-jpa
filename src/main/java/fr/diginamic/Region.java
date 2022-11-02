/**
 * Region.java
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
@Table(name="region")
public class Region {

	@Id
	private Integer id;
	
	@Column(name ="NOM", length = 30, nullable = false , unique = true)
	private String Nom;
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
		return Nom;
	}

	/** Setter nom
	 * 
	 * @param nom the nom to set (type String)
	 */
	public void setNom(String nom) {
		Nom = nom;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", Nom=" + Nom + "]";
	}
	

}
