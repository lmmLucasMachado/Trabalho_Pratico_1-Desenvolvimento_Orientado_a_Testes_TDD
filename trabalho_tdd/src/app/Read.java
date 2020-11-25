package app;

import java.io.*;

public class Read{

    static String arq = "";

    public static String read_data(String name){
        name = "doc/"+name+".out";
        //System.out.println(name);
        
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