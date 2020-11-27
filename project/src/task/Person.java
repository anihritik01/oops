package task;

abstract public class Person{
    String name;
    abstract protected String getName();

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