package ex014;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StockTest {

@Test
public void tests() {
// Failure message: 
// This test has no failure messages
		Stock s = new Stock("abc","Alphabet",10,100);
		assertEquals("ABC",s.tickerSymbol);
		assertEquals("Alphabet", s.companyName);
		assertEquals(10, s.price, 0);
		assertEquals(100, s.totalShares);

		assertEquals(0,s.percentChange,0.0001);
		assertEquals(1000,s.marketCap, 0);

		s.adjustPrice(-5);
		assertEquals(-50,s.percentChange,0.001);
		assertEquals(500,s.marketCap, 0);

		s.adjustPrice(3);
		assertEquals(60,s.percentChange,0.001);
		assertEquals(800,s.marketCap, 0);
}
}
