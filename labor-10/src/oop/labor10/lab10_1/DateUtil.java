package oop.labor10.lab10_1;

public class DateUtil {

    public static boolean leapYear(int year) {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        return isLeapYear;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (day <= 0 || month <= 0 || year <= 0)
            return false;
        if (month > 12 || day > 31 || year > 2022)
            return false;
        switch (day) {
            case 29: {
                if (leapYear(year) == false && month == 2) {
                    return false;
                }
                break;
            }
            case 30: {
                if (month == 2) {
                    return false;
                }
                break;
            }
            case 31: {
                if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
                    return false;
                }
                break;
            }
        }
        return true;
    }
}
