package expressoes_lambda.function.util;

import expressoes_lambda.inter_func.Product.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
