/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author AS KHAN
 */
public class Customer {
       private final String name;
    private  double money;
    private  Stack<Product> productsInBasket;
    public Customer(String name, double mon)
    {

        if(name==null || mon <= 0)
        {
                      throw new IllegalArgumentException();
        }
        else{
               productsInBasket  = new LinkedStack<>();
        this.name = name;
        this.money = mon;
        }
     

    }

//    public Stack<Product> getProducts() {
//        return productsInBasket;
//    }

      public boolean hasMoney() {
      return money>0;
      }
    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }
 
    public void addProductToBasket(Product product)
    {
        if(product==null) return;
        productsInBasket.push(product);
    }
 public Stack<Product> getProductsInBasket()
    {
        return productsInBasket;
    }
    public void placeAllProductsOnBand(Queue<Product> band)
    {
        ConnectStack<Product> cart1 = new ConnectStack<>(productsInBasket);
        ConnectQueue<Product> queueConnect = new ConnectQueue<>(band);
        LinkDataStructure<Product> dataSL = new LinkDataStructure<>(cart1,queueConnect);
        dataSL.moveAllFromFToL();

    }  
         public void takeAllProductsFromBand(Queue<Product> band )
    {
           ConnectStack<Product> cart1 = new ConnectStack<>(productsInBasket);
        ConnectQueue<Product> queueConnect = new ConnectQueue<>(band);
        LinkDataStructure<Product> dataSL = new LinkDataStructure<>(queueConnect,cart1);
        dataSL.moveAllFromFToL();  
    }
    public void pay(double x) {
        if (x < 0 || money < 0 || money < x) {
          throw new UnsupportedOperationException();
        }
        //amount paid and detected from money
        money-=x;
      
    }

   
    public void goToCheckout(TUMSupermarket superM)
    {
        if(superM==null)
                    throw new IllegalArgumentException();
        Checkout check = superM.getCheckoutWithSmallestQueue();
        check.getQueue().enqueue(this);
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", money=" + money + ", cart=" + productsInBasket + '}';
    }
    
    
     
}
