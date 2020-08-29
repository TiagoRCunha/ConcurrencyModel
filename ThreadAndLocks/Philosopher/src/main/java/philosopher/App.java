package philosopher;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class App {
  public static void main(String[] args) {
    // Chopstick left = new Chopstick(new Random().nextInt(10));
    // Chopstick right = new Chopstick(new Random().nextInt(10));

    // Philosopher onePhilosopher = new Philosopher(left, right);
    // onePhilosopher.run();

    // ReentrantLock leftLock = new ReentrantLock();
    // ReentrantLock rightLock = new ReentrantLock();

    // PhilosopherTimeOut philosopherTimeOut = new PhilosopherTimeOut(leftLock,
    // rightLock);
    // philosopherTimeOut.run();

    ReentrantLock table = new ReentrantLock();

    PhilosopherCondition philosopherCondition = new PhilosopherCondition(table);
    philosopherCondition.setLeft(philosopherCondition);
    philosopherCondition.setRight(philosopherCondition);

    philosopherCondition.run();

  }
}