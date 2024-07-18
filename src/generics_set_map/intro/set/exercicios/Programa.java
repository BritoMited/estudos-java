package generics_set_map.intro.set.exercicios;

import java.io.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("insira o caminho do arquivo: ");
       // String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\estudo java\\src\\generics_set_map.intro.set\\exercicios\\in.txt"))){

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while(line != null){

                String[] fields = line.split(" ");

                String username = fields[0];
                LocalDateTime ldt = LocalDateTime.parse(fields[1]);

                set.add(new LogEntry(username, ldt));

                line = br.readLine();

            }
            System.out.println("usuarios totais: " + set.size()); // ele nao mostra usuarios repetidos

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
