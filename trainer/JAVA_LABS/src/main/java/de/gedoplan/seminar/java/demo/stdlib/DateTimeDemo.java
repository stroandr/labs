package de.gedoplan.seminar.java.demo.stdlib;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeDemo {

  public static void main(String[] args) {
    dateDemo();
    calendarDemo();
    localDateDemo();
  }

  public static void dateDemo() {
    Date date = new Date();
    System.out.println(date.getTime());

    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
    System.out.println(dateFormat.format(date));
  }

  public static void calendarDemo() {
    Calendar calendar = new GregorianCalendar();
    calendar.setTime(new Date());
    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
    System.out.println(dateFormat.format(calendar.getTime()));
    calendar.set(Calendar.YEAR, 2015);
    calendar.set(Calendar.MONTH, Calendar.AUGUST);
    System.out.println(dateFormat.format(calendar.getTime()));
  }

  public static void localDateDemo() {
    LocalDateTime localDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    System.out.println(localDateTime.format(formatter));
    localDateTime = localDateTime.withYear(2015).withMonth(Month.AUGUST.getValue());
    System.out.println(localDateTime.format(formatter));
    System.out.println(localDateTime.plusHours(5).format(formatter));
  }
}
