package com.anas.beans;

public class Animal {
	
	private String species;
	private int legs;
	private int lifespan;
	
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public int getLifespan() {
		return lifespan;
	}
	
	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}

	@Override
	public String toString() {
		return "Animal [species = " + species + ", legs = " + legs + ", lifespan = " + lifespan + "]";
	}

	
}
