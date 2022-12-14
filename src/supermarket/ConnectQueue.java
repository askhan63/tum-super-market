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
public class ConnectQueue<T> implements ConnectDataStructure<T> {
     private  Queue<T> queue = new LinkedQueue<>();
    public ConnectQueue(Queue<T> queue)
    {
        this.queue=queue;
    }
    @Override
    public boolean hasNextElement() {
        return !queue.isEmpty();
    }

    @Override
    public void addElement(T x) {
        queue.enqueue(x);
    }

    @Override
    public T removeNextElement() {
        if(queue==null) 
            return null;
        else
        return queue.dequeue();
    }   
}
