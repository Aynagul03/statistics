package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.sum(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSales() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.minSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
        }

    @Test
    public void averageAmount() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.averageAmount(sales);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSales() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.maxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountMonthsLowerAverageAmount() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.amountMonthsLowerAverageAmount(sales);
        int expected = 5;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void amountMonthsUpAverageAmount() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.amountMonthsUpAverageAmount(sales);
        int expected = 5;

        Assertions.assertEquals(expected,actual);
    }
}


