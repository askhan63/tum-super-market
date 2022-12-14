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
public class ConnectStack<T> implements ConnectDataStructure<T>{
    private Stack<T> stack = new LinkedStack<>();
    public ConnectStack(Stack<T> stack)
    {
        this.stack=stack;
    }
    @Override
    public boolean hasNextElement() {
        if(stack.isEmpty())
            return false;
        else
        return true;
    }

    @Override
    public void addElement(T x) {
        stack.push(x);
    }

    @Override
    public T removeNextElement() {
        if(stack==null) 
            return null;
        else
        return stack.pop();
    }
}
