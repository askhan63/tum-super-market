/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author AS KHAN
 */
public class List<T> {
    private final T info;
  /*
    * As List has a relation with itselef
    * As Mentioned in the ULM
    * So for next will have next Variable of the Same class
  */
    private List<T> next;
  /*
    * Getter Method For Info variable
  */
    public T getInfo() {
        return info;
    }
  /*
    * Getter Method For next variable
  */
    public List<T> getNext() {
        return next;
    }
  /*
    * Constructor with 1 paarameter
    * First Time this Constructor will be used
    * next time List(T , List) will be used
  */
    public List(T x) {
        info = x;
        next = null;
    }
  /*
    * Constructor with 2 paarameter
    * For every next Product this Constructor Will be used
    * First time List(T) will be used
  */
    public List(T t, List<T> l) {
        info = t;
        next = l;
    }
  /*
    * Insertion Method with Generatic type
    * make the next List with Given data
  */
    public void insert(T t) {
        next = new List<T>(t, next);
    }
  /*
    * deletion Method with no parameter
    * deleted item form head/left
  */
    public void delete() {
        if (next != null)
            next = next.next;
    }
  /*
    * method to Calculate and Return Length of List
    * make the next List with Given data
  */
    public int length() {
        /*
            * the length will be 1 as info is Final 
            * we can add a check here 
            *  if(info==null)
            *    length=0;
            * but that case wont occur bcz 
            * we won't be able to access 
            * lenght() method
        */
        
        int length = 1;
       
        List<T> t = next;
        while(t!=null){
            t = t.next;
            length++;
        }
      
        return length;
    }

    @Override
    public String toString() {
        String result = "[" + info;
        List<T> t = next;
          while(t!=null){
            result = result + ", " + t.info;
            t = t.next;  
        }
        return result + "]";
    }
}
