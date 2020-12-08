package app;

import java.util.Scanner;
import java.io.*;

public class Read{

    static String arq = "";
    static int bf = 1;
    public static String read_data(){

    	 System.out.println("Escolha qual dos arquivos deseja realizar a analise:");
         System.out.println("1 - analysisTime.out");
         System.out.println("2 - totalTime.out");
         
         Scanner read = new Scanner(System.in);
         bf = read.nextInt();

         read_data_extract();
        
        return arq;
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
                arq += linha + "\n";
            }
            buffer.close();
            //System.out.println(arq);
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