/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author AS KHAN
 */
public class TUMSupermarket {
    private  Checkout[] checkouts ;
    public TUMSupermarket(int size){
        if(size<=0) 
                         throw new IllegalArgumentException();
        checkouts = new Checkout[size];
        for (int i = 0; i < checkouts.length; i++) {
            checkouts[i] = new Checkout();
        }

    }

    public Checkout[] getCheckouts() {
        
        return checkouts;
    }
    
//methid for finding queue which lenght is smallest    
    public Checkout getCheckoutWithSmallestQueue()
    {
        int max = Integer.MAX_VALUE;
        int index=-1;
        for (int i=0;i< checkouts.length;i++)
        {
            if(checkouts[i].queueLength()<max)
            {
                max = checkouts[i].queueLength();
                index=i;
            }
        }
        return checkouts[index];
    }
    
//method to remove all customer from Checkout and send them to smallest queue 
    public void closeCheckout(int index)
    {
        if(checkouts.length<index+1)    
           throw new UnsupportedOperationException();
        if(checkouts.length==1) 
           throw new UnsupportedOperationException();
        Checkout [] check = new Checkout[checkouts.length-1];
        for (int i=0;i<checkouts.length-1;i++)
        {
            check[i] = new Checkout();
        }
        int k=0;
        for (int i=0;i<checkouts.length;i++)
        {
            if(i!=index) {
                check[k]=checkouts[i];
                k++;
            }
        }
        Queue<Customer> queue = checkouts[index].getQueue();
        Stack<Customer> stact = new LinkedStack<>();
        while (!queue.isEmpty())
        {
            stact.push(queue.dequeue());

        }
        checkouts = check;
        while(!stact.isEmpty())
        {
            stact.pop().goToCheckout(this);
        }
    }
    
    
 //mthod which sever checkout to each next customer   
    public void serveCustomers() {
        //using foreach loop to go though Checks Array
        for (Checkout checkout : checkouts) 
            checkout.serveNextCustomer();
    }
  
    
}
