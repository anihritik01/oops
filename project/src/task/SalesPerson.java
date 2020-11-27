package task;

class SalesPerson extends Employee {
    Integer commission;

    SalesPerson(String name, Integer id, Float salary, Integer commission){
        super.name = name;
        super.employeeNumber = id;
        super.basicSalary = salary;
        this.commission = commission;
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
        return basicSalary + this.commission;
    }
}