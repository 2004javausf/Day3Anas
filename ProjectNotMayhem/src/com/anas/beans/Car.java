package com.anas.beans;

public class Car {

		
			private String brand;
			private int maxSpeed;
			private int price;
		
		// Getter method for brand name	
		public String getBrand() {
			return brand;
		}
		
		// Setter method for brand name
		public void setBrand (String brand) {
			this.brand = brand;
		}

		// Getter method for max speed
		public int getMaxSpeed() {
			return maxSpeed;
		}
		
		// Setter method for max speed
		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}
		
		// Getter method for price
		public int getPrice() {
			return price;
		}

		// Setter method for price
		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Car [brand = " + brand + ", maxSpeed = " + maxSpeed + ", price = " + price + "]";
		}


}
