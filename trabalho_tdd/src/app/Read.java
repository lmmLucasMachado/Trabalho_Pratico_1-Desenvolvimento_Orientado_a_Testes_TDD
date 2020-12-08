package app;

import java.util.Scanner;
import java.io.*;

public class Read{

    static String read_arq = "";
    static int bf = 1;
	private static Persistencia arq;

    public static void read_data(){

    	 System.out.println("Escolha qual dos arquivos deseja realizar a analise:");
         System.out.println("1 - analysisTime.out");
         System.out.println("2 - totalTime.out");

         Scanner read = new Scanner(System.in);
         bf = read.nextInt();

         read_data_extract();
        
         arq.setArq(read_arq);
        
    }

	public static void read_data_extract() {
		
		String name = "";
         if (bf == 1){
             name = "analysisTime";
         }else if(bf == 2){
             name = "totalTime";
         }

        name = "./../doc/"+name+".out";
        System.out.println(name);
        
        try{
            BufferedReader buffer = new BufferedReader(new FileReader(name));

            while(buffer.ready()){
                String linha = buffer.readLine();
                read_arq += linha + "\n";
            }
            buffer.close();
        }catch(IOException ioe){
        	System.out.println("ArquivoNaoEncontradoException");
            ioe.printStackTrace();
        }
        
	}

    public static String get_name_arq(){
        String name = "";
        if (bf == 1){
            name = "/analysisTimeTab.out";
        }else if(bf == 2){
            name = "/totalTimeTab.out";
        }   
 
    	return name;
    }

}