package dosw.bitacora.corte2.semana1;

import java.time.LocalDate;

public class Grade {
    String subject; //"DOSW", "BD", "REDES"
    double score;
    LocalDate date;
    boolean passed;

    public double getScore(){
        return score;
    }

    public String getSubject(){
        return subject;
    }

    public boolean isPassed(){
        return passed;
    }
}
