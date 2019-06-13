package com.example.designpatterns.iterator;

public class EmpoyeeListIterator implements Iterator {
    private EmployeeList employeeList;
    private int index;

    public EmpoyeeListIterator(final EmployeeList employeeList) {
        this.employeeList = employeeList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < employeeList.length()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Employee employee = employeeList.getEmployeeAt(index);
        index++;
        return employee;
    }
}
