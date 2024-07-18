package generics_set_map.intro.map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class pograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> cuquis = new TreeMap<>();
        // possivel colocar o treemap direto pois o tipo string vem com equals e hashcode por padrao
        // generics_set_map.intro.map caracterizado por ter sempre uma relação de <key, valor>

        cuquis.put("username", "namaria");
        cuquis.put("email", "namaria@gmail.com");
        cuquis.put("fone", "40028922");

       // cuquis.remove("fone");

        cuquis.put("fone", "40028955"); // será sobrescrito o valor

        System.out.println("Contains 'phone' key: " + cuquis.containsKey("phone"));
        System.out.println("Phone number: " + cuquis.get("phone")); // quando a key value nao existe ele retorna null
        System.out.println("Email: " + cuquis.get("email"));
        System.out.println("Size: " + cuquis.size());

        System.out.println();

        System.out.println("todos os cuquis: ");
        System.out.println();
        for (String key : cuquis.keySet()){
            System.out.println(key + " : " + cuquis.get(key));
        }


        // logica de um ex


//        String[] fields = line.split(",");
//        String name = fields[0];
//        int count = Integer.parseInt(fields[1]);
//
//        if (votes.containsKey(name)) {
//            int votesSoFar = votes.get(name); // esse get pega os votos que ele já possui
//            votes.put(name, count + votesSoFar); // se o candidato ja existir ele vai pegar os votos e vai somar com os já existentes
//        }
//        else {
//            votes.put(name, count); // se nao, vai adicionar um novo
//        }




    }
}
