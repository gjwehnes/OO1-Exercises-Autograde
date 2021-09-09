package ex010;

/*
1. Complete the StoreProduct.java class:

Include the following instance variables:
-label (type String)
-price (type integer)
-category (type String)
-hasExpiration (type boolean)
-stock (type int, represents how many the store has available)
All instance variables should be declared with proper code conventions

Write four constructors:
The main constructor, which receives values for all instance variables
A secondary constructor that does not receive a category or an expiration (category defaults to "misc", hasExpiration defaults to false)
A secondary constructor that does not receive a category, expiration, or stock (stock defaults to 0)
A secondary constructor that does not receive stock

2. Include the following methods:

public void setExpired(boolean hasExpired)
If the product has an expiration date and hasExpired is true, then it should set the stock to 0.  Otherwise, nothing happens.

public boolean makeSale(int quantity)
Check if the quantity (being bought) is available given the stock.  If there is enough, then make the sale by subtracting the quantity from the stock and return true (the sale was successful).  If there isn't enough, return false instead.

public double getDiscountedPrice(double discount)
The parameter discount should be between .01 and 1 and represent a 0 to 100% discount.  Multiply the product's price by the (1 - discount) to obtain the discounted price
and return that value.

*/
public class StoreProduct {

}
