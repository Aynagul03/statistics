package ru.netology.stats;

import java.util.ArrayList;

public class StatsService {
    public int Sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int MinSales(int[] sales) {
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


    public int AverageAmount(int[] sales) {
        int months = 12;
        int sumSales = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        int averageAmount = sumSales / months;
        return averageAmount;
    }

    public int MaxSales(int[] sales) {
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

    public ArrayList<Integer> amountMonthslowerAverageAmount(int[] sales) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < 15) {
                result.add(sales[i]);
            }
        }

        return result;
    }

    public ArrayList<Integer> amountMonthsUpAverageAmount(int[] sales) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > 15) {
                result.add(sales[i]);
            }
        }

        return result;
    }
}


