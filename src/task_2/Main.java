package task_2;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(1500, "King 1");
        System.out.println(computer);

        HDD hdd = new HDD("HDD", 500, "Internal");
        RAM ram = new RAM("RAM", 8);
        Computer computer1 = new Computer(ram, hdd, 1500, "King 2");
        System.out.println(computer1);
    }
}
