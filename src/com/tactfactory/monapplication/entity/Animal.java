/**
 *
 */
package com.tactfactory.monapplication.entity;

/**
 * @author tactfactory
 *
 */
public class Animal extends Nourriture {

	private Espece espece;
	private int age;
	private String nom;
	private double poids;
	private Boolean sex;
	private int taille;
	private int sommeil;
	private int faim;

	/**
	 * @return the espece
	 */
	public Espece getEspece() {
		return espece;
	}

	/**
	 * @param espece
	 *            the espece to set
	 */
	public void setEspece(Espece espece) {
		this.espece = espece;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the poids
	 */
	public double getPoids() {
		return poids;
	}

	/**
	 * @param poids
	 *            the poids to set
	 */
	public void setPoids(double poids) {
		this.poids = poids;
	}

	/**
	 * @return the sex
	 */
	public Boolean getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	/**
	 * @return the taille
	 */
	public int getTaille() {
		return taille;
	}

	/**
	 * @param taille
	 *            the taille to set
	 */
	public void setTaille(int taille) {
		this.taille = taille;
	}

	/**
	 * @return the sommeil
	 */
	public int getSommeil() {
		return sommeil;
	}

	/**
	 * @param sommeil
	 *            the sommeil to set
	 */
	public void setSommeil(int sommeil) {
		this.sommeil = sommeil;
	}

	/**
	 * @return the faim
	 */
	public int getFaim() {
		return faim;
	}

	/**
	 * @param faim
	 *            the faim to set
	 */
	public void setFaim(int faim) {
		this.faim = faim;
	}

	public Animal(Espece espece, int age, String nom, double poids,
			Boolean sex, int taille, int valeurNutritive) {
		super();
		this.espece = espece;
		this.age = age;
		this.nom = nom;
		this.poids = poids;
		this.sex = sex;
		this.taille = taille;
		this.sommeil = 100;
		this.faim = 100;
		super.setValeurNutritive(valeurNutritive);
	}

	public Animal(String nom, int valeurNutritive, Espece espece) {
		this.nom = nom;
		this.espece = espece;
		this.sommeil = 100;
		this.faim = 100;
		super.setValeurNutritive(valeurNutritive);
	}

	public Animal(int valeurNutritive) {
		super.setValeurNutritive(valeurNutritive);
	}

	public void seNourrir(Nourriture n) {
		this.faim += espece.seNourrir(n);
		System.out.println("	" + this.nom + " viens de ce nourrir.");
	}

	public void dormir() {
		this.sommeil += espece.dormir(2, 60);
		System.out.println("	" + this.nom + " a dormi.");
	}

	public boolean isVivant() {
		if (this.sommeil > 0 && this.faim > 0) {
			return true;
		} else {
			return false;
		}
	}
}
