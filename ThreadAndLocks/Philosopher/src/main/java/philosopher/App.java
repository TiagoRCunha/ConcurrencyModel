package philosopher;

import java.util.concurrent.locks.ReentrantLock;

public class App {
  public static void main(String[] args) {

    ReentrantLock leftLock = new ReentrantLock();
    ReentrantLock rightLock = new ReentrantLock();

    Philosopher philosopherTimeOut = new Philosopher(leftLock, rightLock);
    philosopherTimeOut.run();

  }
}