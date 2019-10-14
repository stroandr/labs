
package de.gedoplan.seminar.java.exercise.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PrioritizedListTest {

  public static void main(String[] args) {
    Task task1a = new Task("Task 1a", 1);
    Task task1b = new Task("Task 1b", 1);
    Task task2a = new Task("Task 2a", 2);
    Task task2b = new Task("Task 2b", 2);
    Task task3a = new Task("Task 3a", 3);
    Task task3b = new Task("Task 3b", 3);

    // Hier statt ArrayList PrioritizedList verwenden!
    Collection<Task> actual = new ArrayList<>();

    // actual = new PrioritizedList<>();

    /*
     * Vergleichs-Collection sortiert nach description. Die add-Operationen müssen daher für Einträge gleicher Prio in
     * alphabetischer Reihenfolge gemacht werden!
     */
    SortedSet<Task> expected = new TreeSet<>(new Comparator<Task>() {
      @Override
      public int compare(Task task1, Task task2) {
        return task1.getDescription().compareTo(task2.getDescription());
      }
    });

    actual.add(task2a);
    expected.add(task2a);
    System.out.println("Nach add(2a): " + actual);

    actual.add(task1a);
    actual.add(task1b);
    expected.add(task1a);
    expected.add(task1b);
    System.out.println("Nach add(2a,1a,1b): " + actual);

    actual.add(task3a);
    expected.add(task3a);
    System.out.println("Nach add(2a,1a,1b,3a): " + actual);

    actual.add(task2b);
    actual.add(task3b);
    expected.add(task2b);
    expected.add(task3b);
    System.out.println("Nach add(2a,1a,1b,3a,2b,3b): " + actual);
  }
}
