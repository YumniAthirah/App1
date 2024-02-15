package lesson8.GenericClasses.A1GenericStack;

import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> stack;

    public GenericStack(){
        stack = new ArrayList<>();
    }

    public void push(T item){
        stack.add(item);
    }

    public T pop(){
        if(stack.size() == 0){
            System.out.println("Stack is empty"); 
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        System.out.println("stack:");
        for(int i = stack.size() - 1; i >= 0 ; i--){
            System.out.println(stack.get(i));
        }
        System.out.println();
    }

}
