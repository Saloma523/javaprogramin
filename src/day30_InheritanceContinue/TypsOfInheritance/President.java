package day30_InheritanceContinue.TypsOfInheritance;

import java.time.LocalDate;

public class President extends Person {
    private LocalDate electedDate;

    public President(String name, char gender, LocalDate DOB, LocalDate eletedDate) {
        super(name, gender, DOB);
        setElectedDate(eletedDate);
    }

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }
}
