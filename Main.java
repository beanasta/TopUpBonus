public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; // исходный баланс

        int topUp = 1002; // сумма пополнения

        int bonus; // бонус за пополнение

        if (topUp >= 1001) {
            bonus = topUp / 100;

        } else {
            bonus = 0;
        }

        int finalBalance = initialBalance + topUp + bonus;

        System.out.println("Сумма бонусов составила:" + bonus);
        System.out.println("Итоговый баланс с учетом бонусов:" + finalBalance);

    }

}
