/**
 * Emprunt.java
 */
package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Krol
 *
 */
@Entity
@Table(name="emprunt")
public class Emprunt {
	
	@Id
	private Integer id;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name ="date_debut", nullable = false , unique = true)
	private Date date_debut;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name ="date_fin", nullable = true , unique = true)
	private Date date_fin;
	
	@Column(name ="delai", length = 10, nullable = true , unique = true)
	//DATE date sans heure associée
	//TIMESTAMP date avec une heure
	private Integer delai;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	

	//Autre facon de l'écrire : @ManyToMany(mappedBy="") <--- Relation esclave
	@ManyToMany
	@JoinTable(name= "COMPO",
			joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"),
			inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
	private List<Livre> livres = new ArrayList<Livre>();
	
	/**Constructeur
	 *
	 */
	public Emprunt() {
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

	/**Getter date_debut
	 * 
	 * @return Date date_debut
	 */
	public Date getDate_debut() {
		return date_debut;
	}

	/** Setter date_debut
	 * 
	 * @param date_debut the date_debut to set (type Date)
	 */
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	/**Getter date_fin
	 * 
	 * @return Date date_fin
	 */
	public Date getDate_fin() {
		return date_fin;
	}

	/** Setter date_fin
	 * 
	 * @param date_fin the date_fin to set (type Date)
	 */
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	/**Getter delai
	 * 
	 * @return Integer delai
	 */
	public Integer getDelai() {
		return delai;
	}

	/** Setter delai
	 * 
	 * @param delai the delai to set (type Integer)
	 */
	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	/**Getter client
	 * 
	 * @return Client client
	 */
	public Client getClient() {
		return client;
	}

	/** Setter client
	 * 
	 * @param client the client to set (type Client)
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**Getter livres
	 * 
	 * @return List<Livre> livres
	 */
	public List<Livre> getLivres() {
		return livres;
	}

	/** Setter livres
	 * 
	 * @param livres the livres to set (type List<Livre>)
	 */
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}
	
	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", delai=" + delai
				+ "]";
	}
	
	

	

}
