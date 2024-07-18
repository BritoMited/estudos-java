package expressoes_lambda.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PipeLine {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,6);

        Stream<Integer> st1 = list.stream().map(x -> x * 107);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<Integer> st2 = list.stream().map(x -> x * 107);
        // tive que criar outra stream, ja que só se pode usar a stream uma vez
        // ja que utilizei a operação terminal toArray
        List<Integer> lista = st2.collect(Collectors.toList());

        // stream é basicamente um fluxo de dados, e o generics_set_map.intro.map passa por cada um desses
        // elementos aplicando uma função que gera um novo valor, em uma nova stream de dados

        BinaryOperator<Integer> toma = (x, y) -> x + y;
        // é uma interface que pega 2 valores do mesmo tipo e retorna ele do mesmo tipo
        // caso queira fazer com tipos diferentes e retornar um outro, usasse o bifunction

        int soma = lista.stream().reduce(0, toma);
        // esse reduce pega um valor inicial "identity", e depois uma função, que pega o valor
        // de identidade soma com um valor da lista, e este entao se torna o de identidade
        // e então faz isso até o fim da lista, para sobrar apenas 1 valor

        System.out.println(soma);

        List<Integer> pares =  list.stream()
                .filter(x -> x % 2 == 0) // filtra para que "passe" para a proxima função so os que forem pares
                .map(x -> x * 10) // aplica a função
                .collect(Collectors.toList()); // e transforma em lista novamente, já que era uma stream,
                // que neste caso é uma operação terminal

        System.out.println(Arrays.toString(pares.toArray()));

    }

}
