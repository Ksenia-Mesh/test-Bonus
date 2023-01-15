public class Main {
    public static void main(String[] args) {

        int account = 1000;
        int depositAmount = 600;

        int bonus = 0;
        if (depositAmount > 0) {
            if (depositAmount > 1000) {
                bonus = depositAmount / 100;
            }
            account = account + bonus + depositAmount;
            System.out.println("Баланс Вашего счета: " + account + " рублей, в том числе бонусов: " + bonus);
        }
    }
}

