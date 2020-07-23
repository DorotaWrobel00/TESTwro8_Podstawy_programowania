package pl.sda.company;

import pl.sda.humans.Human;

/**
 * Klasa pracownika stworzona na cele zadania 5 z listy D1
 */
public class Employee extends Human {
    private long systemId;
    private String role;

    /**
     * Metoda konstruktora parametryzowana wymaganym parametrem id
     *
     * @param id - wymagany parametr konstruktora
     */
    public Employee(long id) {
        super(id);
    }

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
