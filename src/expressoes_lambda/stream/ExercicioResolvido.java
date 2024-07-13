package expressoes_lambda.stream;

import expressoes_lambda.inter_func.Product.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioResolvido {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        list.add(new Product("Computer", 850.00));
        list.add(new Product("Monitor", 290.00));

        double media = list.stream()
                .map(p -> p.getPrice())
                .reduce(0.0, (x, y) -> x + y) / list.size();

        // o map gera uma stream totalmente nova, que entao os proximos comandos sao trabalhados em cima disso

        System.out.println("a media de preços " + String.format("%.2f", media));

        Comparator<String> comp =  (string1, string2) -> string1.toUpperCase().compareTo(string2.toUpperCase());
        // isso cria um comparador que gera um em ordem alfabetica

        List<String> names = list.stream()
                // criou uma stream de produtos
                .filter(p -> p.getPrice() < media)
                // filtrou a stream com apenas os produtos que são acima da media
                .map(p -> p.getName())
                // fez uma nova stream de apenas nomes baseado no filtro
                .sorted(comp.reversed())
                // organizou elas baseado no comparator, e entao deixou ela reversa
                .collect(Collectors.toList());
                // e entao transformou em lista novamente


        names.forEach(System.out::println);
    }
}
