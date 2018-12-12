package java8.time;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeTest {

  private static final LocalDateTime nowDateTime = LocalDateTime.now();

  @BeforeClass
  public static void beforeClass() {
    System.out.println("Now : " + nowDateTime);
    System.out.println("Min : " + LocalDateTime.MIN);
    System.out.println("Max : " + LocalDateTime.MAX);
    System.out.println();

    System.out.println("Now to Date : " + nowDateTime.toLocalDate());
    System.out.println("Now to Time : " + nowDateTime.toLocalTime());
    System.out.println();

    System.out.println("1992-10-10T00:00 : " + LocalDateTime.of(LocalDate.of(1992, 10, 10),
            LocalTime.of(0, 0, 0)));
    System.out.println("Set Year : " + nowDateTime.withYear(2019));
    System.out.println();

    LocalDateTime standardDate = getStandardDateTime();
    System.out.println("Standard Date : " + standardDate);
    DateTimeFormatter formatter = getSimpleDateTimeFormatter();
    System.out.println("DateTimeFormatter : " + standardDate.format(formatter) + " 기준");
    System.out.println();

    System.out.println("- 기준일 01월 01일 : " + standardDate.with(TemporalAdjusters.firstDayOfYear()));
    System.out.println("- 기준일 12월 31일 : " + standardDate.with(TemporalAdjusters.lastDayOfYear()));
    System.out.println("- 기준일 다음 해 01월 01일 : " + standardDate.with(TemporalAdjusters.firstDayOfNextYear()));
    System.out.println("- 기준일 해당 달 01일 : " + standardDate.with(TemporalAdjusters.firstDayOfMonth()));
    System.out.println("- 기준일 해당 달 마지막 일 : " + standardDate.with(TemporalAdjusters.lastDayOfMonth()));
    System.out.println("- 기준일 다음달 01일 : " + standardDate.with(TemporalAdjusters.firstDayOfNextMonth()));
    System.out.println("- 기준일 해당달 첫 번쨰 월요일 : " + standardDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
    System.out.println("- 기준일 해당달 마지막 금요일 : " + standardDate.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)));
    System.out.println("- 기준일 다음 금요일 : " +standardDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
    System.out.println("- 기준일 다음 금요일(당일 포함) : " + standardDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)));
    System.out.println("- 기준일 이전 금요일 : " + standardDate.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
    System.out.println("- 기준일 이전 금요일(당일 포함) : " + standardDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY)));
  }

  private static LocalDateTime getStandardDateTime() {
    return LocalDate.of(2018, 10, 10).atStartOfDay();
  }

  private static DateTimeFormatter getSimpleDateTimeFormatter() {
    return DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
  }

  @Test
  public void test_Period1() {
    LocalDate standardDate = LocalDate.of(2018, 10, 10);
    LocalDate compareDate = LocalDate.of(2018, 10, 11);

    Period period = standardDate.until(compareDate);
    Assert.assertEquals(period.getDays(), 1);
  }


}
