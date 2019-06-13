package com.example.designpatterns.iterator;

public class EmployeeList implements Aggregate {

    private Employee[] employees;
    private int last = 0;

    public EmployeeList(int maxsize) {
        this.employees = new Employee[maxsize];
    }

    public void add(Employee employee) {
        this.employees[last] = employee;
        last++;
    }

    public int length() {
        return last;
    }

    public Employee getEmployeeAt(int index) {
        return employees[index];
    }

    @Override
    public Iterator iterator() {
        return new EmpoyeeListIterator(this);
    }
}
