package expressoes_lambda.comparator;

import expressoes_lambda.comparator.entities.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Gustbvo", 900.00));
        list.add(new Product("Gustavo", 900.00));
        list.add(new Product("tablete", 900.00));

        //list.sort(new MyComparator());

//        Comparator<Product> comp = new Comparator<Product>() {         PASSOU DE 2 LINHA NAO LEIO
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.getProduto().toUpperCase().compareTo(o2.getProduto().toUpperCase());
//            }
//        };

//        Comparator<Product> comp = (o1, o2) -> {  // KKKKKKK wtf tem muita coisa escrita ainda amigo
//            return o1.getProduto().toUpperCase().compareTo(o2.getProduto().toUpperCase());
//        };

 //       Comparator<Product> comp = (o1, o2) -> o1.getProduto().toUpperCase().compareTo(o2.getProduto().toUpperCase());

                list.sort((o1, o2) -> o1.getProduto().toUpperCase().compareTo(o2.getProduto().toUpperCase()));

        for (Product p : list){
            System.out.println(p);
        }

    }
}
