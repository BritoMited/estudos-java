package set.comp_treeset;

import set.comparações.Product;

import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<Product_> set = new TreeSet<>();

        set.add(new Product_("teve", 100.0));
        set.add(new Product_("netbuk", 1000.0));
        set.add(new Product_("tablete", 1050.0));
// pode ocorrer um erro, já que o treeset ordena por meio do metodo comparable
        // que neste caso foi feito um para deixar em ordem alfabetica

        for (Product_ p: set){
            System.out.println(p);
        }


    }
}
