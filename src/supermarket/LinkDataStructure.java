/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author AS KHAN
 */
public class LinkDataStructure<T> {
  private ConnectDataStructure<T> first,last;
    public LinkDataStructure(ConnectDataStructure<T> f,ConnectDataStructure<T> l )
    {
        this.first = f;
        this.last = l;
    }
    public boolean moveNextFromFToL()
    {
        if(!first.hasNextElement()) return false;
        T rem = first.removeNextElement();
        last.addElement(rem);

        return true;
    }
    public void moveAllFromFToL()
    {
        while(first.hasNextElement()) {
            T rem = first.removeNextElement();
            last.addElement(rem);
        }

    }  
}
