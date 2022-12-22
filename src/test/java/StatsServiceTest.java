import org.example.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void shouldFindMinMonth () {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMaxMonth () {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};

        long expected = 6;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumAllSales () {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.sumOfAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void middleNumber () {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.middleNumberOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void monthsBelowMiddle () {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.belowMiddle(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void monthsMoreThanMiddle () {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.moreMiddle(sales);

        Assertions.assertEquals(expected, actual);
    }

}
