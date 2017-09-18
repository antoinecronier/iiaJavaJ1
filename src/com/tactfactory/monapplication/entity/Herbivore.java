package com.tactfactory.monapplication.entity;

public class Herbivore extends Espece {

	@Override
	public int seNourrir(Nourriture n) {
		if (n instanceof Vegetal) {
			return n.getValeurNutritive();
		}else {
			return -100;
		}
	}

}
