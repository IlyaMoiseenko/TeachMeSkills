package task_2;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private final List<String> students;

    public Application() {
        students = createListOfStudents();
    }

    private List<String> createListOfStudents() {
        List<String> students = new ArrayList<>();

        students.add("Ilya");
        students.add("Ilya");
        students.add("Marina");
        students.add("Ilya");
        students.add("Egor");
        students.add("Lena");
        students.add("Natasha");
        students.add("Olya");
        students.add("Anya");
        students.add("Alena");

        return students;
    }

    public void start() {
        countStudentsWithName("ILYA");
        namesStartWith("a");
        sort();
    }

    private void countStudentsWithName(String name) {
        System.out.print("Count students with name " + name + ": ");
        System.out.println(
                students.stream()
                        .filter(s -> s.toLowerCase().equals(name.toLowerCase()))
                        .count()
        );
    }

    private void namesStartWith(String prefix) {
        System.out.print("Names start with " + prefix + ": ");
        List<String> namesStartWith = students.stream()
                .filter(s -> s.toLowerCase().startsWith(prefix)).toList();

        System.out.println(namesStartWith);
    }

    private void sort() {
        System.out.print("Sorted: ");
        String name = students.stream().sorted().findFirst().orElse("Empty");

        System.out.println(name);
    }
}
