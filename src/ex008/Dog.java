package ex008;

// Complete the Dog.java class:

// Include the following class variables:
//     name (type String)
//     breed (type String)
//     weight (type int)

// Write two constructors:
// 1. The main constructor that takes in values for all instance variables
// 2. A secondary constructor that takes in only name and weight (breed defaults to "Mutt")
	
public class Dog {
	String name;
	String breed;
	int weight;
	
	public Dog(String name, int weight) {
		this.name = name;
		this.breed = "mutt";
		this.weight = weight;
	}

	public Dog(String name, String breed, int weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	public String Name() {
		return name;
	}
	public String Breed() {
		return breed;
	}
	public int Weight() {
		return weight;
	}
}
