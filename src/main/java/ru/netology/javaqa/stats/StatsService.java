package ru.netology.javaqa.stats;


public class StatsService {
    public int salesVolume(int[] sales) {
       int sum = 0;

        for (int sale : sales){
            sum= sum + sale;
        }
        return sum;
    }
}
