//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int start = 15; //сумма на счете
        int amount = 900; //пополняемая сумма
        int bonus = amount / 100; //сумма бонусов

        if (amount < 1000) {
            bonus = 0;
        }

        int finish = start + amount + bonus;

        System.out.println("Ваша сумма на счете: " + finish);

    }
}