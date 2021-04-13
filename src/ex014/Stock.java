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
	String tickerSymbol;
	String companyName;
	int price;
	double percentChange;
	int totalShares;
	long marketCap;
	String percentString;
	
	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		this.tickerSymbol = tickerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.percentChange = 0;
		this.marketCap = this.totalShares * this.price;

	}

	public void adjustPrice(int priceChange) {
		this.percentChange = (double)priceChange / this.price * 100;
		this.price += priceChange;
		this.marketCap = this.price * this.totalShares;
	}
	public String toString() {
		if (this.percentChange > 0) {
			this.percentString = "+" + this.percentChange;
		} else
			this.percentString = "" + this.percentChange;
		return "Ticker Symbol: " + this.tickerSymbol + "\n" + "Company: " + this.companyName + "\n" + "Current price: $" + this.price + " (" + this.percentString + "%)" + "\n" + "Market Cap: $" + this.marketCap + "\n" + " ";
	}

}






