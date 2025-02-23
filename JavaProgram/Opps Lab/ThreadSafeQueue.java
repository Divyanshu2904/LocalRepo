//Write a java program that utilizes the ConcurrentLinkedQueue class to implement a thread-safe queue.

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeQueue{

    // Create a thread-safe queue using ConcurrentLinkedQueue
    private static ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 3; i++) {
            final int producerId = i;
            executor.submit(() -> produce(producerId));
        }
        for (int i = 0; i < 3; i++) {
            final int consumerId = i;
            executor.submit(() -> consume(consumerId));
            }
            executor.shutdown();
            }
            public static void produce(int producerId) {
                for (int i = 0; i < 5; i++) {

        for (int i = 0; i < 2; i++) {
            final int consumerId = i;
            executor.submit(() -> consume(consumerId));
        }

        executor.shutdown();
    }

    private static void produce(int producerId) {
        for (int i = 0; i < 5; i++) {
            int item = producerId * 10 + i;
            queue.offer(item); 
            System.out.println("Producer " + producerId + " produced: " + item);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private static void consume(int consumerId) {
        for (int i = 0; i < 5; i++) {
            Integer item = queue.poll(); 
            if (item != null) {
                System.out.println("Consumer " + consumerId + " consumed: " + item);
            } else {
                System.out.println("Consumer " + consumerId + " found the queue empty.");
            }
            try {
                Thread.sleep(150); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
