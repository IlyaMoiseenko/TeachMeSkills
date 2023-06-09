package task_4;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("375333324907", "iPhone 12 Pro Max", 21);
        Phone phone2 = new Phone("375293312672", "Samsung Galaxy S21");
        Phone phone3 = new Phone("375446173409", "iPhone 14 Pro");

        System.out.println(
                phone1.GetNumber() + " " + phone1.GetModel() + " " + phone1.GetWeight()
        );
        System.out.println(
                phone2.GetNumber() + " " + phone2.GetModel() + " " + phone2.GetWeight()
        );
        System.out.println(
                phone3.GetNumber() + " " + phone3.GetModel() + " " + phone3.GetWeight()
        );

        System.out.println("-----");

        phone1.ReceiveCall("Ilya");
        phone2.ReceiveCall("Marina");
        phone3.ReceiveCall("Alina");

        System.out.println("------");

        phone1.ReceiveCall("Ilya", "375333324907");
        phone2.ReceiveCall("Marina", "375293312672");
        phone3.ReceiveCall("Alina", "375446173409");

        System.out.println("------");

        phone1.SendMessage("375333324907", "375293312672", "375446173409");
        phone2.SendMessage("375333324907", "375293312672", "375446173409");
        phone3.SendMessage("375333324907", "375293312672", "375446173409");
    }
}
