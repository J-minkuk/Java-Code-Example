package java8.time;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class LocalDateTest {

    private static final LocalDate nowDate = LocalDate.now();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Now : " + nowDate);
        System.out.println("Min : " + LocalDate.MIN);
        System.out.println("Max : " + LocalDate.MAX);
        System.out.println();

        System.out.println("Day of Month : " + nowDate.getDayOfMonth());
        System.out.println("Day of Year : " + nowDate.getDayOfYear());
        System.out.println("Day of Week : " + nowDate.getDayOfWeek());
        System.out.println();

        System.out.println("Month Value : " + nowDate.getMonth());
        System.out.println("Month : " + nowDate.getMonthValue());
        System.out.println("Year : " + nowDate.getYear());
        System.out.println();

        System.out.println("1992-10-10 : " + LocalDate.of(1992, 10, 10));
        System.out.println("Before 1 Day : " + nowDate.minusDays(1));
        System.out.println("After 1 Day : " + nowDate.plusDays(1));
    }

    @Test
    public void test() {
        Assert.assertEquals(nowDate.getYear(), 2019);
    }

}
