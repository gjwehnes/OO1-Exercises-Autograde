package ex010;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StoreProductTest {

	@Test
	public void tests() {
	// Failure message: 
	// This test has no failure messages
			StoreProduct s1 = new StoreProduct("Eggs",3,"Produce",true,10);
			StoreProduct s2 = new StoreProduct("Paper Towels",2,24);
			assertEquals("misc",s2.category.toLowerCase());
			assertEquals(false,s2.hasExpiration);
			StoreProduct s3 = new StoreProduct("Paper Towels",2);
			assertEquals(0,s3.stock);
			StoreProduct s4 = new StoreProduct("Eggs",3,"Produce",true);
			assertEquals(0,s4.stock);

			s1.setExpired(false);
			assertEquals(10,s1.stock);
			s1.setExpired(true);
			assertEquals(0,s1.stock);

			assertEquals(true,s2.makeSale(10));
			assertEquals(14,s2.stock);
			assertEquals(false,s2.makeSale(25));
			assertEquals(14,s2.stock);

			assertEquals(1.5,s1.getDiscountedPrice(0.5),0.001);
			assertEquals(3.0,s1.getDiscountedPrice(0),0.001);
			assertEquals(0.3,s1.getDiscountedPrice(0.9),0.001);
	}
	}