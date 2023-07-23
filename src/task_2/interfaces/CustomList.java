package task_2.interfaces;

public interface CustomList<T> {
    // add, remove, getByIndex, contains, clear
    void add(T element);
    boolean remove(T element);
    T get(int index);
    boolean contains(T element);
    void clear();
}
