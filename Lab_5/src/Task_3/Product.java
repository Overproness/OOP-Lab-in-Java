package Task_3;

import java.util.ArrayList;

public class Product {
    String name;
    static int id;
    int quantity;
    double price;
    ArrayList<Product> products=new ArrayList<Product>();

    Product(String _name,int _quantity, double _price){
        name=_name;
        quantity=_quantity;
        price=_price;
        id++;
    }

    public Product addNewProduct(String _name,int _quantity, double _price){
        Product someProduct= new Product(_name, _quantity, _price);
        products.add(someProduct);
        return someProduct;
    }

    public Product addNewProduct(Product someProduct){
        products.add(someProduct);
        return someProduct;
    }

    public int totalInventory(){
        int sum=0;
        for(Product p:products){
            sum+=p.quantity;
        }
        return sum;
    }

    public void displayInfo(){
            System.out.println("The name of the Product is: "+name+
            "\nThe Quantity of the Product is: "+quantity+
            "\nThe Price of the Product is: "+price+
            "\nThe id of the Product is: "+id);
    }

    public static void main(String[] args) {
        Product prod1=new Product("Product1", 34, 231);
        Product prod2=prod1.addNewProduct("Product2",23,8423);
        prod1.displayInfo();
        System.out.println("The Total Inventory is: "+prod2.totalInventory());
    }
}
