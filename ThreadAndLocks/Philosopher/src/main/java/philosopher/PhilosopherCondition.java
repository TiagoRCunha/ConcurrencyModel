package philosopher;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import java.util.Random;

class PhilosopherCondition extends Thread {

  private boolean eating;
  private PhilosopherCondition left;
  private PhilosopherCondition right;
  private ReentrantLock table;
  private Condition condition;
  private Random random;
  private int thinkCount;

  public PhilosopherCondition(ReentrantLock table) {
    eating = false;
    this.table = table;
    condition = table.newCondition();
    this.random = new Random();
  }

  public void setLeft(PhilosopherCondition left) {
    this.left = left;
  }

  public void setRight(PhilosopherCondition right) {
    this.right = right;
  }

  public void run() {
    try {
      while (true) {
        think();
        eat();
      }
    } catch (InterruptedException e) {
    }
  }

  private void think() throws InterruptedException {
    table.lock();
    try {
      eating = false;
      left.condition.signal();
      right.condition.signal();
    } finally {
      table.unlock();
    }
    ++thinkCount;
    if (thinkCount % 10 == 0)
      System.out.println("Philosopher " + this + " has thought " + thinkCount + " times");
    Thread.sleep(1000);
  }

  private void eat() throws InterruptedException {
    table.lock();
    try {
      while (left.eating || right.eating)
        condition.await();
      eating = true;
    } finally {
      table.unlock();
    }
    Thread.sleep(1000);
  }
}