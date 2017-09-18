package com.tactfactory.monapplication.entity;

import java.util.Random;

public abstract class Espece {


	public abstract int seNourrir(Nourriture n);

	public int dormir(int min, int max){

		Random random = new Random();

		return random.nextInt((max - min) + 1) + min;
	}
}
