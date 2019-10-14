package de.gedoplan.seminar.java.exercise.generics;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PrioritizedList<E extends Prioritized> extends AbstractCollection<E> {
  private List<E> elements = new ArrayList<>();

  @Override
  public boolean add(E newElement) {
    int priority = newElement.getPriority();
    int insertPos = this.elements.size();
    ListIterator<E> iterator = this.elements.listIterator(insertPos);
    while (true) {
      if (!iterator.hasPrevious()) {
        insertPos = 0;
        break;
      }
      E oldElement = iterator.previous();
      if (oldElement.getPriority() <= priority) {
        break;
      }

      --insertPos;
    }

    this.elements.add(insertPos, newElement);
    return true;
  }

  @Override
  public Iterator<E> iterator() {
    return this.elements.iterator();
  }

  @Override
  public int size() {
    return this.elements.size();
  }

}
