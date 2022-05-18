package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.Sum(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSales() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.MinSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
        }

    @Test
    public void AverageAmount() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.AverageAmount(sales);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSales() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.MaxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountMonthslowerAverageAmount() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.amountMonthslowerAverageAmount(sales);
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


