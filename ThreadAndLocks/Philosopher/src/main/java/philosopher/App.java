package philosopher;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class App {
  public static void main(String[] args) {
    Chopstick left = new Chopstick(new Random().nextInt(10));
    Chopstick right = new Chopstick(new Random().nextInt(10));

    Philosopher onePhilosopher = new Philosopher(left, right);
    onePhilosopher.run();

  }
}