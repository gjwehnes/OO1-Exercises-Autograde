package ex007;

// The Bicycle class has four instance variables (also sometimes known as members). Note that these instance variables are all set as private, which means that they are not visible (in scope) to any other class, including the unit test included for this exercise. In other words, these variables are encapsulated.
// 
// The class already has a constructor, which takes in initial values for each of the fourinstance variables. The class also already has public accessors for each of the instance variables.
// 
// Add a public mutator for each of the four instance variables.

class Bicycle {
    
    private int forwardGear = 1;
    private int rearGear = 1;
    private boolean forwardBrake = false;
    private boolean rearBrake = false;
    
    //This is the constructor; you do not need to change the code
    public Bicycle(int forwardGear, int rearGear, boolean forwardBrake, boolean rearBrake) {
        this.forwardGear = forwardGear;
        this.rearGear = rearGear;
        this.forwardBrake = forwardBrake;
        this.rearBrake = rearBrake;
    }
    
    //these are the accessors
    public int getForwardGear() {
        return this.forwardGear;
    }

    public int getRearGear() {
        return this.rearGear;
    }

    public boolean getForwardBrake() {
        return this.forwardBrake;
    }

    public boolean getRearBrake() {
        return this.rearBrake;
    }

    //add the mutators here

}
