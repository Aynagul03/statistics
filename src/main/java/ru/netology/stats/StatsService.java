package ru.netology.stats;
public class StatsService {
    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int averageAmount(int[] sales) {
        int months = 12;
        int sumSales = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        int averageAmount = sumSales / months;
        return averageAmount;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int amountMonthsLowerAverageAmount(int[] sales) {
        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < 15) {
                result++;
            }
        }

        return result;
    }

    public int amountMonthsUpAverageAmount(int[] sales) {
        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > 15) {
                result++;
            }
        }

        return result;
    }
}



