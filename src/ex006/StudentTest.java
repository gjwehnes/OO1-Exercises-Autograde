package ex006;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentTest {

	@Test
	public void testAccessors() {
	// Failure message: 
	// If the unit test does not compile, ensure that you've written the accessors correctly. Remember that case matters!
	// 
	// If the unit test compiles but fails on running, then check that you are returning the correct values!
	Student student1 = new Student("Bloggins", "Billy", 123456);
	assertEquals(student1.getLastName(), "Bloggins");
	assertEquals(student1.getFirstName(), "Billy");
	assertEquals(student1.getID(), 123456);

	Student student2 = new Student("Doe","Jane", 654321);
	assertEquals(student2.getLastName(), "Doe");
	assertEquals(student2.getFirstName(), "Jane");
	assertEquals(student2.getID(), 654321);
	}
	}
