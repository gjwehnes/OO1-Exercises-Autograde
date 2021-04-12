package ex006;
  
// We want to create a class 'Student' which can store three values: last name, first name, and ID
//
// The class is already started and already has a constructor, which takes in the three initial values.
//
// TODO:
// 1. Create three instance variables. These instance variables should all be set as private, which means that they are not visible (in scope) to any other class. In other words, these variables are encapsulated.
//
// 2. Provide public accessors for each of the instance variables in the Student class. In other words, you will need 3 "getters" that "expose" the underlying values. //
//
// 3. In the constructor, set the instance variables to the initial values that are passed in as parameters.

class Student {

    //create the instance variables here
    private String lastName;
    private String firstName;
    private int id;
    //create the constructor here
    public Student(String lastName, String firstName, int id) {
    	this.lastName = lastName;
    	this.firstName = firstName;
    	this.id = id;
    }
    //create the accessors here
    public String getLastName() {
    	return this.lastName;
    }
    public String getFirstName() {
    	return this.firstName;
    }
    public int getID() {
    	return this.id;
    }
    
}
