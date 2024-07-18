package expressoes_lambda.stream;

import expressoes_lambda.stream.entities.Employes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExercicioPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employes> list = new ArrayList<>();
        list.add(new Employes("Maria", "maria@gmail.com", 3200.00));
        list.add(new Employes("Alex", "alex@gmail.com", 1900.00));
        list.add(new Employes("Marco", "marco@gmail.com", 1700.00));
        list.add(new Employes("Bob", "bob@gmail.com", 3500.00));
        list.add(new Employes("Anna", "anna@gmail.com", 2800.00));

        System.out.println("Informe o salario: ");
        double salario = sc.nextDouble();

        System.out.println("Email das pessoas que tem o salário maior que " + salario);

        List<String> lista = list.stream()
                .filter(p -> p.getSalary() > salario)
                .map(p -> p.getEmail())
                .collect(Collectors.toList());

        lista.forEach(System.out::println);

        double soma = list.stream()
                .filter(p -> p.getName().charAt(0) == 'M')
                .map(p -> p.getSalary())
                .reduce(0.0, (x, y) -> x + y);

        System.out.println("Soma do salario das pessoas que começam com a letra 'M': " + soma);

    }
}
