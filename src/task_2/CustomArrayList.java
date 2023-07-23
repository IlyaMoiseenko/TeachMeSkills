package task_2;

import task_2.interfaces.CustomList;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private T[] elements;
    private final int DEFAULT_SIZE = 10;
    private int pointer = 0;

    public CustomArrayList() {
        this.elements = (T[]) new Object[DEFAULT_SIZE];
    }

    public CustomArrayList(int size) {
        this.elements = (T[]) new Object[size];
    }

    @Override
    public void add(T element) {
        if (pointer == elements.length) {
            elements = Arrays.copyOf(this.elements, this.elements.length + DEFAULT_SIZE);
        }

        elements[pointer++] = element;
    }

    @Override
    public boolean remove(T element) {
        if (element == null)
            return false;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                deleteElement(i + 1);
                return true;
            }
        }

        return false;
    }

    private void deleteElement(int index) {
        for (int i = index; i < elements.length; i++) {
            elements[i - 1] = elements[i];
        }
    }

    @Override
    public T get(int index) {
        checkIndexOutOfBounds(index);
        return elements[index];
    }

    private void checkIndexOutOfBounds(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.length);
        }
    }

    @Override
    public boolean contains(T element) {
        for (T t : elements) {
            if (element.equals(t))
                return true;
        }

        return false;
    }

    @Override
    public void clear() {
        elements = (T[]) new Object[DEFAULT_SIZE];
        pointer = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
