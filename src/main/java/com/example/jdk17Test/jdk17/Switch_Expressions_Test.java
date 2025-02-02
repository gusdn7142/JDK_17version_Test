package com.example.jdk17Test.jdk17;

public class Switch_Expressions_Test {
    public static void main(String[] args) {

        String toDay = "SATURDAY";

        //1) 기존 방식의 Switch 문
        boolean isTodayHoliday;
        switch (toDay) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                isTodayHoliday = false;
                break;
            case "SATURDAY":
            case "SUNDAY":
                isTodayHoliday = true;
                break;
            default:
                throw new IllegalArgumentException("Invalid toDay: " + toDay);
        }
        System.out.println("Switch's isTodayHoliday : " + isTodayHoliday);

        //2) Switch Expressions
        boolean isTodayHoliday2 = switch (toDay) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
            case "SATURDAY", "SUNDAY" -> true;
            default -> throw new IllegalArgumentException("Invalid toDay: " + toDay);
        };
        System.out.println("Switch Expressions isTodayHoliday2 : " + isTodayHoliday2);

    }
}
