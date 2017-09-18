/**
 *
 */
package com.tactfactory.monapplication;

import com.tactfactory.monapplication.entity.Animal;
import com.tactfactory.monapplication.entity.Carnivore;
import com.tactfactory.monapplication.entity.Herbivore;
import com.tactfactory.monapplication.entity.Vegetal;
import com.tactfactory.monapplication.manager.Zoo;

/**
 * @author tactfactory
 *
 */
public class MonApllication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello world");

		Zoo zoo = new Zoo();
		zoo.addAnimal(new Animal("bamby", 50, new Herbivore()));


		  /*zoo.passeUnJour(); zoo.getAnimals().get(0).seNourrir(new
		  Vegetal("geranium", 20));//new Animal("panpan", 10, new Herbivore())
		  zoo.passeUnJour();*/

		zoo.passeUnJour();
		zoo.journeeNormal();
		 zoo.passeUnJour(); zoo.getAnimals().get(0).seNourrir(new
				  Vegetal("geranium", 20));
		zoo.passeUnJour();
		zoo.journeeNormal();
		zoo.passeUnJour();
		zoo.journeeNormal();
		 zoo.passeUnJour(); zoo.getAnimals().get(0).seNourrir(new
				  Vegetal("geranium", 20));
		 zoo.passeUnJour();
			zoo.journeeNormal();
			 zoo.passeUnJour(); zoo.getAnimals().get(0).seNourrir(new
					  Vegetal("geranium", 20));
			zoo.passeUnJour();
			zoo.journeeNormal();
			zoo.passeUnJour();
			zoo.journeeNormal();
			 zoo.passeUnJour(); zoo.getAnimals().get(0).seNourrir(new
					  Vegetal("geranium", 20));
	}
}
