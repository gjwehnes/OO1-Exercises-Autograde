package ex009;

//Complete the Car.java class:
//
//Include the following class variables:
//    make (type String)
//    model (type String)
//    numberOfDoors (type int)
//    topSpeed (type int)
//    price (type int)
//
//
//Write four constructors:
//    The main constructor
//    A secondary constructor that does not include numberOfDoors, which should default to 4
//    A secondary constructor that does not include make or model; both default to "unknown"
//    A secondary constructor that does not include topSpeed or price; default to 90 and 0 respectively.

public class Car {
	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	int price;
	
	public Car(String make, String model, int numberOfDoors, int topSpeed, int price) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	public Car(String make, String model, int topSpeed, int price) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = 4;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	public Car(int numberOfDoors, int topSpeed, int price) {
		this.make = "unknown";
		this.model = "unknown";
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	public Car(String make, String model, int numberOfDoors) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = 90;
		this.price = 0;
	}
}
