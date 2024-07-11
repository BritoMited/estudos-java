package expressoes_lambda.criando_func;

import expressoes_lambda.inter_func.Product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Principal {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        System.out.println(somaFiltrada(list, p -> p.getName().charAt(0) == 'T'));



    }

    public static Double somaFiltrada(List<Product> pro, Predicate<Product> criterio){

        Double sum = 0.0;

        for (Product p: pro){
            if(criterio.test(p)){
                sum += p.getPrice();
            }
        }

        return sum;
    }
}
