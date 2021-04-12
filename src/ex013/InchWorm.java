package ex013;


/*
Create an InchWorm class that will simulate an object that exists on a number line in a one-dimensional world. An Inchworm can be moved in either a positive (+1) or negative (-1) direction one unit at a time. The class will have two instance variables: position and direction. 

Members (a.k.a fields)
	position
	direction

Constructor:
	takes the initial position as a parameter of type int
	sets the direction to 1

Methods
	move(): moves the InchWorm one unit in the direction that it is currently facing.
	turn(): reverses the InchWorm's direction.
	accessor for position
	accessor for direction
*/

public class InchWorm {
	private int position;
	private int direction;
	//Constructor
	public InchWorm() {
		this.position = 0;
		this.direction = 1;
	}
	public InchWorm(int position) {
		this.position = position;
		this.direction = 1;
	}
	//Sets direction to negative of current value
	public void turn() {
		this.direction *= -1;
	}
	//Adds direction to position
	public void move() {
		this.position += direction;
	}
	//Returns current position
	public Object getPosition() {
		return this.position;
	}
	
}

