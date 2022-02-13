package ex002;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class Ex002Test {

	@Test
	public void test() {
		// Failure message: 
		// This test has no failure messages
		assertEquals(true,Main.beTrue());
		
		boolean methodFound = false;
		boolean methodStatic = false;		
		int parameterCount = 0;
		
		for (Method method : Main.class.getMethods()) {
			if (method.getName().equals("beTrue")){
				methodFound = true;
				methodStatic = Modifier.isStatic(method.getModifiers());
				parameterCount = method.getParameterCount();
			}
		}
		
		assertEquals(true, methodFound);
		assertEquals(true,methodStatic);
		assertEquals(0, parameterCount);
		
	}
	
}
