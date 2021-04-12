package ex004;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;//EditDelete
import java.lang.reflect.Modifier;//EditDelete
import java.util.ArrayList;//EditDelete
import java.util.List;//EditDelete

public class MainTest {

	@Test
	public void testAdd() {
		// Failure message: 
		// This test has no failure messages
		Main a = new Main();
		assertEquals(11,a.addTwo(5,6));
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
