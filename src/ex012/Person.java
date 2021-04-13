package ex012;
/*
Complete the Person class with the following:

Instance Variables
	String firstName
	String lastName
	int birthMonth
	int birthDay
	int birthYear
	All variables above should be private.

Constructor:The main constructor should take in all values and assign them to their respective private class variables

Methods: 

Create public getters and setters for all fields. e.g. 
	getFirstName
	getLastName
	setFirstName
	setLastName
	etc.

Create a public getter method called getBirthday, which will return a String composed of their birthday in month/day/year format.
For example, if birthMonth=3, birthday=22, birthYear=2000, it should return the String "3/22/2000"

Note: It does not make sense for a Person's birthMonth to be set to a value less than 1 or greater than 12. Thus, add code to the
setBirthMonth method so that if an invalid value is given, then the field is not modified. Similarly, for setBirthDay, if the value
given is less than 1 or greater than 31, then do not modify the field. Note that this would still allow invalid dates to be set,
but determining all valid dates is a tricky problem (think leap years)!

This is a good example of where encapsulation may be useful. If the birthMonth and birthDay fields were declared as private, there
would be no way to stop another class from creating a Person with a birthday that makes no sense in reality. Thereby, you may catch
a programming error (or a user typo) before it becomes a problem.

*/
public class Person {
	
}
