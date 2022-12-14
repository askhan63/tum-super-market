/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author AS KHAN
 */
public class Product {
   private String name;
   private  double price;

    public Product(String name, double price){
        if(name == null || price <=0) {
                      throw new IllegalArgumentException();
        }
        else{
        this.name = name;
        this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + '}';
    }
    
}
