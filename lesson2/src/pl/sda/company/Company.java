package pl.sda.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa reprezentująca firmę
 * wykonana w ramach zadania 9 z listy D1
 */
public class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public void addDepartment(String name){
        Department department = new Department();
        department.setName(name);
        department.setEmployees(new ArrayList<>());
        departments.add(department);
    }

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
