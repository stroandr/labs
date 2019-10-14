
package de.gedoplan.seminar.java.exercise.generics;

public class Task implements Prioritized {
  private String description;
  private int priority;

  public Task(String description, int priority) {
    super();
    this.description = description;
    this.priority = priority;
  }

  public String getDescription() {
    return this.description;
  }

  @Override
  public int getPriority() {
    return this.priority;
  }

  @Override
  public String toString() {
    return "Task [description=" + this.description + ", priority=" + this.priority + "]";
  }

}
