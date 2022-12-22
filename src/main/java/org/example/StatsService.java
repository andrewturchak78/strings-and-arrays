package org.example;

import java.util.Arrays;

public class StatsService {

    public int minSales(long[] sales) {
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

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int sumOfAllSales(long[] sales) {
        int sum = 0;
        for (long amount : sales) {
            sum += amount;
        }
        return sum;
    }

    public int middleNumberOfSales(long[] sales) {
        int sum = 0;
        for (long amount : sales) {
            sum += amount;
        }
        return sum / sales.length;
    }

    public int belowMiddle(long[] sales) {
        int sum = 0;
        for (long amount : sales) {
            sum += amount;
        }
        int middle = sum / sales.length;
        int months = 0;
        for (long sale : sales) {
            if (sale < middle) {
                months++;
            }
        }
        return months;
    }

    public int moreMiddle(long[] sales) {
        int sum = 0;
        for (long amount : sales) {
            sum += amount;
        }
        int middle = sum / sales.length;
        int months = 0;
        for (long sale : sales) {
            if (sale > middle) {
                months++;
            }
        }
        return months;
    }
}
