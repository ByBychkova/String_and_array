package ru.netology.javaqa.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int sum = service.salesVolume(sale);
        System.out.println("Cумма всех продаж " + (sum));

        System.out.println("Средняя сумма продаж в месяц "+ (sum / sale.length));
        }
    }