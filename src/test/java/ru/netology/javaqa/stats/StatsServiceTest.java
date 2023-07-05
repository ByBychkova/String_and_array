package ru.netology.javaqa.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StatsServiceTest {

 @Test
    public void sumSale() {
     StatsService service= new StatsService();
     int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
     int expectedSum = 180;
     int actualSum = service.salesVolume(sales);
     Assertions.assertEquals(expectedSum, actualSum);

 }
@Test
 public void AmountOfSalesPerMonth(){
 StatsService service= new StatsService();
 int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
 int expectedSum1 =15;
 int actualSum1 = service.averageAmountOfSalesPerMonth(sales);
 Assertions.assertEquals(expectedSum1, actualSum1);
}

}
