package ex012;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class PersonTest {


@Test
public void tests() {
// Failure message: 
// This test has no failure messages
		Person s = new Person("Billy","Bob",10,25,1900);
		assertEquals("Billy",s.getFirstName());
		assertEquals("Bob",s.getLastName());
		s.setFirstName("John");
		s.setLastName("Doe");
		assertEquals("John",s.getFirstName());
		assertEquals("Doe",s.getLastName());
		assertEquals("10/25/1900",s.getBirthday());
				
		s.setBirthDay(17);
		s.setBirthMonth(3);
		s.setBirthYear(1997);
		assertEquals("3/17/1997",s.getBirthday());

		s.setBirthDay(32);
		s.setBirthDay(-1);
		assertEquals("3/17/1997",s.getBirthday());
		
		s.setBirthMonth(13);
		s.setBirthMonth(-1);
		assertEquals("3/17/1997",s.getBirthday());
}
@Test
public void testFields() {
// Failure message: 
// Not all instance variables are declared and/or are private. Check the specific assertion message.
		Person s = new Person("Billy","Bob",10,25,1900);

		//firstName field
		try {
			Field field = Person.class.getDeclaredField("firstName");
			if (field.getModifiers() != Modifier.PRIVATE) {
				fail("firstName field is not declared as private");
			}
		} catch (NoSuchFieldException e) {
			fail("firstName field not declared");
		}

		//lastName field
		try {
			Field field = Person.class.getDeclaredField("lastName");
			if (field.getModifiers() != Modifier.PRIVATE) {
				fail("lastName field is not declared as private");
			}
		} catch (NoSuchFieldException e) {
			fail("lastName field not declared");
		}

		//birthDay field
		try {
			Field field = Person.class.getDeclaredField("birthDay");
			if (field.getModifiers() != Modifier.PRIVATE) {
				fail("birthDay field is not declared as private");
			}
		} catch (NoSuchFieldException e) {
			fail("birthDay field not declared");
		}

		//birthMonth field
		try {
			Field field = Person.class.getDeclaredField("birthMonth");
			if (field.getModifiers() != Modifier.PRIVATE) {
				fail("birthMonth field is not declared as private");
			}
		} catch (NoSuchFieldException e) {
			fail("birthMonth field not declared");
		}

		//birthYear field
		try {
			Field field = Person.class.getDeclaredField("birthYear");
			if (field.getModifiers() != Modifier.PRIVATE) {
				fail("birthYear field is not declared as private");
			}
		} catch (NoSuchFieldException e) {
			fail("birthYear field not declared");
		}
}
}
