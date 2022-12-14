/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarket;

/**
 *
 * @author AS KHAN
 */
//A Generic Queue Implementing DataStructue
public interface Queue<T> extends DataStructure{
    abstract void enqueue(T t);    
    abstract T dequeue();
  @Override
 abstract int size();  
    @Override
    abstract boolean isEmpty();
}
