package pl.sda.humans;

import java.time.LocalDate;

/**
 * Część pierwsza zadania 3 z listy D1. Klasa dokumentów identyfikacyjnych.
 */
public class IdentificationDocument {
    protected Type type; // pole referencjonujące do wartości enum reprezentującego typ dokumentu
    protected String number; // pole referencjoonujące do obiektu String przechowywującego numer dokumentu
    protected LocalDate issueDate; // pole referencjonujące do obiektu klasy java.time.LocalDate reprezentującego datę wystawienia
    protected LocalDate expirationDate; // pole referencjonujące do obiektu klasy java.time.LocalDate reprezentującego datę ważności


    /*
        Gettery i settery wygenerowane -> pamiętajcie alt+insert -> Getters and Setters
     */
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /*
        Metoda wygenerowana  alt+insert -> toString
     */
    @Override
    public String toString() {
        return "IdentificationDocument{" +
                "type=" + type +
                ", number='" + number + '\'' +
                ", issueDate=" + issueDate +
                ", expirationDate=" + expirationDate +
                '}';
    }

    // typ wyliczeniwy z wartościami dopuszczalnymi dla typu dokumentu
    public enum Type {
        PASSPORT,
        ID_CARD,
        STUDENT_CARD,
        DRIVING_LICENCE
    }
}
