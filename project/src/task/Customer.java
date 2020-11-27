package task;

class Customer extends Person {
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