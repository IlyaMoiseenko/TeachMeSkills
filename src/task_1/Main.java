package task_1;

import task_1.Abstractions.Figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[] {
                new Circle("Circle1", 22),
                new Circle("Circle2", 13),
                new Rectangle("Rectangle1", 15, 32),
                new Rectangle("Rectangle2", 54, 18),
                new Triangle("Triangle1", 12, 12,12),
        };


        System.out.println(GetSum(figures));
    }

    public static double GetSum(Figure[] figures) {
        double sum = 0;

        for (Figure figure : figures)
            sum += figure.GetArea();

        return sum;
    }
}
