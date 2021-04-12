package ex001;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainTest {

	@Test
	public void test() {
		Main a = new Main();
		assertEquals(2,a.practiceOne());
	}


	@Test
	public void testIfNonStatic() {
		boolean methodFound = false;
		for (Method method : Main.class.getMethods()) {
			if (method.getName().equals("practiceOne")){
				methodFound = true;
				assertEquals(false, Modifier.isStatic(method.getModifiers()));
			}
		}
		assertEquals(true, methodFound);
	}
}