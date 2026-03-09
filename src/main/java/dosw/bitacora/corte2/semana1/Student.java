package dosw.bitacora.corte2.semana1;

import java.util.List;

public class Student {
    String id;
    String name;
    String team; // "ROSADO", "AZUL", "VERDE"
    List<Grade> grades;

    public String getTeam(){
        return team;
    }

    public String getName(){
        return name;
    }

    public List<Grade> getGrades(){
        return grades;
    }
}
