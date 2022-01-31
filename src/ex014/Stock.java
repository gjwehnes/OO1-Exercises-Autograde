package ex014;

/*
You are creating a Stock class.

1. Instance Variables
	as required

2. Constructors
	as per the unit test

3. Class Methods: Write the following methods:

	getters and setters, as per the unit test

	adjustPrice
	This method will change the price by change (change can be positive or negative).  It should also recalculate percentChange and marketCap.  percentChange represents the percentage changed

	getPercentChange
	percentChange should default to zero, but after adjustPrice is called, this method should return the change as a percent
	from the previous value. 

	getMarketCap
	marketCap is calculated by multiplying totalShares by price
	
	setShares
	percentChange should default back to zero when shared are adjusted
	this method will also affect marketCap
	
	public String toString()
	This method should return a String contains information about the class, as per the unit test		
		
		
		
*/
public class Stock {
	
	String tickerSymbol;
	String companyName;
	double price;
	double percentChange;
	int totalShares;
	
}


