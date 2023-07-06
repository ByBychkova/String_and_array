package ru.netology.javaqa.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.salesVolume(sales);
        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void amountOfSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum1 = 15;
        int actualSum1 = service.averageAmountOfSalesPerMonth(sales);
        Assertions.assertEquals(expectedSum1, actualSum1);
    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxMonthSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void minMonSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void month() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 7;
        int actualMonth = service.monthOfSalesBelowAverage(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void month1() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth1 = 7;
        int actualMonth1 = service.monthOfSalesBelowAverage(sales);
        Assertions.assertEquals(expectedMonth1, actualMonth1);
    }
}
