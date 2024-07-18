package generics_set_map.intro.Tipos_Curinga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Curinga {
    public static void main(String[] args) {

        // isto não é possivel para manter a segurança do tipo
        // já que ele nao pode garantir que nao serão feitas alterações na lista

//        List<Object> myObjs = new ArrayList<Object>();
//        List<Integer> myNumbers = new ArrayList<Integer>();
//        myObjs = myNumbers;

        // por isso neste caso é possivel, porque a segurança do tipo é mantida
        // ja que com o tipo <?> (curinga) nao é possivel adicionar elementos alem do null
        // pq o compilador nao sabe dizer se esse tipo é compativel com a lista instanciada

        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;

        //ex. onde nao seria possivel utilizar o metodo sem ser <?>
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}
