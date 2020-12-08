package app;
import java.io.*;
import java.util.Scanner;

public class Write {
	private static Persistencia read_arq;
    static String[][] data = new String [10000][10000];
    static int i = -1,j =0;
    
	public static void parser_write_data(){
		String arq = read_arq.getArq();
		//System.out.println(arq);
        String line[] = arq.split("\n");
        for (int a = 0; a < line.length ; ++a){
            if (line[a].length() > 10){
                i++;
                j = 0;
            }else{
                data[i][j] = line[a];
                j++;
            }
        }

        System.out.println("Digite o caminho onde o arquivo sera armazenado:");
        Scanner read = new Scanner(System.in);
        String path = read.next();

        write_data_extract(path);
	}
	
	public static void write_data_extract(String path){// throws IOException {
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
        	String name = read_arq.get_name_arq();
            BufferedWriter buffer_w = new BufferedWriter(new FileWriter(path+name));
            String line_w = "";
            Scanner in = new Scanner(System.in);
                        
            if (op == 1){
                for (int l = 0; l < i; l++) {  
                    for (int c = 0; c < j; c++) {
                        line_w = line_w + data[l][c] + separator;
                        System.out.print(data[l][c]); 
                        System.out.print(separator); 
                    }  
                    buffer_w.append(line_w + "\n");
                    line_w = "";
                }
            }else{
                for (int l = 0; l < j; l++) {  
                    for (int c = 0; c < i; c++) {
                        line_w = line_w + data[c][l] + separator;
                        System.out.print(data[c][l]);
                        System.out.print(separator); 
                    }  
                    buffer_w.append(line_w + "\n");
                    line_w = "";
                }
            }

            buffer_w.close();
        }catch(IOException ioe){
            System.out.println("​ EscritaNãoPermitidaException");
            ioe.printStackTrace();
        }
    }
	
}
