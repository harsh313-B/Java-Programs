// Class representing a shared resource
class SharedResource {

    // Synchronized method ensures mutual execution
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " : " + (n * i));
            try {
                Thread.sleep(500); // Pause to show synchronization clearly
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread class
class MyThread extends Thread {
    SharedResource resource;
    int number;

    // Constructor
    MyThread(SharedResource resource, int number) {
        this.resource = resource;
        this.number = number;
    }

    // Thread execution
    public void run() {
        resource.printTable(number);
    }
}

// Main class
public class SynchronizationDemo {
    public static void main(String[] args) {

        // Shared object
        SharedResource obj = new SharedResource();

        // Create multiple threads accessing same resource
        MyThread t1 = new MyThread(obj, 5);
        MyThread t2 = new MyThread(obj, 10);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        // Start threads
        t1.start();
        t2.start();
    }
}
