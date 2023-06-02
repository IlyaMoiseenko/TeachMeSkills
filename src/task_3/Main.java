package task_3;

public class Main {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(25, 15, 40);
        System.out.println(cashMachine.WithdrawMoney(1500));
    }
}
