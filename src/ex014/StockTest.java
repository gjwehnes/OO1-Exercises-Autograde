package ex014;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StockTest {

	@Test
	public void tests() {
		//arguments in represent tickerSymbol, companyName, price, and totalShares
		Stock stock = new Stock("abc","Alphabet",20.0,100);
		assertEquals("ABC",stock.getTickerSymbol());
		assertEquals("Alphabet", stock.getCompanyName());
		assertEquals(20.00, stock.getPrice(), 0.001);
		assertEquals(100, stock.getTotalShares());
		
		//percentChange should default to zero, but after adjustPrice is called, this method should return the change as a percent
		assertEquals(0,stock.getPercentChange(),0.001);
		assertEquals(2000.0,stock.getMarketCap(), 0.001);
		stock.adjustPrice(-5.00);
		assertEquals(-25.0,stock.getPercentChange(),0.001);
		assertEquals(1500.0,stock.getMarketCap(), 0.001);

		stock.adjustPrice(3.00);
		assertEquals(20.0,stock.getPercentChange(),0.001);
		assertEquals(1800.0,stock.getMarketCap(), 0.001);
		
		stock.setShares(300);
		assertEquals(0.0,stock.getPercentChange(),0.001);
		assertEquals(5400.0,stock.getMarketCap(), 0.001);
		
		assertEquals("ticker symbol: ABC; company: Alphabet; current price: $18.00;", stock.toString());
		
		stock = new Stock("XYZ","Dimension",1.00,3);
		assertEquals("ticker symbol: XYZ; company: Dimension; current price: $1.00;", stock.toString());
		
		
	}
}
