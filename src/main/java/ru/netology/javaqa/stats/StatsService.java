package ru.netology.javaqa.stats;


public class StatsService {
    public int salesVolume(int[] sales) {
        int sum = 0;

        for (int sale : sales) {
            sum = sum + sale;
        }

        return sum;

    }

    public int averageAmountOfSalesPerMonth(int[] sales) {
        int sum = 0;

        for (int sale : sales) {
            sum = sum + sale;
        }

        return sum / sales.length;
    }

    public int getMaxMonthSales(int[] sales) {
        int maxMonth = 0;
        int mont = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = mont;
            }
            mont = mont + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthOfSalesBelowAverage(int[] sales) {
        int month1 = 0;
        int sum = averageAmountOfSalesPerMonth(sales);
        for (int sale : sales) {
            if (sale <= sum) {
                month1++;
            }
        }
        return month1;
    }

    public int salesAboveAverage(int[] sales) {
        int month2 = 0;
        int sum = averageAmountOfSalesPerMonth(sales);
        for (int sale : sales) {
            if (sale >= sum) {
                month2++;
            }
        }
        return month2;
    }
}


