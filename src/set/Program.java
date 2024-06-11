package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); // mais rapido porem nao mantem a ordem
        // treeset mais lento, e ordenado pelo compareTo
        // linkedhashset velocidade intermediaria e ordenado a medida que os itens sao adicionados

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        listar(set);

        // set.remove("Tablet");
        System.out.println();

        listar(set);

        //set.removeIf(x -> x.length() >=3);
        set.removeIf(x -> x.charAt(0) == 'T');
        System.out.println();

        listar(set);

        // ========= OPERAÇÕES DE CONJUNTOS =========

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }

    public static <T> void listar(Set<T> lista){
        for (T p : lista) {
            System.out.println(p);
        }
    }
}
