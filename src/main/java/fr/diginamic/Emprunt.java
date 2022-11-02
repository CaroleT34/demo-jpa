/**
 * Emprunt.java
 */
package fr.diginamic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	@Column(name ="id_client", length = 10, nullable = false , unique = true)
	private Integer id_client;
	
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

	/**Getter id_client
	 * 
	 * @return Integer id_client
	 */
	public Integer getId_client() {
		return id_client;
	}

	/** Setter id_client
	 * 
	 * @param id_client the id_client to set (type Integer)
	 */
	public void setId_client(Integer id_client) {
		this.id_client = id_client;
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", delai=" + delai
				+ ", id_client=" + id_client +"]" ;
	}

}
