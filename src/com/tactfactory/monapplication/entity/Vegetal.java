package com.tactfactory.monapplication.entity;

public class Vegetal extends Nourriture {

	private String nom;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Vegetal(){

	}

	public Vegetal(String nom, int valeurNutritive){
		this.nom = nom;
		super.setValeurNutritive(valeurNutritive);
	}
}
