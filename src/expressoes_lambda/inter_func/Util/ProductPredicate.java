package expressoes_lambda.inter_func.Util;

import expressoes_lambda.inter_func.Product.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
