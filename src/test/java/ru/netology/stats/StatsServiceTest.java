package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

        ArrayList<Integer> actual = manager.amountMonthslowerAverageAmount(sales);
        List<Integer> expected = asList(8, 13, 7, 14, 14);

        assertTrue(actual.equals(expected));
    }

    @Test
    public void amountMonthsUpAverageAmount() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        ArrayList<Integer> actual = manager.amountMonthsUpAverageAmount(sales);
        List<Integer> expected = asList(17, 20, 19, 20, 18);

        assertTrue(actual.equals(expected));
    }
}


