package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Read;

public class Falsificacao {
	
	private Read read;
	
	@Test
	public void read_data_test() {
		String data = read.read_data("analysisTime"));
		int size;
		size = data.length();
		
		assertNotEquals(0,size);
	}
	
	@Test
	public void read_data_test_fail() {
		String data =  read.read_data("arquivo_errado");
		int size;
		size = data.length();
		
		assertEquals(0,size);
	}
}
