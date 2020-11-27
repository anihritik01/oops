package task;

class Manager extends Employee {
    Integer allowence;

    Manager(String name, Integer id, Float salary, Integer allowence){
        super.name = name;
        super.employeeNumber = id;
        super.basicSalary = salary;
        this.allowence = allowence;
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    Integer getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    Float getBasicSalary() {
        return basicSalary + this.allowence;
    }

}