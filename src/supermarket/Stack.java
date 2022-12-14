/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarket;

/**
 *
 * @author AS KHAN
 * @param <T>
 */
//A Generic Stact Implementing DataStructue
public interface Stack<T> extends DataStructure {
    abstract void push(T t);   
    abstract T pop();
    @Override
 abstract int size();  
    @Override
    abstract boolean isEmpty();
}
