package expressoes_lambda.consumer;

import expressoes_lambda.consumer.util.PriceUpdate;
import expressoes_lambda.inter_func.Product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(new PriceUpdate());// implementação da interface

        list.forEach(Product::staticPriceUpdate); //referencia de metodo estatico

        list.forEach(Product::nonStaticPriceUpdate); //referencia de metodo nao estatico

        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.5);
        list.forEach(cons);  // expressao lambda declarada

        list.forEach(p -> p.setPrice(p.getPrice() * 1.5)); // expressao lambda inline

        // poderia receber esse valor de alteração de preço por outra variavel

        list.forEach(System.out::println);

    }
}
