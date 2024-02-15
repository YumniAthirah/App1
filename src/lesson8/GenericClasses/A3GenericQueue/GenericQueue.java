package lesson8.GenericClasses.A3GenericQueue;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue<T> {
    private Queue<T> queue;

    public GenericQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (queue.size() == 0) {
            System.out.println("Queue is empty");
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void printQueue() {
        System.out.println("queue:");
        for (T item : queue) {
            System.out.println(item);
        }
        System.out.println();
    }

}
