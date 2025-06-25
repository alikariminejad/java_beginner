public class Main {
    public static void main(String[] args)  throws InterruptedException {
        /*
        * thread = A thread of execution in a program (Kind of like a virtual CPU)
        * The JVM allows an application to have multiple threads running concurrency
        * Each thread can execute parts of your code in parallel with the main thread
        * Each thread has a priority.
        * Threads with higher priority are executed in preferenced compared to threads with a lower priority
        *
        * The Java Virtual Machine continues to execute threads until either of the following occurs
        *   1. The exit method of class Runtime has been called
        *   2. All user threads have died
        *
        * When a JVM starts up, there is a thread which calls the main method
        * This thread is called "main"
        *
        * Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
        * JVM terminates itself when all user threads (non-daemon threads) finish their execution*/

//        System.out.println(Thread.activeCount());
//        Thread.currentThread().setName("MAIN");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
//        System.out.println(Thread.currentThread().isAlive());
//
//        for(int i =3;i>0;i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("it's done");

        MyThread thread2 = new MyThread();
        thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());
        System.out.println(thread2.isAlive());
        thread2.start();
        System.out.println(thread2.isAlive());
        System.out.println(thread2.getName());
        thread2.setName("MyThread");
        System.out.println(thread2.getName());
        thread2.setPriority(1);
        System.out.println(thread2.getPriority());
        System.out.println(Thread.activeCount());
    }
}