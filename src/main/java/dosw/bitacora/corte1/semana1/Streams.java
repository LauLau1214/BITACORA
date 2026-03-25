
package dosw.bitacora.corte1.semana1;

import java.util.List;

public class Streams {

    public static void main(String[] args) {


        List<Integer> numbers = List.of(3, 8, 10, 12, 15, 18, 20);

        List<Integer> result1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 10)
                .toList();

        System.out.println("Ejercicio 1: " + result1);

        List<String> words = List.of("java", "stream", "api", "funcional", "code", "git");

        long result2 = words.stream()
                .filter(w -> w.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .count();

        System.out.println("Ejercicio 2: " + result2);

        List<User> users = List.of(
                new User(1, "valen", 20, true),
                new User(2, "juan", 17, false),
                new User(3, "ana", 25, true)
        );

        List<String> result3 = users.stream()
                .filter(User::isActive)
                .map(User::getName)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println("Ejercicio 3: " + result3);

        List<String> result4 = users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .toList();

        System.out.println("Ejercicio 4: " + result4);

        List<Transaction> transactions = List.of(
                new Transaction("1", 100, true),
                new Transaction("2", 200, true),
                new Transaction("3", 300, false)
        );

        boolean loteValido = !transactions.stream()
                .peek(t -> System.out.println("Procesando: " + t))
                .anyMatch(t -> !t.approved);

        System.out.println("Ejercicio 5 - Lote válido: " + loteValido);
    }
}