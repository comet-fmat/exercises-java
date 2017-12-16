
//BEGIN SOLUTION
public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String name, double price, int ammount) {
        this.name = name;
        this.price = price;
        this.amount = ammount;
    }
    
    public void printProduct(){
        System.out.println(this.name+", price "+this.price+", amount "+this.amount);
    }
    
    
}
//END SOLUTION
