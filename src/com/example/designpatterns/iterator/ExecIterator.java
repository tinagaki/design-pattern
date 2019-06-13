package com.example.designpatterns.iterator;

public class ExecIterator {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList(4);
        employeeList.add(new Employee("Tarou_Tanaka", "C001"));
        employeeList.add(new Employee("Hanako_Yamada", "C002"));
        employeeList.add(new Employee("Yuuya_Suzuki", "C003"));
        employeeList.add(new Employee("Kanako_Satou", "C004"));
        Iterator it = employeeList.iterator();
        while (it.hasNext()) {
            Employee employee = (Employee) it.next();
            System.out.println(employee.getName() + ":" + employee.getEmployeeCode());
        }
    }
}
