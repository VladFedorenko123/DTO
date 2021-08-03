package src.srccode.interfaces;

import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import src.srccode.dto.PropertiesImplementation;

class PropertiesImplementationTest {
	PropertiesImplementation objectUnderTest = new PropertiesImplementation();
	@SuppressWarnings("unchecked")
	List<String> mock = Mockito.mock(List.class);

	@Test
	void testGetProperties() {
		mock.add("url");
		mock.add("localhost");
		mock.add("password");
		mock.clear();

		verify(mock).add("url");
		verify(mock).add("localhost");
		verify(mock).add("password");
		verify(mock).clear();
	}

}
