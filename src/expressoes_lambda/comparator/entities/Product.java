package expressoes_lambda.comparator.entities;

public class Product{

    private String produto;
    private Double preco;

    public Product() {
    }

    public Product(String produto, Double preco) {
        this.produto = produto;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Product{" +
                "produto='" + produto + '\'' +
                ", preco=" + preco +
                '}';
    }


}
