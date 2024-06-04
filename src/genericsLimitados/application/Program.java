package genericsLimitados.application;

import genericsLimitados.entities.Product;
import genericsLimitados.services.CalculatorService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\estudo java\\src\\genericsLimitados\\application\\ini.txt";

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){

            //inicia a variavel para entrar no loop
            String line = bf.readLine();
            while(line != null){
                // usa o split separando por vigurlas para alientar a matriz de string
                String[] fields = line.split(",");
                // adiciona um novo produto na lista
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                // line recebe a proxima linha
                line = bf.readLine();
            }
            Product max = CalculatorService.max(list);
            System.out.println("Max: ");
            System.out.println(max);

        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
