// pakiet, w której umieszczona jest klasa test. Pakiety tworzymy: prawy przycisk myszy na src -> new -> package -> nazwa pakietu ciągi liter (mogą być też cyfry) rozdzielone .
package pl.sda.test;

// import naszej klasy Human, która jest w innym pakiecie niż klasa Test

import pl.sda.humans.Human;
import pl.sda.humans.IdCard;
import pl.sda.humans.IdentificationDocument;
import pl.sda.humans.Passport;

import java.time.LocalDate;
import java.time.temporal.TemporalUnit;

public class Test {
    /*
    Realizacja zadania 2 Test Human  z listy D1
     */
    public static void testHuman() { // prosta metoda statyczna do sprawdzenia jak zostanie wyświetlony Human
        Human person = new Human(1); // utworzenie obiektu klasy Human i przypisanie do zmiennej person
        person.setName("Tomasz"); // ustawienie imienia używając settera
        person.setSurname("Lis"); // ustawienie nazwiska używając settera
        person.setPersonalIdentityNumber("12357890"); // ustawienie peselu przy użyciu peselu
        System.out.println(person); // wyświetlenie obiektu klasy person. Ta wersja System.out.println sama wewnątrz wywołuje metodę person.toString();
    }

    /* 3 metody z zadania nr 4 z listy D1 */
    public static void testPassport() {
        Passport passport = new Passport();//inicjalizacja obiektu klasy Passport
        passport.setBiometric(true); // ustawienie informacji, że jest biometryczny
        passport.setSeries("AWW"); // ustawienie serii
        passport.setIssueDate(LocalDate.now()); // ustawienie daty wydania na dziś. Zwróćcie uwagę na wygodną metodę LocalDate.now()
        passport.setExpirationDate(LocalDate.now().plusYears(10)); // podobnie jak wyżej LocalDate.now() użyte jako wartość wstawiana do pola.
        // Dwie różnice ustawiamy datę ważności dokumentu. na obiekcie reprezentującym dzisiejszą datę wywołana jest metoda plusYears(10).
        // Oznacza to, że dostaniemy datę za 10 lat.
        passport.setNumber("123567"); // ustawienie numeru dokumentu
        passport.setType(IdentificationDocument.Type.PASSPORT); // ustawienie typu dokumentu
        System.out.println(passport); // wyświetlenie paszportu
    }

    public static void testIdCard() {
        IdCard idCard = new IdCard();//inicjalizacja obiektu klasy IdCard
        idCard.setSeries("ASS"); // ustawienie serii
        idCard.setIssueDate(LocalDate.now()); // ustawienie daty wydania na dziś. Zwróćcie uwagę na wygodną metodę LocalDate.now()
        idCard.setExpirationDate(LocalDate.now().plusYears(10)); // podobnie jak wyżej LocalDate.now() użyte jako wartość wstawiana do pola.
        // Dwie różnice ustawiamy datę ważności dokumentu. na obiekcie reprezentującym dzisiejszą datę wywołana jest metoda plusYears(10).
        // Oznacza to, że dostaniemy datę za 10 lat.
        idCard.setNumber("123456"); // ustawienie numeru dokumentu
        idCard.setType(IdentificationDocument.Type.ID_CARD); // ustawienie typu dokumentu
        System.out.println(idCard); // wyświetlenie dowodu osobistego
    }

    public static void testDrivingLicence() {
        IdentificationDocument drivingLicence = new IdentificationDocument();//inicjalizacja obiektu klasy IdentificationDocument
        drivingLicence.setIssueDate(LocalDate.now()); // ustawienie daty wydania na dziś. Zwróćcie uwagę na wygodną metodę LocalDate.now()
        drivingLicence.setExpirationDate(LocalDate.now().plusYears(10)); // podobnie jak wyżej LocalDate.now() użyte jako wartość wstawiana do pola.
        // Dwie różnice ustawiamy datę ważności dokumentu. na obiekcie reprezentującym dzisiejszą datę wywołana jest metoda plusYears(10).
        // Oznacza to, że dostaniemy datę za 10 lat.
        drivingLicence.setNumber("12345/12/2143"); // ustawienie numeru dokumentu
        drivingLicence.setType(IdentificationDocument.Type.DRIVING_LICENCE); // ustawienie typu dokumentu
        System.out.println(drivingLicence); // wyświetlenie prawa jazdy
    }

    //metoda main służy nam do wywołania metod "testowych", które wyświetlą nam tworzone obiekty
    public static void main(String[] args) {
        System.out.println("Testuję osobę: ");
        testHuman();// wywołanie metody do zadania 2
        System.out.println("Testuję paszport: ");
        testPassport(); // wywołanie metody z zadania numer 4
        System.out.println("Testuję dowód osobisty: ");
        testIdCard(); // wywołanie kolejnej metody z zadania numer 4
        System.out.println("Testuję prawo jazdy: ");
        testDrivingLicence();
    }
}
