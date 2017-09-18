package com.tactfactory.monapplication.manager;

import java.util.ArrayList;
import java.util.List;

import com.tactfactory.monapplication.entity.Animal;

public class Zoo {
	private int jour = 1;
	private List<Animal> animals;

	/**
	 * @return the animals
	 */
	public List<Animal> getAnimals() {
		return animals;
	}

	public Zoo() {
		animals = new ArrayList<Animal>();
	}

	public Zoo addAnimal(Animal animal) {
		this.animals.add(animal);
		return this;
	}

	public Zoo removeAnimal(Animal animal) {
		this.animals.remove(animal);
		return this;
	}

	public void passeUnJour() {
		List<Animal> deads = new ArrayList<Animal>();
		System.out.println("Jour " + this.jour + " :");
		for (Animal animal : animals) {
			animal.setFaim(animal.getFaim() - 20);
			animal.setSommeil(animal.getSommeil() - 40);
			if (animal.isVivant()) {
				System.out.println("	" + animal.getNom()
						+ " est toujours vivant");
			} else {
				System.out.println("	" + "Aujourd'hui " + animal.getNom()
						+ " est mort à l'age de " + animal.getAge());
				deads.add(animal);
			}
		}

		this.animals.removeAll(deads);
		this.jour += 1;
	}

	public void passeNJour(int nbJ) {
		for (int i = 0; i < nbJ; i++) {
			passeUnJour();
		}
	}

	public void journeeNormal(){
		for (Animal animal : animals) {
			animal.dormir();
			animal.dormir();
		}
	}
}
