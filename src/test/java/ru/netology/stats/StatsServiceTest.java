package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSumOfAllSales() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.theSumOfAllSales(enterpriseSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAverageSumSales() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSumSales(enterpriseSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void showMonthWithMaxSales() {
        StatsService service = new StatsService();

        long[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(enterpriseSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void showMonthWithMinSales() {
        StatsService service = new StatsService();

        long[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(enterpriseSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void showAmountMonthBelowAverage() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberMonthsSalesBelowAverage(enterpriseSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void showAmountMonthAboveAverage() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberMonthsSalesAboveAverage(enterpriseSales);
        assertEquals(expected, actual);
    }

}
