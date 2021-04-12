package ex003;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

	@Test
	public void test() {
	// Failure message: 
	// This test has no failure messages
	Main a = new Main();
	assertEquals("TEST",a.makeCapital("test"));
	}
}
