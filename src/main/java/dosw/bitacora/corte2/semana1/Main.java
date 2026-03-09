package dosw.bitacora.corte2.semana1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        //1. Obtener todos los estudiantes del equipo ROSADO -> Retornar una lista de
        // estudiantes cuyo team sea ROSADO

        List<Student> teams = new ArrayList<>();

        List<Student> resultado = teams.stream()
                .filter(n -> n.getTeam().equals("ROSADO"))
                .collect(Collectors.toList());


        //2.Obtener todos los nombres de estudiantes ordenados Alfabeticamente

        List<Student> names = new ArrayList<>();

        List<String> resultados = names.stream()
                .map(n -> n.getName())
                .sorted()
                .collect(Collectors.toList());

        //3. Calcular el promedio general de todos los score existentes en el sistema

        List<Grade> scores = new ArrayList<>();

        double result = scores.stream()
                .mapToDouble(n -> n.getScore())
                .average()
                .orElse(0.0);

        //4. Retornar por estudiante el promedio por materia -> Retornar un Map<String, Double> donde la clave
        // es la materia y el valor el promedio

        List<Grade> subjects = new ArrayList<>();

        Map<String, Double> results = subjects.stream()
                .collect(Collectors.groupingBy(n -> n.getSubject(),
                        Collectors.averagingDouble(n -> n.getScore())));

        //5. Retornar el estudiante cuyo promedio general sea el mas alto del curso

        List<Student> students = new ArrayList<>();

        Student resul  = students.stream()
                .max(Comparator.comparingDouble(student -> student.getGrades().stream()
                        .mapToDouble(g -> g.getScore())
                        .average()
                        .orElse(0.0))).orElse(null);

        //6. Retornar las materias reprobadas por equipo -> Retornar Map <String, Long> donde la
        // clave es el nombre del equipo y el valor la cantidad total de materias reprobadas

        List<Student> students1 = new ArrayList<>();

        Map<String, Long> re = students1.stream()
                .flatMap(n -> n.getGrades().stream()
                .filter(g -> !g.isPassed())
                .map(g -> n.getTeam()))
                .collect(Collectors.groupingBy(team -> team, Collectors.counting()));

        //7. Top 3 estudiantes con mas materias aprobadas -> Retornar lista ordenada de manera descendente

        List<Student> students2 = new ArrayList<>();

        List<Student> res = students2.stream()
                .sorted(Comparator.comparingLong(n -> -n.getGrades().stream()
                                .filter(g -> g.isPassed())
                                .count()))
                .limit(3)
                .toList();

        //8. Agrupar estudiantes por estado academico: Clasificarlos por ALTO RENDIMIENTO -> Promedio >=4,5 ,
        // REGULAR -> Promedio entre 3,5 y 4.49, RIESGO -> promedio < 3,5

        List<Student> students3 = new ArrayList<>();

        Map<String, List<Student>> r = students3.stream()
                .collect(Collectors.groupingBy(n -> { double promedio = n.getGrades().stream()
                        .mapToDouble(g -> g.getScore())
                        .average()
                                .orElse(0);
                    if(promedio >= 4.5) return "ALTO RENDIMIENTO";
                    if(promedio >= 3.5) return "REGULAR";
                    return "RIESGO";
                }));

        //9. Obtener la materia con mas reprobaciones

        List<Student> students6 = new ArrayList<>();

        Map.Entry<String, Long> resu = students.stream()
                .flatMap(s -> s.getGrades().stream())
                .filter(g -> !g.isPassed())
                .collect(Collectors.groupingBy(
                        g -> g.getSubject(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        //10. Tome solo estudiantes del equipo ROSADO, Obtenga todas sus notas, Filtre solo notas aprobadas, Agrupe por materia,
        //Calcule promedio por materia Ordene descendente por promedio, Retorne un LinkedHashMap preservando orden.

        LinkedHashMap<String, Double> obt = students.stream()
                .filter(s -> s.getTeam().equals("ROSADO"))
                .flatMap(s -> s.getGrades().stream())
                .filter(g -> g.isPassed())
                .collect(Collectors.groupingBy(
                        g -> g.getSubject(),
                        Collectors.averagingDouble(g -> g.getScore())
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));

        //11. Contar cuántos estudiantes hay en cada equipo.
        //Retornar un Map<String, Long> donde la clave es el equipo y el valor la cantidad de estudiantes.

        Map<String, Long> obte = students.stream()
                .map(n -> n.getTeam())
                .collect(Collectors.groupingBy(team -> team, Collectors.counting()));

        //12. Filtrar los estudiantes cuyo promedio de notas sea mayor a 4
        //y retornar una lista con sus nombres.

        List<String> namess = students.stream()
                .filter(n -> {double promedio = n.getGrades().stream()
                            .mapToDouble(g -> g.getScore())
                            .average()
                            .orElse(0);
                    return promedio >= 4;
                }).map(n -> n.getName())
                .toList();






    }
}
