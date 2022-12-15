public class Main {
    public static void main(String[] args) {
        int initialScore = 100;
        int addMoney = 1050;
        int priceBonus = 100;
        int totalBonus = addMoney / priceBonus;
        int totalScore = initialScore;

        if (addMoney > 1000) {
            totalScore = initialScore + addMoney + totalBonus;
        } else {
            totalScore = initialScore + addMoney;
            totalBonus = 0;
        }
        System.out.println("Начальный баланс счета: " + initialScore);
        System.out.println("Сумма пополнения счета: " + addMoney);
        System.out.println("Бонус: " + totalBonus);
        System.out.println("Итоговая сумма счета: " + totalScore);

        }
}

