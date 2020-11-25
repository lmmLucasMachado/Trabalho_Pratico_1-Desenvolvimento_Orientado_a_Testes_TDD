package app;

import java.io.*;

public class Read{

    static String arq = "";

    public static String read_data(){
        /*
        try{
            BufferedReader buffer = new BufferedReader(new FileReader("../doc/analysisTime.out"));

            while(buffer.ready()){
                String linha = buffer.readLine();
                arq += linha + "\n";
            }
            buffer.close();
            System.out.println(arq);
        }catch(IOException ioe){
            ioe.printStackTrace("ArquivoNaoEncontradoException");
        }
        */
        arq = "---------- Evolution 1 ----------\n439\n705\n738\n729";

        //System.out.println(arq.length());

        return arq;
    }
}