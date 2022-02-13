package ex001;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Ex001Test {

	@Test
	public void test() {

		boolean methodFound = false;
		boolean methodStatic = false;		
		int parameterCount = 0;
		
		for (Method method : Main.class.getMethods()) {
			if (method.getName().equals("practiceOne")){
				methodFound = true;
				methodStatic = Modifier.isStatic(method.getModifiers());
				parameterCount = method.getParameterCount();
			}
		}
		
		assertEquals(true, methodFound);
		assertEquals(false,methodStatic);
		assertEquals(0, parameterCount);
	
	}
}
