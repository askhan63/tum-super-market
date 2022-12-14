/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author AS KHAN
 */
public class Checkout {
   private  Queue<Customer> customers;
    private  Queue<Product> bandBeforeCashier;
    private  Queue<Product> bandAfterCashier;
    public Checkout()
    {
        customers = new LinkedQueue<>();
        bandBeforeCashier = new LinkedQueue<>();
        bandAfterCashier = new LinkedQueue<>();

    }

    public Queue<Customer> getCustomers() {
        return customers;
    }


    public Queue<Product> getBandAfterCashier() { 
        
        return bandAfterCashier;
    }

    public Queue<Product> getBandBeforeCashier() {
        return bandBeforeCashier;
    }

    public Queue<Customer> getQueue() {
        return customers;
    }
    public int queueLength()
    {
        return customers.size();
    }
    public void serveNextCustomer()
    {
        if(customers==null)
            throw new UnsupportedOperationException();
        Customer clien1 = customers.dequeue();
        if(clien1==null) return;
        clien1.placeAllProductsOnBand(bandBeforeCashier);
        double sum=0;
        while (!bandBeforeCashier.isEmpty())
        {

            Product fis = bandBeforeCashier.dequeue();
            bandAfterCashier.enqueue(fis);
            sum+= fis.getPrice();
        }
        clien1.pay(sum);
        clien1.takeAllProductsFromBand(bandAfterCashier);

    } 
    public int customerQueueLength(){
        return customers.size();
    }
}
