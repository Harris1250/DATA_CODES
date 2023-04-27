import java.util.ArrayDeque;

public class MaxQueue {

    // Initialing the array dequeue
    // ONe that enqueues the input
    // One that enqueues the the max value of the inputs from the main Queue
    ArrayDeque<Integer> mainQueue = new ArrayDeque<>();
    ArrayDeque<Integer> maxQueue = new ArrayDeque<>();


    // Method that adds the value into the main and max queue
    public void enqueue(int value) {
        mainQueue.addLast(value);

        // While the max queue is not empty and the last value in the queue is not less than the new value
        while (!maxQueue.isEmpty() && maxQueue.getLast() < value) {
            // that current value is removed from the max queue
            maxQueue.removeLast();
        }

        // And a new value is added to the max queue
        maxQueue.addLast(value);
    }

    public int dequeue() {
        int value = mainQueue.removeFirst();

        if (value == maxQueue.getFirst()) {
            maxQueue.removeFirst();
        }

        return value;
    }

    // Method that returns the first value in the max queue, as the first value is the max value in both queues
    public int getMax() {
        return maxQueue.getFirst();
    }

    public static void main(String[] args) {

        MaxQueue queue = new MaxQueue();

        // Input for the main queue and max queue
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.getMax());

    }

}
