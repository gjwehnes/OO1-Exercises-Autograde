package ex001;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

	@Test
	public void test() {
		Main a = new Main();
		assertEquals(2,a.practiceOne());
	}

}