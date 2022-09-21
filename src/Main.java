public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1:");

        byte clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("В задаче только две ОС, не балуйся");
        }

        //Задание 2
        System.out.println("\nЗадание 2:");

        short clientDeviceYear = 2010;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("В этой задаче все те же две ОС, не балуйся");
        }

        //Задание 3
        System.out.println("\nЗадание 3:");

        int year = 2022;
        int every4 = year % 4;
        int every100 = year % 100;
        int every400 = year % 400;

        if (every400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (every100 == 0) {
            System.out.println(year + " год не является високосным.");
        } else if (every4 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        //Задание 4
        System.out.println("\nЗадание 4:");

        int deliveryDistance = 95;
        int deliveryDays = 1 + ((deliveryDistance - 20) / 40);
        int oneMoreDay = (deliveryDistance - 20) % 40;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день.");
        } else if (oneMoreDay == 0) {
                System.out.println("Потребуется дней: " + deliveryDays);
        } else {
                System.out.println("Потребуется дней: " + (deliveryDays + 1));
        }

        //Задание 5
        System.out.println("\nЗадание 5:");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        //Задание 6
        System.out.println("\nЗадание 6:");

        int age6 = 19;
        int salary6 = 58_000;
        int limit;

        if (age6 >= 23) {
            limit = salary6 * 3;
        } else {
            limit = salary6 * 2;
        }

        if (salary6 >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit * 1.5 + " рублей");
        } else if (salary6 >= 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit * 1.2 + " рублей");
        } else {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
        }

        //Задание 7
        System.out.println("\nЗадание 7:");

        int age7 = 25;
        int salary7 = 60_000;
        int wantedSum = 330_000;

        int maxMonthlyPayment = salary7 / 2;
        float loanRate = 10F;

        if (age7 < 23) {
            loanRate += 1;
        } else if (age7 < 30) {
            loanRate += 0.5;
        }

        if (salary7 > 80_000) {
            loanRate -= 0.7;
        }

        double monthlyRate = loanRate / 1200;
        double tempValue = monthlyRate / (1 - pow(monthlyRate+1, -12));
        float monthlyPayment = (float) (wantedSum * tempValue);

        String loanApprovedOrDenied;

        if (maxMonthlyPayment > monthlyPayment) {
            loanApprovedOrDenied = "Кредит одобрен.";
        } else {
            loanApprovedOrDenied = "В кредите отказано.";
        }

        System.out.println("Максимальный платеж при ЗП " + salary7 + " равен " + maxMonthlyPayment + " рублей." +
                " Платеж по кредиту " + monthlyPayment + " рублей. " + loanApprovedOrDenied);

    }

    public static double pow(double value, int powValue) {
        return Math.pow(value, powValue);
    }
}