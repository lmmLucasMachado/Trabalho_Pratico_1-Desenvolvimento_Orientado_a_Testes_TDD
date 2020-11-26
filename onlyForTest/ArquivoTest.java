
import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class ArquivoTest{

    static String arq = "";
    static String[][] data = new String [10000][10000];
    static int i = -1,j =0;

    public static void main (String[]args){

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

        name = "Trabalho_Pratico_1-Desenvolvimento_Orientado_a_Testes_TDD/trabalho_tdd/src/doc/"+name+".out";
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

        parser_write();
    }

    public static void parser_write(){
        // ----------- fim leitura --------------

        String line[] = arq.split("\n");

        //System.out.println(Integer.parseInt(line[2]) + 1);
        //System.out.println(line[0].length());
        for (int a = 0; a < line.length ; ++a){
            if (line[a].length() > 10){
                i++;
                j = 0;
            }else{
                data[i][j] = line[a];
                j++;
            }
        }

        for (int l = 0; l < i; l++)  {  
        for (int c = 0; c < j; c++)     { 
            System.out.print(data[l][c]); //imprime caracter a caracter
            System.out.print(" "); 
        }  
        System.out.println(" "); //muda de linha
        }

        Scanner read = new Scanner(System.in);
        System.out.println("Digite o caminho onde o arquivo sera armazenado:");
        String path = read.next();

        write_data(path);

    }

    public static void write_data(String path){// throws IOException {
        Scanner read = new Scanner(System.in);
        String separator;
        
        System.out.println("Digite qual separador deseja:");
        separator = read.next();

        if (separator.length() > 2){
            System.out.println("Separador invalido!!!");
            System.exit(0);
        }
        
        System.out.println("Escolha como prefere o arquivo:");
        System.out.println("1 - Linhas." );
        System.out.println("2 - Colunas." );

        int op = read.nextInt();
        try{
            BufferedWriter buffer_w = new BufferedWriter(new FileWriter("./saida.txt"));
            String line_w = "";
            Scanner in = new Scanner(System.in);
            
            int m1,m2;
            
            if (op == 1){
                for (int l = 0; l < i; l++) {  
                    for (int c = 0; c < j; c++) {
                        line_w = line_w + data[l][c] + separator;
                        System.out.print(data[l][c]); //imprime caracter a caracter
                        System.out.print(separator); 
                    }  
                    buffer_w.append(line_w + "\n");
                    line_w = "";
                    //System.out.println(" "); //muda de linha
                }
            }else{
                for (int l = 0; l < j; l++) {  
                    for (int c = 0; c < i; c++) {
                        line_w = line_w + data[c][l] + separator;
                        System.out.print(data[c][l]); //imprime caracter a caracter
                        System.out.print(separator); 
                    }  
                    buffer_w.append(line_w + "\n");
                    line_w = "";
                    //System.out.println(" "); //muda de linha
                }
            }

            buffer_w.close();
        }catch(IOException ioe){
            System.out.println("​ EscritaNãoPermitidaException");
            ioe.printStackTrace();
        }
    }
}