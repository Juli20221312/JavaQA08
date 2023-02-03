import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldFindFullSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        long actualAmount = service.fullSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);

    }

    @Test
    public void shouldFindAverSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 15;
        long actualAmount = service.averSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 8;
        long actualAmount = service.maxSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 9;
        long actualAmount = service.minSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindAmountMonthUnderAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 5;
        long actualAmount = service.amountMonthUnderAverageSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindAmountMonthOverAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 16, 13, 16, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 7;
        long actualAmount = service.amountMonthOverAverageSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }
}
