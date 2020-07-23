// umieszczamy Departament w pakiecie company bo tak najlepiej pasuje tematycznie
package pl.sda.company;

// import interface List z API Javy.
import java.util.List;

/** Klasa departamentu stworzona na cele zadania 7 i 8 z listy d1 */
public class Department {
    private String name; // nazwa departamentu
    private Employee boss; // szef departamentu, jest to obiekt klasy employee bo też jest pracownikiem
    private List<Employee> employees; // lista pracowników - lista to struktura danych reprezentowana przez interface List w javie
    /*
        Zapis List<Employee> oznacza, że obiekty przechowywane w liście są klasy Employee. Innymi słowy Lista przechowuje obiekty pracowników.
        Aby dobrze to zrozumieć warto poczytać o klasach generycznych, np. tu: http://jsystems.pl/blog/artykul.html?id=537
        Jest to jednak temat wykraczający poza nasz kurs. Tu przyjmijmy po prostu do wiadomości, że lista podobnie jak tablica będzie przechowywała
        pewne obiekty lub wartości typy prymitywnej, z tą różnicą, że rozmiar tablicy jest tynamicznie alokowany i nie musimy podawać wielkości przy jej tworzeniu.
     */

    /* wygenerowane metody geterów, setterów i to String poniżej */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", boss=" + boss +
                ", employees=" + employees +
                '}';
    }
}
