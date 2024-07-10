package expressoes_lambda.function;

import expressoes_lambda.function.util.UpperCaseName;
import expressoes_lambda.inter_func.Product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // a lista foi transformada em stream, aplicado o map que aplica a func a cada elemento
        // depois ele pega o restultado desse map e transforma para list novamente/
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        // implementação da interface

        // o map aplica uma função a cada elemento da lista
        // o map so funciona em stream, e por conta de aplicar uma function
        // ela obrigatoriamente vai gerar uma outra lista, que nesse caso é de string
        // por isso na criação do names

        List<String> names1 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        //referencia de metodo estatico

        List<String> names2 = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        //referencia de metodo nao estatico

        Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> names3 = list.stream().map(func).collect(Collectors.toList());
        // expressao lambda declarada

        List<String> names4 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        // expressao lambda inline


        names.forEach(System.out::println);
        names1.forEach(System.out::println);
        names2.forEach(System.out::println);
        names3.forEach(System.out::println);
        names4.forEach(System.out::println);



    }
}
