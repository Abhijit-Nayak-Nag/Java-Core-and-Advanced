package gl.multithreadingAndexecutorservice.threadclass;

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before Sleep");
        Thread.sleep(10000);
        System.out.println("Wakeup");
        

 // if TestingSleep class wants to call sleep() method then it need to extend the thread class
//      public class TestingSleep extends Thread { now TestingSleep class able to call the sleep() method.
 //     TestingSleep.sleep(10000);

// Always remember sleep method is a static method, it can be only callable by using class
// name not using object name. because we know if a method is static then we can only call it
// using its class name,and we don't need to create any object for it. and one more thing if any
// class wants to use sleep() method then it need to extend the thread class then only the
// class will able to call sleep method with that particular class name.

    }
}
