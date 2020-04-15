package com.anas.beans;

public class Driver {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.setSpecies("Ant");
		a.setLegs(6);
		a.setLifespan(15);
		System.out.println(a.getSpecies());
		System.out.println(a.getLegs());
		System.out.println(a.getLifespan());
	}

}
