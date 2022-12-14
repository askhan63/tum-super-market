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
public interface  ConnectDataStructure<T> {
      boolean hasNextElement();
    void addElement(T x);
    T removeNextElement();
}
