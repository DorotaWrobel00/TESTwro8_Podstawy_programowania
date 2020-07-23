package pl.sda.company;

import java.util.List;

/** Klasa departamentu stworzona na cele zadania 7 i 8 z listy d1 */
public class Department {
    private String name;
    private Employee boss;
    private List<Employee> employees;

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
