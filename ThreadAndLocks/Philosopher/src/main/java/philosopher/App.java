package philosopher;

import java.util.concurrent.locks.ReentrantLock;

public class App {
  public static void main(String[] args) {

    ReentrantLock table = new ReentrantLock();

    Philosopher philosopher = new Philosopher(table);
    philosopher.setLeft(philosopher);
    philosopher.setRight(philosopher);

    philosopher.run();

  }
}