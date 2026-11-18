package q10;
import java.util.ArrayList;
public class MyStack<E> extends ArrayList<E> {
    public void push(E e){
        add(e);
    }
    public E pop(){
        return isEmpty()?null:remove(size()-1);
    }
    public E peek(){
        return isEmpty()?null:get(size()-1);
    }
    public boolean isEmptyStack(){
        return isEmpty();
    }
    public int getSize(){
        return size();
    }
}
