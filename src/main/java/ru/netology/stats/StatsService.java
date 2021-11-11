package ru.netology.stats;

public class StatsService {

    public int theSumOfAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSumSales(int[] sales) {

        return theSumOfAllSales(sales) / sales.length;

    }

    public int maxSales(long[] sales) {
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

    public int numberMonthsSalesBelowAverage(int[] sales) {
        int average = averageSumSales(sales);
        int belowMounts = 0;
        for (int sale : sales) {
            if (sale < average) {
                belowMounts = belowMounts + 1;
            }

        }
        return belowMounts;
    }

    public int numberMonthsSalesAboveAverage(int[] sales) {
        int average = averageSumSales(sales);
        int belowMounts = 0;
        for (int sale : sales) {
            if (sale > average) {
                belowMounts = belowMounts + 1;
            }

        }
        return belowMounts;
    }

}







