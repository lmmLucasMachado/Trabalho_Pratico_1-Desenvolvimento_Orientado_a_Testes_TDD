package testes.testes;

import static org.junit.Assert.*;
import org.junit.Test;
import app.*;

public class Testes {
	private Write write;
	private Read read;

	@Test
	public void test_write_data() {
		String data = write.write_data("./"));
		int size;
		size = data.length();
		
		assertNotEquals(0,size);
	}

	@Test
	public void test_fail_write_data() {
		String data = write.write_data("./asdasd/ads"));
		int size;
		size = data.length();
		
		assertEquals(0,size);
	}
	
	@Test
	public void test_get_name_arq() {
		String data = write.get_name_arq());
		int size;
		size = data.length();
		
		assertNotEquals(0,size);
	}
}
