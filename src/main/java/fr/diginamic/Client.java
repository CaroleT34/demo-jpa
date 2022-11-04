/**
 * Client.java
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
@Table(name="client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name ="nom", length = 50, nullable = false , unique = true)
	private String nom;
	
	@Column(name ="prenom", length = 50, nullable = false , unique = true)
	private String prenom;
	
	@OneToMany(mappedBy = "client")
	private List<Emprunt> emprunts = new ArrayList<Emprunt>();

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

	/**Constructeur
	 *
	 */
	public Client() {
		super();
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

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", emprunts=" + emprunts + "]";
	}

}
