package ex003;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ex003Test {

	@Test
	public void test() {
	Main a = new Main();
	assertEquals("CONVERT MIXED CASE",a.makeCapital("cOnVeRt MiXeD cAsE"));
	assertEquals("TEST ANOTHER STRING",a.makeCapital("TEST another STRING"));
	}
}
