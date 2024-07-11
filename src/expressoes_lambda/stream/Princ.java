package expressoes_lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Princ {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,6,7,8);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("maria", "bobi", "alex que comeu teu cu com durex");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        //                              primeiro elemento // como vai ser a funcao de iteração de criacao dos proximos
        //                                                      elementos
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        // Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
        // fobonacci do nelio
        //System.out.println(Arrays.toString(st4.limit(90).toArray()));

        //meu proprio fibas

        Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, Princ::novoLong).map(p -> p[0]);

        // escrevendo a função

    }

    public static long[] novoLong(long[] p){
        return new long[]{ p[1], p[0]+p[1] };
    }
}
