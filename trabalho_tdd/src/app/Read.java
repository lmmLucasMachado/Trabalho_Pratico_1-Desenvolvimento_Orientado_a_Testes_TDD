import java.io.*;
import java.util.Scanner;


public class Test{

    static String arq = "";

    public static String read_data(){

    	 System.out.println("Escolha qual dos arquivos quer:");
         System.out.println("1 - analysisTime.out");
         System.out.println("2 - totalTime.out");
         
         Scanner read = new Scanner(System.in);

         int bf;
         bf = read.nextInt();

         String name = "";
         if (bf == 1){
             name = "analysisTime";
         }else if(bf == 2){
             name = "totalTime";
         }    	
    	
        String  name = "analysisTime";

        name = "./../doc/"+name+".out";
        System.out.println(name);
        
        try{
            BufferedReader buffer = new BufferedReader(new FileReader(name));

            while(buffer.ready()){
                String linha = buffer.readLine();
                arq += linha + "\n";
            }
            buffer.close();
            System.out.println(arq);
        }catch(IOException ioe){
        	System.out.println("ArquivoNaoEncontradoException");
            ioe.printStackTrace();
        }
        
        //arq = "---------- Evolution 1 ----------\n439\n705\n738\n729";
        //System.out.println(arq.length());
        
        return arq;
    }
}