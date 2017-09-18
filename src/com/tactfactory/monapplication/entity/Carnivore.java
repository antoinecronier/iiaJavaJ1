package com.tactfactory.monapplication.entity;

public class Carnivore extends Espece {

	@Override
	public int seNourrir(Nourriture n) {
		if (n instanceof Animal) {
			return n.getValeurNutritive();
		}else
		{
			return -10;
		}
	}
}
