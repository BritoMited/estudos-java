package generics_set_map.intro.Tipos_Curinga.curingasDelimitados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(2.0));

        System.out.println("Área total: " + totalArea(myShapes));
        System.out.println("Área total: " + totalArea(myCircle));

        // COVARIANCIA


        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);
        List<? extends Number> list = intList;
        Number x = list.get(0);
        // list.add(20); // erro de compilaca porque o compilador nao pode garantir que essa adição
        // será compativel com os outros subtipos de Number
        // OBS: posso dar get valor, mas nao posso adicionar novos na lista

        // CONTRAVARIANCIA

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");
        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);
        // Number x = myNums.get(0); // erro de compilacao
        // posso adicionar qualquer coisa que seja = ou superior a Number
        // mas nao posso dar Get porque o compilador nao pode garantir que
        // sera sera do mesmo tipo da variavel que será guardada


        // ======================================

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObejs = new ArrayList<Object>();

        copy(myInts, myObejs);
        printList(myObejs);
        copy(myDoubles, myObejs);
        printList(myObejs);


    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
            for(Number n: source){
                destiny.add(n);
                // isso funciona porque a source aplica covariancia = possivel ler
                // e a destiny aplica a contravariancia = possivel armazenar
            }
    }

    public static void printList(List<?> list){
        for (Object ob: list){
            System.out.print(ob + " ");
        }
        System.out.println();
    }

    public static double totalArea(List<? extends Shape> list){
        //  <? extends Shape> pode ser uma lista de Shape e qualquer subtipo de Shape
        double sum = 0.0;
        for (Shape s: list){
            sum += s.area();
        }
        return sum;
    }
}
