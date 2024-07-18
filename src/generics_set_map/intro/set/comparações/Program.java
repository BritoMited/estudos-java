package generics_set_map.intro.set.comparações;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();

        set.add(new Product("teve", 100.0));
        set.add(new Product("netbuk", 1000.0));
        set.add(new Product("tablete", 1050.0));

        Product prod = new Product("netbuk", 1000.0);
        System.out.println(set.contains(prod)); // no primeiro momento ele da false
        // ja que por nao ter equals e hashcode ele compara os endereços de memoria
        // assim claramente sendo diferentes, e não o seu conteudo
        // porem quando adicionado os dois, ele compara adequadamente


    }
}
