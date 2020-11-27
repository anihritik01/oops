package task;

abstract class Employee extends Person {
    Integer employeeNumber;
    Float basicSalary;
    abstract Integer getEmployeeNumber();
    abstract Float getBasicSalary();
}