package ex011;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringFormatterTest {

	@Test
	public void testFormatCoordinate() {
		assertEquals("(4,2)", StringFormatter.formatCoordinate(4, 2));
		assertEquals("(-5,4)", StringFormatter.formatCoordinate(-5, 4));
		assertEquals("(829,3009)", StringFormatter.formatCoordinate(829, 3009));
	}

	@Test
	public void testFormatDollarAmount() {
		assertEquals("$ 3.14", StringFormatter.formatDollarAmount(3.14));
		assertEquals("$ 99.99", StringFormatter.formatDollarAmount(99.99));
		assertEquals("$ -1.00", StringFormatter.formatDollarAmount(-1.00));
	}

	@Test
	public void testFormatProperties() {
		assertEquals("Class: Human; accessible: true; mutable: true", StringFormatter.formatProperties("Human", true, true));
		assertEquals("Class: Dog; accessible: true; mutable: false", StringFormatter.formatProperties("Dog", true, false));
		assertEquals("Class: Cat; accessible: false; mutable: false", StringFormatter.formatProperties("Cat", false, false));
	}
	
	@Test
	public void testFormatTableHeader() {
		assertEquals("| Widgets              |     1.49 | 00000123 | 10    |", StringFormatter.formatTableRow("Widgets", 1.49, 123, 10));
		assertEquals("| Thingamajigs         |     3.50 | 00000456 | 100   |", StringFormatter.formatTableRow("Thingamajigs", 3.50, 456, 100));
		assertEquals("| Chummeys             |    10.00 | 00007890 | 1000  |", StringFormatter.formatTableRow("Chummeys", 10.0, 7890, 1000));
	}
	
}	
