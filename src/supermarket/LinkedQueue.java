/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author AS KHAN
 * @param <T>
 */
//A generic LinkedQueue implements A generic Queue Interface
public class LinkedQueue <T> implements Queue<T>{
 private List<T> queue;
    @Override
    public void enqueue(T t) {
        List<T> temp = queue;
        while(temp!=null && temp.getNext()!=null)
            temp=temp.getNext();
        if(temp!=null) temp.insert(t);
        else
        {
            queue = new List<T>(t,null);
        }
    }

    @Override
    public T dequeue() {
        if(queue==null) 
               return null;
        else{
        T rem = queue.getInfo();
        queue=queue.getNext();
        return rem;
           }
    }

    @Override
    public int size() {
         if(queue==null) 
             return 0;
         else
        return queue.length();
    }

    @Override
    public boolean isEmpty() {
        return queue==null;
    }
    
}
