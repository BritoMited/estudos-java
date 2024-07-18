package generics_set_map.intro.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T n){
        list.add(n);
    }

    public void print(){
        System.out.print("[");
        if(!list.isEmpty()){
            System.out.print(list.get(0));

            for(int i = 1; i < list.size(); i++){
                System.out.print(", " + list.get(i));
            }
        }

        System.out.print("]");
    }

    public T first(){
        if(list.isEmpty()){
            throw new IllegalStateException("Lista vazia");
        }
        return list.get(0);
    }
}
