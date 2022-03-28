package models;

import java.util.Date;

public class Employee extends Person {

    private String level;
    private String position;
    private long salary;

    public Employee(int id, String name, Date birthDay, String sex, String identityCardNumber, String phoneNumber, String email, String address, String level, String position, long salary) {
        super(id, name, birthDay, sex, identityCardNumber, phoneNumber, email, address);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}