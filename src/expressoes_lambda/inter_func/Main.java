package expressoes_lambda.inter_func;

import expressoes_lambda.inter_func.Product.Product;
import expressoes_lambda.inter_func.Util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // maneiras de implementar um predicado
        list.removeIf(new ProductPredicate());
        list.removeIf(Product::staticProductPredicate); // faz referencia a um metodo estatico
        list.removeIf(Product::nonStaticProductPredicate); // faz referencia a um metodo nao estatico

        double min = 100.0; // ate o usuario poderia digitar isso
        Predicate<Product> pred = p -> p.getPrice() >= min; // expressão lambda declarada
        list.removeIf(pred);

        list.removeIf(p -> p.getPrice() >= min);// expressao lambda inline

        for(Product p: list){
            System.out.println(p);
        }

    }
}
