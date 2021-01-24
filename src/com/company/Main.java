package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        practicalTaskNo1();
        practicalTaskNo2();
        practicalTaskNo3();
        practicalTaskNo4();
        practicalTaskNo5();
    }

    static void practicalTaskNo1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Create your first variable: ");
        short valueOne = input.nextShort();
        System.out.println("Create your second variable: ");
        short valueTwo = input.nextShort();
        if (valueOne > valueTwo) {
            System.out.println("First variable " + valueOne + " is the largest variable.");
            System.out.println("Second variable " + valueTwo + " is the smallest variable.");
        }
        if (valueOne < valueTwo) {
            System.out.println("Second variable " + valueTwo + " is the largest variable.");
            System.out.println("First variable " + valueOne + " is the smallest variable.");
        }
        System.out.println(valueOne + " and " + valueTwo + (valueOne != valueTwo ? " aren't equal." : " are equal."));
        System.out.println("First variable is " + (valueOne % 2 == 0 ? "even." : "uneven."));
        System.out.println("Second variable is " + (valueTwo % 2 == 0 ? "even." : "uneven."));
        System.out.println("First variable is " + (valueOne > 0 ? "positive." : "negative."));
        System.out.println("Second variable is " + (valueTwo > 0 ? "positive." : "negative."));
        System.out.println("First variable is " + (valueOne < 100 ? "less than 100." : "more than 100."));
        System.out.println("Second variable is " + (valueTwo < 100 ? "less than 100." : "more than 100."));
    }

    static void practicalTaskNo2() {
        Scanner input = new Scanner(System.in);
        System.out.println("What time is it? Please answer with whole numbers!");
        int time = input.nextInt();
        if (time <= 12 && time >= 6) {
            System.out.println("Good Morning, Sunshine!");
        }
        if (time >= 13 && time <= 19) {
            System.out.println("Good Afternoon! Work hard!");
        }
        if (time >= 20 && time <= 24) {
            System.out.println("Good evening! Get some rest!");
        }
    }

    static void practicalTaskNo3() {
        int day = 25;
        int month = 1;
        int year = 2021;
        if (day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1000 && year <= 2030) {
            System.out.println(year + "/" + month + "/" + day);
        } else {
            System.out.println("Information about date isn't correct.");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please write the day: ");
        int userDay = input.nextInt();
        System.out.println("Please write the month: ");
        int userMonth = input.nextInt();
        System.out.println("Please write the year: ");
        int userYear = input.nextInt();
        System.out.println("Please select the date formatting. 1 - YYYY/MM/DD, 2 - YYYY.MM.DD: ");
        int userDateFormat = input.nextInt();
        System.out.println((userDateFormat == 1) ? userYear + "/" + userMonth + "/" + userDay : userYear + "." + userMonth + "." + userDay);

    }

    static void practicalTaskNo4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Year you're interested in: ");
        int userYear = input.nextInt();
        System.out.println("The day number is: ");
        int userDay = input.nextInt();
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.YEAR, userYear);
        cal.set(Calendar.DAY_OF_YEAR, userDay);
        int month = cal.get(Calendar.MONTH);
        String userMonth;
        if (month == 0) {
            userMonth = "January";
        } else if (month == 1) {
            userMonth = "February";
        } else if (month == 2) {
            userMonth = "March";
        } else if (month == 3) {
            userMonth = "April";
        } else if (month == 4) {
            userMonth = "May";
        } else if (month == 5) {
            userMonth = "June";
        } else if (month == 6) {
            userMonth = "July";
        } else if (month == 7) {
            userMonth = "August";
        } else if (month == 8) {
            userMonth = "September";
        } else if (month == 9) {
            userMonth = "October";
        } else if (month == 10) {
            userMonth = "November";
        } else {
            userMonth = "December";
        }
        System.out.println("It is: " + userMonth);
    }

    static void practicalTaskNo5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write you working hours: ");
        int workingHoursInDay = input.nextInt();
        if (workingHoursInDay > 0 && workingHoursInDay <= 24) {
            System.out.println("Working hours are correct.");
        } else {
            System.out.println("Working hours are incorrect.");
        }
        int sal = 8 * 10;

        if (workingHoursInDay <= 8 && workingHoursInDay > 0) {
            System.out.println("Your salary will be " + workingHoursInDay * 10 + " eur.");
        }
        if (workingHoursInDay > 8) {
            System.out.println("Your salary will be " + (sal + ((workingHoursInDay - 8) * 15)) + " eur.");
        }

    }

}

