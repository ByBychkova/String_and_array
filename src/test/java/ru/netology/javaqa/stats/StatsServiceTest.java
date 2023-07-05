package ru.netology.javaqa.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StatsServiceTest {

 @Test
    public void sumSale() {
     StatsService service= new StatsService();
     int [] sales = {65, 45,7,1,3,45,83,67,86,23,98,53,75};
     int expectedSum = 651;
     int actualSum = service.salesVolume(sales);
     Assertions.assertEquals(expectedSum, actualSum);
 }
}
