package ex004;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Ex004Test {

	@Test
	public void testAdd() {
		Main a = new Main();
		assertEquals(11,a.addTwo(5,6));
		assertEquals(42,a.addTwo(32,10));
		assertEquals(-5,a.addTwo(-10,5));
	}
	@Test
	public void testIfNonStatic() {
		// Failure message: 
		//  Method should be non-static but is declared as static.
		List<Method> methods = new ArrayList<Method>();
		for (Method method : Main.class.getMethods()) {
			if (method.getName().equals("addTwo")){
				assertEquals(false, Modifier.isStatic(method.getModifiers()));
			}
		}
	}
}
