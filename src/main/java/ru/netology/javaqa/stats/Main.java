package ru.netology.javaqa.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int sum = service.salesVolume(sale);
        System.out.println("Cумма всех продаж " + (sum));

        System.out.println("Средняя сумма продаж в месяц " + (sum / sale.length));

        int maxMonth = service.getMaxMonthSales(sale);
        System.out.println("Месяц, в котором был пик продаж " + (maxMonth));

        int minMonth = service.minSales(sale);
        System.out.println("Месяц, в котором был минимум продаж " + (minMonth));

        int month1 = service.monthOfSalesBelowAverage(sale);
        System.out.println("Месяцев в которых продажи были ниже среднего " + (month1));

        int month2 = service.salesAboveAverage(sale);
        System.out.println("Месяцев в которых продажи были выше среднего" + (month2));
    }
}