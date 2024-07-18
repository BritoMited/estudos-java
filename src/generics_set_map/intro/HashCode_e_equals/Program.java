package generics_set_map.intro.HashCode_e_equals;

import generics_set_map.intro.HashCode_e_equals.personalizado.Client;

public class Program {
    public static void main(String[] args) {
        String a = "Maria";
        String b = "alex que comeu teu cu com durex";
        System.out.println(a.equals(b)); // deu false por a ser diferente de b, é mais lento porém é 100% acertivo

        System.out.println(a.hashCode()); // mais rapido porem nao é 100% acertivo pois pode haver
        System.out.println(b.hashCode()); // colisão já que os numeros int são limitados

        Client c1 = new Client("bruto", "brito@gmail.com");
        Client c2 = new Client("marie", "maria@gmail.com");
        Client c3 = new Client("bruto", "brito@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1 == c3); // ele compara o endereço de memoria e nao o conteudo
    }
}
