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
//A generic  LinkedStack implements A generic Stact Interface

public class LinkedStack<T> implements Stack<T> {
    private List<T> list;
  
    @Override
    public void push(T t) {
        list = new List<T>(t,list);
    }

    @Override
    public T pop() {
        if(list==null)
            return null;
        else{
        T rem = list.getInfo();
        list=list.getNext();
        return rem;
        }
    }
      @Override
    public int size() {
        if(list==null) 
            return 0;
        else
        return list.length();
    }

    @Override
    public boolean isEmpty() {
        return list==null;
    }

}
