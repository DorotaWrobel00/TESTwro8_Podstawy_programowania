// klasa firmy naturalnie najlepiej pasuje do pakietu company
package pl.sda.company;

// import klasy ArrayList (konkretna implementacja interface List). Dobrze wiedzieć, że to implementacja listy oparta na tablicy. Nie jest to jednak wiedza wymagana na kursie

import java.util.ArrayList;
// import interface List
import java.util.List;

/**
 * Klasa reprezentująca firmę
 * wykonana w ramach zadania 9 z listy D1
 */
public class Company {
    private String name; // pole z nazwą firmy
    private List<Department> departments = new ArrayList<>(); // Podobnie jak było to w klasie Department i tu używamy interface List do kolekji pewnych obiektów
    // tym razem przechowujemy listę departamentu. Od razu inicjalizujemy ją obiektem klasy ArrayList. Możemy tak dlatego, że ArrayList implementuje interface List.
    // Oczywiście można zastanawiać się jak ArrayList działa, lecz przekracza to materiał, który przerabiamy w ramach zajęć
    // Przyjmujemy, że jest to kolekcja elementów o dynamicznej alokacji


    /**
     * Metoda dodaje departament o podanej nazwie do firmy
     *
     * @param name - rządana nazwa nowego deparamentu
     */
    public void addDepartment(String name) {
        Department department = new Department(); // inicjalizacja obiektu departamentu i przypisanie do zmiennej
        department.setName(name); // ustawienie nazwy departamentu na obiekcie referencjonowanym w zmiennej
        department.setEmployees(new ArrayList<>()); // zainicjalizowanie wartości pola employees nowym obiektem klasy array List. Jest to wtedy pusta lista
        departments.add(department); // wywołanie na polu departments referencjonującego do obiektu spełniającego interface List, metody add powoduje dodanie obiektu department do listy departamentów
    }

    /**
     * Metoda znajdowania departamentu o podanej nazwie, zaimplementowana w ramach zadania 11 z listy D1
     *
     * @param departmentName - nazwa departamentu
     * @return znaeleziony departament, null jeśli departament nie istnieje
     */
    public Department findDepartment(String departmentName) {
        for (Department department : departments) { // for each na obiektach z listy w polu departments
            if (department.getName() != null && department.getName().equals(departmentName)) { // warunek jeśli dany departament posiada daną nazwę
                return department; // specjalne zachowanie zwróć departament. I metoda się tu skończy w momencie gdy znajdzie departament
            }
        }
        return null; // jeśli żaden z departamentów
    }

    /**
     * Metoda add employee wykonana na cele zadania 11 z listy D1
     * * 4. Metoda addEmployee powinna wykorzystać departmentName do wyszukania departamentu metodą findDepartment
     * * 5. Metoda addEmployee powinna dodać pracownika do listy pracowników departamentu
     *
     * @param departmentName
     * @param employee
     */
    public void addEmployee(String departmentName, Employee employee) {
        Department department = findDepartment(departmentName); // wywołanie metody wyszukania departamentu  i przypisanie wyniku do zmiennej
        if (department != null) { // sprawdzenie czy znaleziony wynik nie jest pusty, jeśli nie jest  próbujemy podjąć pewne działania
            if (department.getEmployees() == null) { // jeśli lista pracowników departamentu nie jest ustawiona - pole przechowuje wartość null
                department.setEmployees(new ArrayList<>()); // ustawiamy polę nową listą - nowy obiekt klasy ArrayList
            }
            department.getEmployees().add(employee); // do listy pracowników znalezionego pracownika dodajemy pracownika z parametru metody
        }
    }

    /**
     * Metoda add boss zaimplementowana w ramach zadania 13 z listy d1
     *
     * @param departmentName - nazwa departamentu
     * @param boss           - obiekt szefa departamentu
     */
    public void addBoss(String departmentName, Employee boss) {
        Department department = findDepartment(departmentName); // wywołanie metody wyszukania departamentu  i przypisanie wyniku do zmiennej
        if (department != null) { // sprawdzenie czy znaleziony wynik nie jest pusty, jeśli nie jest  próbujemy podjąć pewne działania
            department.setBoss(boss); // na znalezionym obiekcie klasy departament ustawiamy referencję do szefa w polu boss
        }
    }


    /* gettery, settery i  toString wygenerowane automatycznie */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
