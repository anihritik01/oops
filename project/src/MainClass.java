abstract class Person{
    String name;
    abstract protected String getName();
}

class Customer extends Person{
    String address;
    Integer budget;
    Float purchase;

    Customer(String name, String location, Integer budget, Float purchase){
        super.name = name;
        this.address = location;
        this.budget = budget;
        this.purchase = purchase;
    }
    String getAddress(){
        return this.address;
    }
    Integer getBudget(){
        return budget;
    }
    Float getPurchase(){
        return purchase;
    }
    @Override
    protected String getName() {
        return name;
    }
}

abstract class Employee extends Person{
    Integer employeeNumber;
    Float basicSalary;
    abstract Integer getEmployeeNumber();
    abstract Float getBasicSalary();
}

class Manager extends Employee{
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

class Secretary extends Employee{

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

public class MainClass {

    public static void main(String[] args){
        Customer customer = new Customer("Hrk", "india", 1000, Float.parseFloat(String.valueOf(500.56)));
        Manager manager = new Manager("Andrea", 01, Float.parseFloat(String.valueOf(500000)), 20000);
        SalesPerson salesPerson = new SalesPerson("Hritik", 02, Float.parseFloat(String.valueOf(500000)), 2000);
        Secretary secretary = new Secretary("Uv", 06, Float.parseFloat(String.valueOf(500000)));

        System.out.println("Manager details");
        System.out.println("name: " + manager.getName() + "\nEmployee Number: " + manager.getEmployeeNumber() +
                "\nSalary: " + manager.getBasicSalary() + "\n");

        System.out.println("Sales Person details");
        System.out.println("name: " + salesPerson.getName() + "\nEmployee Number: " + salesPerson.getEmployeeNumber() +
                "\nSalary: " + salesPerson.getBasicSalary() + "\n");

        System.out.println("Secretary details");
        System.out.println("name: " + secretary.getName() + "\nEmployee Number: " + secretary.getEmployeeNumber() +
                "\nSalary: " + secretary.getBasicSalary() + "\n");

        System.out.println("Customer details");
        System.out.println("name: " + customer.getName() + "\nAddress: " + customer.getAddress() +
                "\nBudget: " + customer.getBudget() + "\nPurchase: " + customer.getPurchase() + "\n");
    }
}
