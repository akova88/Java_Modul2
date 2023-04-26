package Dsa_Stack_queue.queue.employer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employer {
    private String fullName;
    private boolean isMale;
    private LocalDate dOB;

    public Employer() {
    }

    public Employer(String fullName, boolean isMale, String dOB) {
        this.fullName = fullName;
        this.isMale = isMale;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dOB = LocalDate.parse(dOB,formatter);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public LocalDate getDOB() {
        return dOB;
    }

    public void setDOB(String dOB) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dOB = LocalDate.parse(dOB,formatter);
    }

    @Override
    public String toString() {
        return "Employer{" +
                "fullName='" + fullName + '\'' +
                ", isMale=" + isMale +
                ", dOB=" + dOB +
                '}';
    }
}
