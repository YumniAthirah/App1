package lesson8.GenericClasses.A1GenericStack;

public class MainStack {
    public static void main(String[] args) {
        //Integer
        System.out.println("Integer Stack:");
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(5);
        intStack.push(13);
        intStack.push(90);
        intStack.printStack();
        intStack.pop();
        intStack.printStack();
        System.out.println("Is the stack Empty: " + intStack.isEmpty());

        //String
        System.out.println("String Stack:");
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Ritsumeikan");
        stringStack.push("Himeji");
        intStack.printStack();
        intStack.pop();
        intStack.pop();
        intStack.printStack();
        System.out.println("Is the stack Empty: " + stringStack.isEmpty());

        //Double
        System.out.println("Double Stack:");
        GenericStack<Double> doubleStack = new GenericStack<>();
        doubleStack.push(3.6);
        doubleStack.push(1.0);
        doubleStack.push(0.9);
        doubleStack.printStack();
        doubleStack.pop();
        doubleStack.printStack();
        System.out.println("Is the stack Empty: " + doubleStack.isEmpty());
    }
}
