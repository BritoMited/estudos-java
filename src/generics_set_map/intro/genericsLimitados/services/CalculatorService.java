package generics_set_map.intro.genericsLimitados.services;

import java.util.List;

public class CalculatorService {
    /*
     Restringe T para tipos que implementam a interface Comparable<T>,
     garantindo que os objetos de tipo T possam ser comparados entre si usando o método compareTo.
     */
    public static <T extends Comparable<T>> T max(List<T> list){
        if(list.isEmpty()){
            // se for vazio retorna uma exception
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        // para cada produto na lista pegar o preço e comparar com a variavel max que é atualizada a cada
        // loop
        for(T item: list){
            // logica para achar o valor max
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }


}
