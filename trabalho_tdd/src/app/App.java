package app;

public class App {
   	private static Read read;

    public static void main (String[]args){
    	String name = "analysisTime";
    	String name2 = "totalTime";
    	
    	String arq= read.read_data(name);
    	
    	System.out.println(arq);

    }
}