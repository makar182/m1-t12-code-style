import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        menu();
    }

    static double calculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);

        return pow (pay, 2);
    }

    static double calculateSimplePercent(double doubleAmount, double double_year_rate, int deposit_period) {
        return pow(doubleAmount+doubleAmount * double_year_rate * deposit_period, 2);
    }

    static double pow(double value, int places) {
        double scale = Math.pow(10, places);

        return Math.round(value * scale) / scale;
    }

    static void menu() {
        int period;
        int action;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:");

        int amount = scanner.nextInt();

        System.out.println("Введите срок вклада в годах:");

        period = scanner.nextInt();

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");

        action = scanner.nextInt();

        double finalAmount = 0.0;

        if (action == 1) {
            finalAmount = calculateSimplePercent(amount, 0.06, period);
        }
        else if (action == 2) {
            finalAmount = calculateComplexPercent(amount, 0.06, period);
        }

        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + finalAmount);
    }
}
