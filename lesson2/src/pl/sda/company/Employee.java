// pakiet company - bo pracownicy są powiązani z firmą i najlepiej agregować klasy tak aby reprezentowały jakąś dziedzinę tematyczną
package pl.sda.company;

//import klasy po któej dziedziczymy bo jest w innym pakiecie
import pl.sda.humans.Human;

/**
 * Klasa pracownika stworzona na cele zadania 5 z listy D1
 */
public class Employee extends Human {
    private long systemId; // dodatkowe pole oznaczające id systemowe pracownika
    private String role; // pole przechowujące rolę pracownika w departamencie

    /**
     * Metoda konstruktora parametryzowana wymaganym parametrem id
     * wymagana bo Human ma konstruktor parametryczny
     * @param id - wymagany parametr konstruktora
     */
    public Employee(long id) {
        super(id);
    }


    // wygenerowane gettery, settery i toString
    public long getSystemId() {
        return systemId;
    }

    public void setSystemId(long systemId) {
        this.systemId = systemId;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "systemId=" + systemId +
                ", role='" + role + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalIdentityNumber='" + personalIdentityNumber + '\'' +
                '}';
    }
}
