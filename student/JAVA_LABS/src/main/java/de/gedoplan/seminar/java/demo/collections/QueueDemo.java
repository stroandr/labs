package de.gedoplan.seminar.java.demo.collections;

import java.util.*;

public class QueueDemo {
  // Queue ab Java 5
  public static void demo1() {
    Queue queue = new LinkedList();

    queue.offer("eins");
    queue.offer("zwei");
    queue.offer("drei");

    while (!queue.isEmpty()) {
      System.out.println(queue.remove());
    }
  }

  public static void demo2() {
    Queue queue = new PriorityQueue();

    queue.offer("eins");
    queue.offer("zwei");
    queue.offer("drei");

    while (!queue.isEmpty()) {
      System.out.println(queue.remove());
    }
  }

  public static void main(String[] args) {
    // demo1();
    // demo2();
  }
}
