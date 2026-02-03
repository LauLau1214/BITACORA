import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

//Ejercicios en clase
//Streams y git Flow

//EJERCICIO 1
//Dada una lista de numeros enteros, necesitamos obtener una
//nueva lista solo con los numeros pares mayores a diez
//(REALIZADO EN CLASE)

//Datos de entrada
List<Integer> numbers = List.of(3,8,10,12,15,18,20);
//Resultado
List<Integer>;

//Solucion

List<Integer> result = numbers.stream()
        .filter(n -> n % 2 = 0)
        .filter(n -> n > 10)
        .toList();



//EJERCICIO 2
//Dada una lista de palabras, se requiere: Filtrar las palabras que
//tengan mas de 4 caracteres, convertirlas en Mayusculas, ordenarlas
//alfabeticamente y obtener la cantidad total de palabras resultantes
//(REALIZADO EN CLASE)


List<String> words = List.of("java", "stream","api","funcional", "code", "git");

int result = words.stream()
        .filter(n -> n.length() > 4)
        .map(n -> n.ToUppeCase)
        .sorted()
        .count();



//EJERCICIO 3
//Dada una lista de usuarios, Filtra unicamente los usuarios activos, obten
//una lista con los nombres en mayuscula y ordena alfabeticamente el resultado,
//el objeto usuario cuenta con los atributos:
//identificador - name - age - Active


//Datos de entrada
user = List<Users>;

// Resultado
List<String>

List<String> resultado = user.stream() //Teniendo en cuenta que user es una clase aparte que cuenta con metodos como getName() o isActive()
        .filter(u -> u.isActive() = true)
        .map(User::getName)
        .map(u -> u.UpperCase)
        .sorted()
        .toList();



//EJERCICIO 4
//Dado un listado de Usuarios y utilizando los mismo atributos anteriores, filtrar
//las personas mayores de edad y obtener sus nombres. (NUEVO)


List<String> resultado = user.stream()
        .filter(u -> u.getAge() >= 18)
        .map(User::getName)
        .toList();

//EJERCICIO 5
//Dada una lista de transacciones bancarias representadas por objetos:

class Transaction {
    String id;
    double amount;
    boolean approved;
}
//Se requiere procesar la lista usando Streams para:
//Usar peek para ver cada transacción procesada (Utilizar System.out.println para ver la transaccion)
//Verificar si existe al menos una transacción no aprobada
//Retornar true o false indicando si el lote de transacciones es válido.

boolean noAprobada = Transaction.stream()
        .peek(t -> System.out.println(t))
        .anyMatch(t -> t.approved == false);

boolean loteValido;
if (noAprobada){
    loteValido = false;
        } else {
    loteValido = true;
        }

// misma forma menos lineas

        boolean loteValido = false;

if (transactions.stream()
        .peek(t -> System.out.println(t))
        .anyMatch(t -> t.approved == false)) {

        loteValido = false;
        } else {
        loteValido = true;
        }

