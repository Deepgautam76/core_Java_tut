// class A implements Runnable{
//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("Thread 1 is Run..");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("Tread 2 is running...");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class ThreadIn {
//     public static void main(String[] args) {
//         Runnable obj1 = new A();
//         Runnable obj2 = new B();

//        Thread t1=new Thread(obj1);
//        Thread t2=new Thread(obj2);
//        t1.start();
//        t2.start();

//     }
// }

///lanbda expression implimentaion
class count {
    int counte = 0;

    public synchronized  void counter() {
        counte++;
    }
}

public class ThreadIn {
    public static void main(String[] args) throws InterruptedException {
 
        count c=new count();

        Runnable obj = () -> {
            for (int i = 0; i < 100000; i++) {
                // System.out.println("Hi");
                // try {
                //     Thread.sleep(10);
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                // }
                c.counter();
            }
        };
        Runnable obj1 = () -> {
            for (int i = 0; i < 100000; i++) {
                // System.out.println("Hello");
                // try {
                //     Thread.sleep(10);
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                // }
                c.counter();
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();

        //This for completing the thread exicution
        t1.join();
        t2.join();

        System.out.println(c.counte);
    }
}