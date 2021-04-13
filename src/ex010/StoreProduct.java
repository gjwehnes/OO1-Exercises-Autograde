package ex010;

/*
1. Complete the StoreProduct.java class:

Include the following class variables:
label
price (type integer)
category
hasExpiration (type boolean)
stock (type int, represents how many the store has available)
All class variables should be declared case sensitive

Write four constructors:
The main constructor
A secondary constructor that does not have a category or an expiration (category defaults to "misc", hasExpiration defaults to false)
A secondary constructor that does not have a category, expiration, or stock (stock defaults to 0)
A secondary constructor that just does not have stock

2. Include the following methods:

public void setExpired(boolean hasExpired)
If the product has an expiration date and hasExpired is true, then it should set the stock to 0.  Otherwise, nothing happens.

public boolean makeSale(int quantity)
Check if the quantity (being bought) is available given the stock.  If there is enough, then make the sale by subtracting the quantity from the stock and return true (the sale was successful).  If there isn't enough, return false instead.

public double getDiscountedPrice(double discount)
The parameter discount should be between .01 and 1 and represent a 0 to 100% discount.  Multiply the product's price by the (1 - discount) and return that number.

*/
public class StoreProduct {

}
