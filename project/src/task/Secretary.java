package task;

class Secretary extends Employee {

    Secretary(String name, Integer id, Float salary){
        super.name = name;
        super.employeeNumber = id;
        super.basicSalary = salary;
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
        return basicSalary;
    }
}
