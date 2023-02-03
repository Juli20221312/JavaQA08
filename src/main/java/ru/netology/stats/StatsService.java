package ru.netology.stats;

public class StatsService {
    public long fullSales(long[] sales) {
        long allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            allSales = allSales + sales[i];
        }
        return allSales;
    }

    public long averSales(long[] sales) {
        long averageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSales = averageSales + sales[i];
        }
        return averageSales / sales.length;
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

    public long amountMonthUnderAverageSales(long[] sales) {
        long amountUnderAverageSales = 0;
        long averageMonthSales = averSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageMonthSales) {
                amountUnderAverageSales = amountUnderAverageSales + 1;
            }
        }
        return amountUnderAverageSales;
    }


    public long amountMonthOverAverageSales(long[] sales) {
        long amountOverAverageSales = 0;
        long averageMonthSales = averSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageMonthSales) {
                amountOverAverageSales = amountOverAverageSales + 1;
            }
        }
        return amountOverAverageSales;
    }
}
