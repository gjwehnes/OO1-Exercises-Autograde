package ex005;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ex005Test {

	@Test
	public void tests() {

		SimplePerson person = new SimplePerson();
		
		assertEquals("Billy", person.firsName);
		assertEquals(16,person.age);

		person.firsName = "Nemo";
		person.age = 85;

		assertEquals("Nemo", person.firsName);
		assertEquals(85,person.age);
		
	}
}
