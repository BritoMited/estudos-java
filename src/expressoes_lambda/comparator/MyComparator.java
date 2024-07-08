package expressoes_lambda.comparator;

import expressoes_lambda.comparator.entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getProduto().toUpperCase().compareTo(o2.getProduto().toUpperCase());
    }
}
