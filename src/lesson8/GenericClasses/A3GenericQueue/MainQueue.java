package lesson8.GenericClasses.A3GenericQueue;

public class MainQueue {
    public static void main(String[] args) {
        //Integer
        System.out.println("Integer Queue:");
        GenericQueue<Integer> intQueue = new GenericQueue<>();
        intQueue.enqueue(9);
        intQueue.enqueue(34);
        intQueue.enqueue(53);
        intQueue.printQueue();
        intQueue.dequeue();
        intQueue.printQueue();
        System.out.println("Is the queue Empty: " + intQueue.isEmpty());

        //String
        System.out.println("String Queue:");
        GenericQueue<String> stringQueue = new GenericQueue<>();
        stringQueue.enqueue("Didi");
        stringQueue.enqueue("Jojo");
        stringQueue.printQueue();
        stringQueue.dequeue();
        stringQueue.dequeue();
        stringQueue.printQueue();
        System.out.println("Is the queue Empty: " + stringQueue.isEmpty());

        //Double
        System.out.println("Double Queue:");
        GenericQueue<Double> doubleQueue = new GenericQueue<>();
        doubleQueue.enqueue(3.5);
        doubleQueue.enqueue(14.6);
        doubleQueue.enqueue(32.6);
        doubleQueue.printQueue();
        doubleQueue.dequeue();
        doubleQueue.dequeue();
        doubleQueue.printQueue();
        System.out.println("Is the queue Empty: " + doubleQueue.isEmpty());
    }
}
