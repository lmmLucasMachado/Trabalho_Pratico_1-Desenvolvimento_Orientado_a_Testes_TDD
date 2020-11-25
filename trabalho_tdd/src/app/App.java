package app;

public class App {
   	private static Read read;

    public static void main (String[]args){
    	String arq= read.read_data();
    	
    	System.out.println(arq.length());
    	

    }
}