package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Read;

public class falsificacao {
	
	private Read read;
	
	@Test
	public void read_data_test() {
		String data = read.read_data());
		int size;
		size = data.length();
		
		assertEquals(49,size);
	}
	
	@Test
	public void read_data_test_fail() {
		String data =  read.read_data();
		int size;
		size = data.length();
		
		assertEquals(0,size);
	}
}
