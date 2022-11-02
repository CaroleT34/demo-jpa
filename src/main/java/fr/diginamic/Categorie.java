/**
 * Categorie.java
 */
package fr.diginamic;

/**
 * @author Krol
 *
 */
public enum Categorie {

	PETITE("Petite"), 
	MOYENNE("Moyenne"), 
	GRANDE("Grande");

	private String label;
	
	/**Constructeur
	 *
	 * @param string
	 * @param label 
	 */
	Categorie(String label) {
		this.label = label;
	}
	/**Getter label
	 * 
	 * @return String label
	 */
	public String getLabel() {
		return label;
	}
	
	
}
