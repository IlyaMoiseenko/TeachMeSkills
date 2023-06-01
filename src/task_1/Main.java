package task_1;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(200);
        CreditCard card2 = new CreditCard(500);
        CreditCard card3 = new CreditCard(1000);

        card1.AddAmount(100);
        card2.AddAmount(100);
        card3.WithdrawMoney(500);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }
}