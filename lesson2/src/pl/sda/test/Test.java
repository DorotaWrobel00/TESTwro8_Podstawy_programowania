// pakiet, w której umieszczona jest klasa test. Pakiety tworzymy: prawy przycisk myszy na src -> new -> package -> nazwa pakietu ciągi liter (mogą być też cyfry) rozdzielone .
package pl.sda.test;

// importy klas, które używamy w klasie Test a nie są w wym samym pakiecie. Jak widzisz są tu też klasy, które utworzyliśmy my :)
import pl.sda.company.Company;
import pl.sda.company.Employee;
import pl.sda.humans.Human;
import pl.sda.humans.IdCard;
import pl.sda.humans.IdentificationDocument;
import pl.sda.humans.Passport;

// ale też i takie z API Javy
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    // pole statyczne w klasie potrzebne od zadania 10 listy D1
    public static Company company;

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

    /* zadanie 6 z listy D1 */
    public static Employee testEmployee() {
        Employee employee = new Employee(2); // utworzenie pracownika i przypisanie do zmiennej
        employee.setName("Tomasz"); // ustawienie imienia
        employee.setSurname("Lis"); // ustawienie nazwiska
        employee.setPersonalIdentityNumber("1234567890"); // ustawienie peselu
        employee.setSystemId(1); // ustawienie  numeru sytemowego
        employee.setRole("Tech Lead"); // ustawienie roli
        List<IdentificationDocument> documents = new ArrayList<>(); // storzenie obiektu klasy ArrayList i przypisanie do zmiennej documents o interface List
        /*
            Interface List jest implementowany przez kilka klas między innymi ArrayList, dlatego do zmiennej tego typu można przypisać obiekt klasy ArrayList.
         */
        IdCard identificationDocument = new IdCard(); // utworzenie dowodu osobistego
        identificationDocument.setSeries("AEQ"); // ustawienie serii dowodu osobistego
        identificationDocument.setNumber("123512"); // ustawienie numeru dowodu osobistego
        identificationDocument.setIssueDate(LocalDate.now()); // ustawienie  daty dokumentu tożsamości. Pamiętasz co dawała metoda LocalDate.now()
        identificationDocument.setExpirationDate(LocalDate.now().plusYears(10)); // ustawienie daty ważności dokumentu. Pamiętasz co oznacza LocalDate.now().plusYears(10)?
        identificationDocument.setType(IdentificationDocument.Type.ID_CARD); // ustawienie typu dokumentu
        documents.add(identificationDocument); // dodanie dokumentu do zmiennej documents (jest to lista) przy pomocy metody add deklarowanej przez interface List a impleentowanej przez klasę ArrayList
        employee.setDocuments(documents); // ustawienie dokumentów pracownika listą documents stworzoną wcześniej
        System.out.println(employee); // wyświetlenie utworzonego pracownika
        return employee;  // aby ułatwić sobie kolejne zadanie zwracamy employee. Myślę, że zrozumiesz gdy dojdziesz do zadania 12 z listy d1.
    }

    // zadanie 10 lista d1
    public static void testCompany() {
        company = new Company(); // utworenie obiektu klasy Company i podstawienie referencji w statycznym polu company w klasie Test
        company.setName("Google"); // ustawienie nazwy
        company.addDepartment("IT"); // dodanie departamentu przy pomocy metody addDepartment na obiekcie company
        System.out.println(company); // wyświetlene firmy
    }

    // zadanie 12 lista d1
    public static void testAddEmployee() {
        Employee employee = testEmployee(); // wykorzystanie wcześniej przygotowanej metody, w której tworzyliśmy pracownika (wtedy ustawiliśmy wszystkie pola)
        company.addEmployee("IT", employee); // wywołanie metody add employee
        System.out.println(company); // ponowne wyświetlenie zawartości obiektu, który jest statycznie referencjonowany w polu statycznym w klasie Test
    }

    // zadanie 14 lista d1
    public static void testAddBoss() {
        Employee boss = new Employee(3); // stworzenie obiektu boss klasy Employee
        boss.setName("Boss"); // ustawienie  imienia
        boss.setSurname("Bosski"); // ustawienie nazwiska
        boss.setRole("Boss"); // ustawienie roli Boss
        company.addBoss("IT", boss); // wywołanie metody add boss na obiekcie klasy Company, która jest polem statycznym w klasie Test
        System.out.println(company); // wyświetlenie firmy ponownie
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
        testDrivingLicence(); // wywołanie meotdy z zadnia 4
        System.out.println("Testuję pracownika: ");
        testEmployee(); // wywołanie metody z zadania 6
        System.out.println("Testuję firmę: ");
        testCompany(); // wywołanie metody z zandania 10
        System.out.println("Testuję dodanie pracownika: ");
        testAddEmployee(); // wywołanie metody z zadania 12
        System.out.println("Testuję dodanie szefa: ");
        testAddBoss(); // wywołanie metody z zadania 14
    }
}
