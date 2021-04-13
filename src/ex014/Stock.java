package ex014;

/*
You are creating a Stock class.

1. Instance Variables
	tickerSymbol (String)
	companyName (String)
	price (int)
	percentChange (double)
	totalShares(int)
	marketCap(long)

2. Constructors
	Main constructor should take in only the following parameters:
	tickerSymbol (and convert the string to uppercase)
	companyName
	price
	totalShares
	For the other instance variables,
	percentChange should default to zero.
	marketCap is calculated by multiplying totalShares by price

3. Class Methods: Write the following methods:

	public void adjustPrice(int change)
	This method will change the price by change (change can be positive or negative).  It should also recalculate percentChange and marketCap.  percentChange represents the percentage changed
	
	public String toString()
	This method should return a SINGLE String (using \n) that looks as follows:
	
		Ticker Symbol: GOOG
		Company: Google, Inc.
		Current Price: $802 (+7.2%)
		Market Cap: $538000000000
*/
public class Stock {
	
}
