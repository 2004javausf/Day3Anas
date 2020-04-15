package com.anas.beans2;

import com.anas.beans.Car;

public class Driver
{
	public static void main(String[] args)
	{
	Car car = new Car();
	car.setBrand("BMW");
	car.setMaxSpeed(120);
	car.setPrice(34);
	
	System.out.println(car.getBrand());
	System.out.println(car.getMaxSpeed());
	System.out.println(car.getPrice());
	}
	
}
